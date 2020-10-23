package com.carpark;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarParkControllerTest {

	private CarParkController controller;

	@Before
	public void setup() {
		controller = new CarParkController();
	}

	@Test
	public void test() {
		assertNotNull(controller);
	}
}
