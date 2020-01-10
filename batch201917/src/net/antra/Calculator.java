package net.antra;

public class Calculator {

	public int add(int i, int j) {
		
		return i+j;
	}
	
	public void mul(int j) {
		
		for(int i=1;i<=20;i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i*j);
			Thread.yield();
		}
	}
}
