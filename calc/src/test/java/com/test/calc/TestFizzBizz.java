package com.test.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFizzBizz {
	
	@Test
     void ShouldreturnFizzBizzMethod() {
		assertEquals("Fizz",FizzBizz.FizzBizzMethod(9));
     }
}
