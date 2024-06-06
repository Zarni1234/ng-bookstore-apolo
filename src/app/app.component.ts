import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Apollo } from 'apollo-angular';
import { GET_ALL_BOOKS } from '../graphql/graphql.operations';
import { Book } from './book';
import { CommonModule } from '@angular/common';
import { NavbarComponent } from "./navbar/navbar.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.scss',
    imports: [RouterOutlet, CommonModule, NavbarComponent]
})
export class AppComponent implements OnInit{
 
 books:Book[] =[]
  
  
  ngOnInit(): void{
  
  }
  constructor(){

  }
  // loadAllbooks(){
  //   this.apollo.watchQuery<any>({
  //     query:GET_ALL_BOOKS
  //   }).valueChanges.subscribe({
  //     next: result => this.books = result.data?.allBooks,
  //     error: err => console.log(err),
  //     complete: () => console.log("Completed!")
  //   })
  // }

}