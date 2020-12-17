import { Component, OnInit } from '@angular/core';
import { BookService } from '../../service/BookService';

@Component({
  selector: 'app-book-nav',
  templateUrl: './book-nav.component.html',
  styleUrls: ['./book-nav.component.css']
})
export class BookNavComponent implements OnInit {

  constructor(private bookService: BookService) { }

  books: [];

  selectedBooks = {
    books: []
  };

  ngOnInit(): void {
  this.bookService.findAllBooks()
     .then(books => this.books = books);
  }
/*
  selectBook(book = never) {
  this.selectedBooks = book;
}
*/
}
