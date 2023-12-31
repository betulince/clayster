package com.example.clayster.controller;


import com.example.clayster.database.model.Book;
import com.example.clayster.database.model.BookReview;
import com.example.clayster.service.BookReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/book-reviews")
public class BookReviewController {
    private final BookReviewService bookReviewService;

    @Autowired
    public BookReviewController(BookReviewService bookReviewService) {
        this.bookReviewService = bookReviewService;
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<List<BookReview>> getBookReviews(@PathVariable String bookId) {
        List<BookReview> bookReview = bookReviewService.getAllTheReviews(bookId);
        if (bookReview.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(bookReview);
        }
    }
}
