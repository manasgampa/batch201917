package net.antra;

public class StaticControlFlowEx {

	static int i=29;
	
	static {
		System.out.println(i);
		System.out.println("in static block1");
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
		m1();
	}
	static {
		System.out.println("in static block2");
	}
	
	public static void m1() {
		System.out.println("in m1 method");
	}
}
