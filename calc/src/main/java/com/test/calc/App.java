package com.test.calc;

class parent{
	void print() {
		System.out.println( "This is the parent class " );
	}
}

public class App extends parent 
{
    public static void main( String[] args )
    {
    	App a =new App();
        System.out.println( "This is the child class" );
        a.print();
    }
}
