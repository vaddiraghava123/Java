package com.vaddi.java.JunitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class JUnitTestsPlaying {
	Calculator cal = new Calculator()	;
	
	@Test
	void testAddition() {
		int result = cal.sum(30, 40);
		assertEquals(70, result);
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cal.divide(1, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
       
	}
	
	@Test
	public void testStringValidation() {
		String input = "hello";
	    String expected = "The reverse of 'hello' should be olleh"; // Adjusted expected value
	    String actual = cal.reverse(input);
	    assertEquals(expected, actual); 
	}

}
