package com.carpark;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class CarParkControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private CarParkController controller;

	@Test
	public void test() throws Exception {
		assertNotNull(mockMvc);
		assertThat(controller).isNotNull();

		mockMvc.perform(get("/test")).andExpect(status().isOk());
	}
}
