import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeeComponent } from './employee.component';
import { ModifyEmployeeComponent } from './modify-employee/modify-employee.component';
import { RemoveEmployeeComponent } from './remove-employee/remove-employee.component';


const routes: Routes = [
    { path: 'add-employee', component: AddEmployeeComponent },
    { path: 'modify-employee', component: ModifyEmployeeComponent },
    { path: 'remove-employee', component: RemoveEmployeeComponent },
    { path: '', component: EmployeeComponent}
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
  })
  export class EmpRoutingModule { }