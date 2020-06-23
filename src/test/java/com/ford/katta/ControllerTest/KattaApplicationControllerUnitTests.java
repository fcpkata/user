package com.ford.katta.ControllerTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ford.katta.KattaApplication;
import com.ford.katta.controller.KattaController;

@SpringBootTest(classes = KattaApplication.class)
class KattaApplicationControllerUnitTests {
	
	private KattaController controller = new KattaController();

	@Test
	void getMessage() {
		ResponseEntity<String> result=controller.getMessage();
		Assertions.assertEquals(result.getStatusCode(), HttpStatus.OK);
		Assertions.assertEquals(result.getBody(), "Hello World!!!");
	}

}
