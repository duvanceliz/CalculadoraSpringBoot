package com.example.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {
	@Test
	public void testSuma() {

		float res = Greeting.suma(3, 5);
		float esperado = 8;
		assertEquals(esperado, res);
	}
	@Test
    public void testResta() {
    	float res = Greeting.resta(5, 3);
		float esperado = 2;
		assertEquals(esperado, res);
		
	}
	@Test
    public void testMult() {
    	float res = Greeting.mult(5, 3);
		float esperado = 15;
		assertEquals(esperado, res);
		
	}
	@Test
    public void testDiv() {
    	float res = Greeting.div(15, 3);
		float esperado = 5 ;
		assertEquals(esperado, res);
	
    }

}
