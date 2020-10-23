package com.carpark;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CarParkControllerTest {

	private CarParkController controller;

	@BeforeEach
	void setup() {
		controller = new CarParkController();
	}

	@Test
	void test() {
		assertNotNull(controller);
	}
}
