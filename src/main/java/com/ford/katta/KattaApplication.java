package com.ford.katta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class KattaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KattaApplication.class, args);
		log.info("Application Started");
	}

}
