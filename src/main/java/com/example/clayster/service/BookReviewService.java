package com.example.clayster.service;

import com.example.clayster.database.model.Book;
import com.example.clayster.database.model.BookReview;
import com.example.clayster.database.repository.BookRepository;
import com.example.clayster.database.repository.BookReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BookReviewService {

    private final BookRepository bookRepository;

    public BookReviewService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookReview> getAllTheReviews(String bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        if (book.isPresent()) {
            return book.get().getReviews();
        } else {
            //log.info("The book you are looking for cannot be found.\n");
            return Collections.emptyList();
        }
    }
}
