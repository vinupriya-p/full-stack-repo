import { Component, OnInit, Inject } from '@angular/core';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dialog-box',
  templateUrl: './dialog-box.component.html',
  styleUrls: ['./dialog-box.component.css']
})
export class DialogBoxComponent implements OnInit {
  add : boolean = false;
  update : boolean = false;
  constructor(public dialogRef: MatDialogRef<DialogBoxComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public router: Router) 
    { 
      if(data.name=="add")
      {
        this.add=true;
      }
      else if(data.name=="update")
      {
        console.log(data);
        this.update=true;
      }
    }

  ngOnInit(): void {
  }
  close(): void {
    this.dialogRef.close();
    this.router.navigate(['']);
    }
}
