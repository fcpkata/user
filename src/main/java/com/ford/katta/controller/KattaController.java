package com.ford.katta.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class KattaController {

	@GetMapping(value="/hello")
	public ResponseEntity<String> getMessage() {
		String message = "Hello World!!!";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

}
