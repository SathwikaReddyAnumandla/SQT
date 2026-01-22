package com.mokito.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
  
public class AtmWithdrawTest {
	
	@Test
	void testSufficientBalance() {
		AtmWithdrawl obj1=new AtmWithdrawl(5000);
		obj1.Withdraw(4000);
		assertEquals(1000, obj1.balance);
	}
	
	@Test
	
	void testInsufficientBalance() {
		AtmWithdrawl obj2=new AtmWithdrawl(500);
		
		//Executable ex=()-> obj2.Withdraw(1000);
		
		assertThrows(ArithmeticException.class, ()-> obj2.Withdraw(1000));
	}
	
	@Test
	void testNegativeAmount() {
		AtmWithdrawl obj3=new AtmWithdrawl(100);
		
		assertThrows(ArithmeticException.class, ()->obj3.Withdraw(-100));
	}

}
