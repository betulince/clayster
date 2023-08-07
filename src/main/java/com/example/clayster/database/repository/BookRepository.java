package com.example.clayster.database.repository;

import com.example.clayster.database.model.Book;
import com.example.clayster.database.model.BookReview;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
