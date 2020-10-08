import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button'
import { MatToolbarModule } from '@angular/material/toolbar'
import { MatSidenavModule } from '@angular/material/sidenav';
import { AgGridModule } from 'ag-grid-angular';
import { EmployeeComponent } from './employee/employee.component';
import { HttpClientModule } from '@angular/common/http';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatInputModule } from '@angular/material/input';
import { AddEmployeeComponent } from './employee/add-employee/add-employee.component';
import { ModifyEmployeeComponent } from './employee/modify-employee/modify-employee.component';
import { RemoveEmployeeComponent } from './employee/remove-employee/remove-employee.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DialogBoxComponent } from './employee/dialog-box/dialog-box.component';
import { MatDialogModule } from '@angular/material/dialog';
import { EmployeeTrainingComponent } from './employee-training/employee-training.component';
import { EmployeeService } from './service/employee.service';
import { EmpRoutingModule } from './employee/emp-routing.module';
import { EmployeeTrainingService } from './service/employee-training.service';



@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    AddEmployeeComponent,
    ModifyEmployeeComponent,
    RemoveEmployeeComponent,
    DialogBoxComponent,
    EmployeeTrainingComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatFormFieldModule,
    MatInputModule,
    MatGridListModule, 
    MatButtonModule,
    MatToolbarModule,
    MatSidenavModule,
    FormsModule, 
    ReactiveFormsModule,
    MatDialogModule,
    EmpRoutingModule,
    AgGridModule.withComponents([])
  ],
  providers: [EmployeeService, EmployeeTrainingService],
  bootstrap: [AppComponent]
})
export class AppModule { }
