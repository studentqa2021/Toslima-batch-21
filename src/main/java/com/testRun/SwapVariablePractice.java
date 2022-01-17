package com.testRun;

public class SwapVariablePractice {
// a=10, b=20 swap the value
	public void getSwap(int a, int b) {
		
		System.out.println("A value before swap ="+a);
		System.out.println("B value before swap ="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A value after swap ="+a);
	
		
	}
 
}

