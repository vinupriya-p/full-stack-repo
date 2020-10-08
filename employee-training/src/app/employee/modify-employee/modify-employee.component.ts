import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';

import { Router } from '@angular/router';

import {MatDialog} from '@angular/material/dialog';

import { DialogBoxComponent } from '../dialog-box/dialog-box.component';
import { EmployeeService } from '../../service/employee.service';

@Component({
  selector: 'app-modify-employee',
  templateUrl: './modify-employee.component.html',
  styleUrls: ['./modify-employee.component.css']
})
export class ModifyEmployeeComponent implements OnInit {

  display: boolean =false;
  employee : FormGroup;
  
  constructor(private fb : FormBuilder,  
    public dialog: MatDialog, public router: Router, private empService: EmployeeService) 
  { 
    this.employee = this.fb.group({
      emp_id : new FormControl('',Validators.required), 
      name: this.fb.group ({
        first_name: ['',Validators.required],
        middle_name: [''],
        last_name: ['',Validators.required],
      }),
      emp_name: new FormControl ('',Validators.required),
      city :  new FormControl('',Validators.required),
      contact_number :  new FormControl('',Validators.required),
      emailAddress :  new FormControl('',[Validators.required,Validators.email]),
      dob :  new FormControl('',Validators.required)
    })
    this.employee.get('name').valueChanges.subscribe((value) => {
      this.employee.get('emp_name').setValue((this.employee.get('name').get('first_name').value + " " + (this.employee.get('name').get('middle_name').value ? this.employee.get('name').get('middle_name').value : "")).trim()+" "+ this.employee.get('name').get('last_name').value)
    })
  }
  httpData;
  ngOnInit(): void 
  {
  }
  searchEmployee()
  {
    var id = this.employee.value["emp_id"];
    var f_name : String, m_name : String = "", l_name : String;
    
    this.empService.getEmployeeById(id).subscribe(
      (data) => {this.httpData = data ;
      this.employee.patchValue(
      {
        emp_id : this.httpData.emp_id,
        emp_name : this.httpData.emp_name,
        dob : this.httpData.dob,
        emailAddress : this.httpData.emailAddress,
        contact_number : this.httpData.contact_number,
        city : this.httpData.city
        
      });
      var name : String[] = this.employee.value["emp_name"].split(" ");
      if(name.length==3)
      {
        f_name=name[0];
        m_name=name[1];
        l_name=name[2];
      }
      else if(name.length==2)
      {
        f_name=name[0];
        m_name=name[""];
        l_name=name[1];
      }
      this.employee.get('name').patchValue(
        {
          first_name : f_name,
          middle_name : m_name,
          last_name : l_name
        }
      )
    });
    this.display=true;
  }
  modifyEmployee()
  {
    
    this.empService.updateEmployee(this.employee.value).subscribe(
      (response) => this.dialog.open(DialogBoxComponent, 
       { data: { name: "update" }
      }),
      (error) => this.dialog.open(DialogBoxComponent)
    )
  }
  cancel()
  {
    this.router.navigate(['']);
  }
}
