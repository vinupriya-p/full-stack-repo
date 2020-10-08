import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';

import {MatDialog} from '@angular/material/dialog';

import { DialogBoxComponent } from '../dialog-box/dialog-box.component';
import { Router } from '@angular/router';
import { EmployeeService } from '../../service/employee.service';


@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  employee : FormGroup;

  constructor(private fb : FormBuilder, public dialog: MatDialog,
    public router: Router, private empService : EmployeeService)
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
      this.employee.get('emp_name').setValue((this.employee.get('name').get('first_name').value + " " + this.employee.get('name').get('middle_name').value ).trim()+" "+ this.employee.get('name').get('last_name').value)
    })
  }

  ngOnInit(): void {

  }
  addEmployee()
  {
    this.empService.createEmployee(this.employee.value).subscribe(
      (response) => this.dialog.open(DialogBoxComponent, 
       { data: { name: "add" }
      }),
      (error) => this.dialog.open(DialogBoxComponent)
    )
  }

  cancel()
  {
    this.router.navigate(['']);
  }
}
