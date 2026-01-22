package com.test.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAdd {
	
	@Test
	void TestAdd() {
		AddCalculator as =new AddCalculator();
		int result = as.add(5,6);
		assertEquals(11,result);
	}
   void TestPositiveNumbers() {
	   
   }
}
