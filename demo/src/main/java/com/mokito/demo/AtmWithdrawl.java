package com.mokito.demo;

public class AtmWithdrawl {
	int balance;
	
	AtmWithdrawl(int balance){
		this.balance=balance;
	}
	
	void Withdraw(int amount) {
		
		if(amount <= 0) {
			throw new ArithmeticException("Enter only positive numbers");
		}
		
		
		if(amount>balance) {
			throw new ArithmeticException("Insufficient Balance");
		}
		
		
		
		balance=balance-amount;
		
	}
	

}
