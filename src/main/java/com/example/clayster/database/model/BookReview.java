package com.example.clayster.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "book-review")
@NoArgsConstructor
@AllArgsConstructor
public class BookReview {
    @Id
    private String reviewId;
    private Book book;
    private String userName;
    private String review;
    private Rating starRating;

    private enum Rating {
        TERRIBLE("The book was unenjoyable and not worth reading."),
        MEDIOCRE("The book was okay, but it didn't leave a strong impression."),
        GOOD("The book was enjoyable and had some positive aspects."),
        GREAT("The book was excellent, and I highly recommend it."),
        OUTSTANDING("The book was exceptional, and I absolutely loved it.");

        Rating(String exp) {
        }
    }
}
