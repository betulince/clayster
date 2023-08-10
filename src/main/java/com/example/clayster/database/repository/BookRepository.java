package com.example.clayster.database.repository;

import com.example.clayster.database.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, String> {

    @Override
    Mono<Book> findById(String bookId);
}
