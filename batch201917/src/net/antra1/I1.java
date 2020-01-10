package net.antra1;

public interface I1 {
	 
	public static final int i=45;
	
	public void m1();
	
	public default void m3() {
		System.out.println("in m3 default method of I1 interface");
	}
	
	public static void m2() {
		System.out.println("in m2 method of static");
	}
}
