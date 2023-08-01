package com.spring.springmvc.seeder;

import com.github.javafaker.Faker;
import com.spring.springmvc.model.User;
import com.spring.springmvc.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    Faker faker = new Faker();

    @Bean
    public CommandLineRunner initDatabase(UserRepository repository) {
        log.warn("Dropping users table ");
        repository.deleteAll();
        log.warn("Users table dropped");
        return args -> {
            for (int i = 0; i < 50; i++) {
                String name = faker.name().fullName();
                String email = faker.internet().emailAddress();
                User user = new User();
                user.setName(name);
                user.setEmail(email);
                repository.save(user);
//                log.info("Preloading " + repository.save(user));  // Logging
            }
            log.info("Fake users generated and added in db table");
        };
    }
}
