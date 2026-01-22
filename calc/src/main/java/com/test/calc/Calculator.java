package com.test.calc;

public class Calculator {
  private MathClass1 mathclass;
  
  public Calculator(MathClass1 mathClass){
	  this.mathclass=mathClass;
  }
  public int sum(int a,int b) {
	  return mathclass.add(a,b);
  }
}
