package com.appprocesssors.ecomstore;

import com.appprocesssors.ecomstore.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class EcomstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomstoreApplication.class, args);
    }
}
