package com.example.clayster.database.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private String bookId;
    private String bookName;
    private String authorName;
    private String description;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<BookReview> reviews= new ArrayList<>();
    private int year;

    // Getter method for reviews
    public List<BookReview> getReviews() {
        return reviews;
    }

    // Setter method for reviews
    public void setReviews(List<BookReview> reviews) {
        this.reviews = reviews;
    }
}
