package org.generation.italy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.generation.italy.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator c;
	
	@BeforeEach
	void init() {
		c = new Calculator();
	}
	
	@Test
	@DisplayName("Testo che l'addizione ritorni un numero float")
	void addTest() {
		double add = c.add(10.0, 2.0);
		assertEquals(12, add);
	}
	
	@Test
	@DisplayName("Testo che la sottrazione ritorni un numero float")
	void substractTest() {
		double substract = c.substract(10.0, 2.0);
		assertEquals(8, substract);
	}
	
	@Test
	@DisplayName("Testo che la divisione ritorni un numero float")
	void divideTest() {
		double divide = c.divide(10.0, 2.0);
		assertEquals(5, divide);
	}
	
	@Test
	@DisplayName("Testo che la moltiplicazione ritorni un numero float")
	void multiplyTest() {
		double multiply = c.multiply(10.0, 2.0);
		assertEquals(20, multiply);
	}
}
