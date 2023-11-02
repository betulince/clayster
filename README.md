# Personalized Library Application (Clayster)

This is a personalized library application built using Spring Boot, Java, MongoDB, Gradle, and with plans to integrate Apache Kafka for future enhancements. The application allows users to manage their library, including adding and deleting books, writing reviews and ratings, updating reading status, and receiving book recommendations based on reading history.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

## Features

- Add new books to the library
- Delete books from the library
- Write and manage book reviews and ratings
- Update reading status for each book (future enhancement)
- Receive book recommendations based on reading history (future enhancement)

## Technologies Used

- Spring Boot
- Java
- MongoDB
- Gradle
- Apache Kafka (planned for future enhancements)

## Getting Started

1. Clone the repository: `git clone https://github.com/betulince/clayster.git`
2. Build the application: `gradle build`
3. Run the application: `gradle bootRun`

## Usage

1. Access the application at: `http://localhost:8080`
2. Use the provided endpoints and user interfaces to manage your library:
    - Add new books
    - Delete books
    - Write reviews and ratings
    - Update reading status

## Future Enhancements

In the future, the following enhancements are planned:

- Book recommendation engine based on user reading history and preferences
- Integration with Apache Kafka for real-time updates and event-driven architecture
- Decomposition of the application
  
### Book Management Service
This microservice will be responsible for managing user-owned books. It will handle operations like adding, deleting, updating the status of books, and keeping track of users' bookshelves. Additionally, this service can provide functionalities like categorizing books, setting reading status (e.g., "To Read," "Reading," "Read"), and adding personal notes or reviews for each book. It can also emit events when users update their bookshelves, such as adding a new book or changing the reading status. Other microservices can subscribe to these events to keep their data in sync.

### Recommendation Engine Service
The recommendation engine microservice will analyze users' reading history, preferences, and interactions to generate personalized book recommendations. It can use collaborative filtering, content-based filtering, or machine learning algorithms to suggest books to users. This microservice can periodically generate and store these recommendations and also send out weekly recommendation emails to users. It may listen for events from the Book Management Service to keep track of changes in user reading behavior and adjust its recommendations accordingly.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:
1. Fork the repository
2. Create a new branch: `git checkout -b feature/<feature-name>`
3. Make your changes and commit them: `git commit -m "Add feature"`
4. Push to the branch: `git push origin feature/<feature-name>`
5. Create a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

