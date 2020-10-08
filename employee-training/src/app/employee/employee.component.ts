import { Component, OnInit } from '@angular/core';

import { EmployeeService } from '../service/employee.service';


@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  columnDefs = [

    {field: 'emp_id'},
    {field: 'emp_name'},
    {field: 'city'},
    {field: 'contact_number'},
    {field: 'emailAddress'},
    {field: 'dob'}
];

constructor( private empService: EmployeeService)
{

}
httpdata;
ngOnInit()
{

  this.empService.getEmployee().subscribe((data) => this.httpdata = data);
}

}