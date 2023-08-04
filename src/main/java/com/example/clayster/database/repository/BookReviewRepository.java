package com.example.clayster.database.repository;

import com.example.clayster.database.model.BookReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewRepository extends JpaRepository<BookReview, Long> {
}
