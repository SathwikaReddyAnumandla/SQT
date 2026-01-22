package com.test.calc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.  Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestCalculator {
	
	@Mock
	MathClass1 c1;
	
	@InjectMocks
	Calculator c2;
	
	@Test
	void Testsum() {
		when(c1.add(10,20)).thenReturn(30);
		int result=c2.sum(10, 20);
		assertEquals(30, result);
		
		
	}

}
