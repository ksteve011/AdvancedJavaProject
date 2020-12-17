import { Component, OnInit } from '@angular/core';
import { BookService } from '../../service/BookService';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-book-nav',
  templateUrl: './book-nav.component.html',
  styleUrls: ['./book-nav.component.css']
})
export class BookNavComponent implements OnInit {

  constructor(private bookService: BookService) { }

  userId;
  books: [];

  selectedBooks = {
    books: []
  };

  ngOnInit(): void {
      this.activatedRoute
        .params
        .subscribe (params => this.userId = params['userId'])
    }
/*
  selectBook(book = never) {
  this.selectedBooks = book;
}
*/
}
