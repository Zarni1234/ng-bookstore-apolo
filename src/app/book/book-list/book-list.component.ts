import { Component } from '@angular/core';
import { Apollo } from 'apollo-angular';
import { Book } from '../../book';
import { GET_ALL_BOOKS } from '../../../graphql/graphql.operations';
import { CommonModule } from '@angular/common';
import { BookCardComponent } from "../../book-card/book-card.component";

@Component({
    selector: 'app-book-list',
    standalone: true,
    templateUrl: './book-list.component.html',
    styleUrl: './book-list.component.scss',
    imports: [CommonModule, BookCardComponent]
})
export class BookListComponent {
  title= "Hello"
  books:Book[] = []

  constructor(private apollo:Apollo){

  }
  ngOnInit(): void{
    this.loadAllbooks()
  }
  loadAllbooks(){
    this.apollo.watchQuery<any>({
      query:GET_ALL_BOOKS
    }).valueChanges.subscribe({
      next: result => this.books = result.data?.allBooks,
      error: err => console.log(err),
      complete: () => console.log("Completed!")
    })
  }
}
