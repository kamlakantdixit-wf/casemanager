package com.citi.casemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.citi.casemanager.model"})
@EnableJpaRepositories(basePackages = {"com.citi.casemanager.repository"})

public class CaseManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(CaseManagementApplication.class, args);
    }
}
