package org.example.bookstoremongo.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.bookstoremongo.ds.Book;
import org.example.bookstoremongo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findBookById(String id) {
        return bookRepository.findById(id).get();
    }
}
