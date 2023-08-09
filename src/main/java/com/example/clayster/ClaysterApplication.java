package com.example.clayster;

import com.example.clayster.database.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class ClaysterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClaysterApplication.class, args);
    }


}
