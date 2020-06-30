package com.shoppingcart.user.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.shoppingcart.user.model.User;

@RunWith(MockitoJUnitRunner.class)
class UserControllerUnitTest {

	private UserController controller = new UserController();

	@Test
	void getUserDetails() {
		ResponseEntity<User> result = controller.getUser();
		assertThat(result.getStatusCode().equals(HttpStatus.OK));
		assertThat(result.getBody().toString()
				.equals("User [name=Tom, id=123, emailId=tom@gmail.com, mobileNumber=0123456789]"));
	}

}
