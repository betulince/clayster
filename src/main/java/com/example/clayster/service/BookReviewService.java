package com.example.clayster.service;

import com.example.clayster.database.model.Book;
import com.example.clayster.database.model.BookReview;
import com.example.clayster.database.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BookReviewService {

    private final BookRepository bookRepository;

    @Autowired
    public BookReviewService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookReview> getAllTheReviews(String bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        if (book.isPresent()) {
            return book.get().getReviews();
        } else {
            return Collections.emptyList();
        }
    }
}
