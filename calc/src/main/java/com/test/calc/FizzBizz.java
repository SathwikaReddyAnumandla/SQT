package com.test.calc;

public class FizzBizz {
	static String FizzBizzMethod(int n) {
		
		 n=15;
	
		if(n%3 ==0 && n%5==0) {
			return "Fizzbizz";
		}
	       if(n%3 ==0){
			return "Fizz";
		}
		    if(n%5 == 0){
			return "Bizz";
		}
		    
		    
		    return String.valueOf(n);
		   
	}

}
