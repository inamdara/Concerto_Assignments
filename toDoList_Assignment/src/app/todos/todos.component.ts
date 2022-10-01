import { Component, OnInit } from '@angular/core';
import { Item } from '../model/item';
import { ItemhttpService } from '../service/itemhttp.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {

  itemForm: Item = {
    id: 0,
    iname: ''
  };

  allitems:Item[]=[]
  constructor(private itemservice:ItemhttpService,
    private router:Router) { }

    ngOnInit(): void {
      this.get();
    } 
    delete(id:number) {
      console.log("Delete id: "+id);
      this.itemservice.delete(id).subscribe({
        next: (data) => {
          this.allitems= this.allitems.filter(_ => _.id != id);        
        },
      });
    }
    get()
    {
      this.itemservice.get().subscribe((data) =>{
        this.allitems=data;
      }
      )
    }
    create(){
      
       this.itemservice.create(this.itemForm)     
       .subscribe({
        next:(data) => {           
          this.get();        
        },
        error:(err) => {
          console.log(err);
        }
      }) 
      this.itemForm.iname='';
     }

}
