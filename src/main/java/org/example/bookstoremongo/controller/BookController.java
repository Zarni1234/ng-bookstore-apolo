package org.example.bookstoremongo.controller;

import lombok.RequiredArgsConstructor;
import org.example.bookstoremongo.ds.Book;
import org.example.bookstoremongo.repository.BookRepository;
import org.example.bookstoremongo.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;


    @QueryMapping
    public List<Book> allBooks(){
        return bookService.findAll();
    }


    @QueryMapping
    public Book getBookById(@Argument String id){
        return bookService.findBookById(id);
    }


}
