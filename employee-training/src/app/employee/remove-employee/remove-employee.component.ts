import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-remove-employee',
  templateUrl: './remove-employee.component.html',
  styleUrls: ['./remove-employee.component.css']
})
export class RemoveEmployeeComponent implements OnInit {
  employee : FormGroup;
  msg_success : boolean = false;
  msg_fail : boolean = false;

  constructor(private fb : FormBuilder, private empService: EmployeeService,  public router: Router) 
  {  
    this.employee = this.fb.group({
    emp_id : new FormControl('',Validators.required)
    })
  }
  msg()
  {
    this.msg_success = false;
    this.msg_fail = false;
  }
  ngOnInit(): void {
  }
  removeEmployee()
  {
    var id = this.employee.value["emp_id"];
    this.empService.deleteEmployee(id)
        .subscribe(
            ()=> {this.msg_success=true; this.msg_fail=false;},
            (error) => {this.msg_fail=true; this.msg_success=false; }
        );
  }
  cancel()
  {
    this.router.navigate(['']);
  }
}
