package com.mokito.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class Testcalci {
	
	@Test
	void sumTest() {
		//fake object/create a fake object
		MathClass math=mock(MathClass.class);
		//injects fake object
		Calculator cal=new Calculator(math);
		
		//give fake data
		when(cal.sum(90,80)).thenReturn(170);
		//take the fake data
		int result=cal.sum(90,80);
		assertEquals(170, result);
	}
}
