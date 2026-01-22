package com.mokito.demo;

public class Tata implements Car{

	
	public void drive() {
		System.out.println("Tata Car.");
		
	}
	public static void main(String[] args) {
		Tata t1=new Tata();
		t1.drive();
		
		//unanimous inner class
		Car c1=new Car() {
			public void drive() {
				System.out.println("driving the Tata car from unanimous inner class");
			}
		};
		c1.drive();
		
		Car c2=() -> System.out.println("driving the Tata car from lambda class");
		c2.drive();
	}
}
