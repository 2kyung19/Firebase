package com.example.fcmserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FcmserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(FcmserverApplication.class, args);
	}
}
