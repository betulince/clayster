package com.example.clayster.controller;

import com.example.clayster.database.model.Book;
import com.example.clayster.database.repository.BookRepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api")
public class BooksController {
    private final BookRepository bookRepository;

    public BooksController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book-details/{bookId}")
    public ResponseEntity<String> getBook(@PathVariable final @NonNull String bookId) {
        Optional<Book> book = bookRepository.findById(bookId).blockOptional();
        if (book.isPresent()) {
            log.info("Getting book with ID: {}", bookId);
            return ResponseEntity.ok(book.get().getBookName());
        } else {
            log.info("Book not found");
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/books/add")
    public Book addNewBook(@RequestBody Book book) {
        log.info("Adding new book to the list");
        return bookRepository.save(book).block();
    }

}
