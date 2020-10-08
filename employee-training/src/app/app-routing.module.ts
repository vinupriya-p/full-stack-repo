import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { EmployeeTrainingComponent } from './employee-training/employee-training.component';


const routes: Routes = [
  { path: '' , redirectTo:'employee', pathMatch: "full"},
  { path: 'employee', loadChildren: () => import('./employee/emp-routing.module').then(m=>m.EmpRoutingModule) },
  { path: 'training',component: EmployeeTrainingComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
