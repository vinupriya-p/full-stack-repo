
import { Component, OnInit } from '@angular/core';
import { EmployeeTrainingService } from '../service/employee-training.service';

@Component({
  selector: 'app-employee-training',
  templateUrl: './employee-training.component.html',
  styleUrls: ['./employee-training.component.css']
})
export class EmployeeTrainingComponent implements OnInit {

  columnDefs = [

    {field: 'emp_id'},
    {field: 'course_id'},
    {field: 'score'},
    {field: 'hours_spent'},
    {field: 'date_completed'},
    {field: 'status'}
  ];

  httpdata;

  constructor(private trainingService: EmployeeTrainingService)
  { 

  }

  ngOnInit(): void 
  {
    this.trainingService.getTrainingDetails()
    .subscribe((data) => this.httpdata = data);
  }

}
