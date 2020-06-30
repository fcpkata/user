package com.shoppingcart.user.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerAcceptanceTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	void test() throws Exception {
		mockMvc.perform(get("/v1/user")).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("Tom")).andExpect(jsonPath("$.id").value("123"));
	}

}
