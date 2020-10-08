
import { HttpClient } from '@angular/common/http'
import {Employee} from '../model/employee';

import { Injectable } from '@angular/core';

@Injectable()
export class EmployeeService
{
    url = 'http://localhost:8080/employee/';

    constructor(private http: HttpClient)
    {
        
    }
    createEmployee(employee : Employee)
    {
       return this.http.post(this.url + 'save', employee);
    }

    getEmployeeById(id : number)
    {
        return this.http.get<Employee>(this.url + 'id/'+id);
    }

    updateEmployee(employee: Employee)
    {
        return this.http.post(this.url + 'save', employee);
    }

    getEmployee()
    {
       return this.http.get<Employee>(this.url + 'getall');
    }

    deleteEmployee(id : number)
    {
        return this.http.delete(this.url +id);
    }
}