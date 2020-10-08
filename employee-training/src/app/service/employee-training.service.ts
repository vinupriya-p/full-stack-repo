
import { HttpClient } from '@angular/common/http'

import { Injectable } from '@angular/core';
import { EmployeeTraining } from '../model/employee-training';

@Injectable()
export class EmployeeTrainingService
{
    url = 'http://localhost:8082/employee-training/';

    constructor(private http: HttpClient)
    {
        
    }

    getTrainingDetails()
    {
        return this.http.get<EmployeeTraining>(this.url + 'getall');
    }
}