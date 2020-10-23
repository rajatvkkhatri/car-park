package com.carpark;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

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
