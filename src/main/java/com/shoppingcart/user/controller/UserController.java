package com.shoppingcart.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.user.model.User;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@ApiOperation(
			value = "User Service",
			notes = "Provides User details of registered shopping cart users",
			response =  User.class,
			httpMethod = "GET"
			)
	@ApiResponses(
			@ApiResponse(code = 200, message = "OK")
			)
	@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser() {
		User user = User.builder().name("Tom").id("123").emailId("tom@gmail.com").mobileNumber("0123456789").build();
		ResponseEntity<User> reponse = new ResponseEntity<User>(user, HttpStatus.OK);
		return reponse;
	}

}
