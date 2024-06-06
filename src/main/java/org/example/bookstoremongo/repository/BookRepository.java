package org.example.bookstoremongo.repository;

import org.example.bookstoremongo.ds.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
