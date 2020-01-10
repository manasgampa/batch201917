package net.antra;

public class Child extends Parent{

	int childJ=20;
	
	int m=98;
	
	public void m2() {
		System.out.println(super.m);
		System.out.println("in child class m2 method");
	}
	
	public  void m3() {
		
		System.out.println("in m3 method of child");
		
	}
}
