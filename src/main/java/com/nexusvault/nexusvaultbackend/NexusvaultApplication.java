package com.nexusvault.nexusvaultbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties
public class NexusvaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexusvaultApplication.class, args);
    }

}
