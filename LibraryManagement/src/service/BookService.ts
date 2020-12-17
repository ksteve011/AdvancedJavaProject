import {Injectable} from '@angular/core';

@Injectable()
export class BookService {
  findAllBooks = () =>
  fetch('http://localhost:8080/api/books')
    .then(response => response.json())
}
