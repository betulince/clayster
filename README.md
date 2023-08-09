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
- Integration with Apache Kafka for real-time updates and event-driven architecture
- Book recommendation engine based on user reading history and preferences

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:
1. Fork the repository
2. Create a new branch: `git checkout -b feature/<feature-name>`
3. Make your changes and commit them: `git commit -m "Add feature"`
4. Push to the branch: `git push origin feature/<feature-name>`
5. Create a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

