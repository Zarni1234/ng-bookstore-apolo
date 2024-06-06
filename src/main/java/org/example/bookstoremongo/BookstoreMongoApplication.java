package org.example.bookstoremongo;

import lombok.RequiredArgsConstructor;
import org.example.bookstoremongo.ds.Author;
import org.example.bookstoremongo.ds.Book;
import org.example.bookstoremongo.repository.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class BookstoreMongoApplication {

    private final BookRepository bookRepository;
    @Bean @Profile("dev")
    public ApplicationRunner runner(){
        return args -> {
            List.of(new Book(null,"Edwin Drood",
                            30.5,"https://plus.unsplash.com/premium_photo-1683992236967-c3f56fcf23e8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                            LocalDate.now(),new Author("John","William")),
                    new Book(null,"Oliver Twist",
                            30.5,"https://plus.unsplash.com/premium_photo-1691664005895-e095c0138509?q=80&w=1911&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                            LocalDate.now(),new Author("Charles","Dickens")),
                    new Book(null,"Great Expectations",
                            30.5,"https://images.unsplash.com/photo-1596905904987-3dc12d4f0f33?q=80&w=1770&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                            LocalDate.now(),new Author("Charles","Dickens")),
                    new Book(null,"David Copperfield",
                            30.5,"https://images.unsplash.com/photo-1630075907700-e55bcab036de?q=80&w=1770&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                            LocalDate.now(),new Author("Charles","Dickens")),
                    new Book(null,"Our Mutual Friend ",
                            30.5,"https://images.unsplash.com/photo-1648176207371-053ee0adae5f?q=80&w=1770&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                            LocalDate.now(),new Author("Charles","Dickens"))
            ).forEach(bookRepository::save);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(BookstoreMongoApplication.class, args);
    }

}
