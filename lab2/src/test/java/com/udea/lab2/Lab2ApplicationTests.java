package com.udea.lab2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Lab2ApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals("HEALTH CHECK OK", dataController.healtCheck());
	}

	@Test
	void version() {
		assertEquals("the actual version is 1.0.0", dataController.version());
	}

	@Test
	void nationLength() {
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void CurrenciesLength() {
		Integer currenciesLenght = dataController.getRandomCurrencies().size();
		assertEquals(10,currenciesLenght );
	}

}
