package com.example.clayster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ClaysterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClaysterApplication.class, args);
    }

}
