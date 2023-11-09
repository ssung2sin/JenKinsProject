package com.example.jenkinsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("boot.*")
public class JenkinsProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsProjectApplication.class, args);
    }

}
