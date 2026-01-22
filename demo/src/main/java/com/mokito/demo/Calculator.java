package com.mokito.demo;

public class Calculator {
	private MathClass mathclass;
	
	Calculator(MathClass mathclass){
		this.mathclass=mathclass;
	}
	int sum(int a,int b) {
		return mathclass.add(a, b);
	}

}
