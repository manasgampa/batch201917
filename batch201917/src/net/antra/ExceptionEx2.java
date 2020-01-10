package net.antra;

public class ExceptionEx2 {
	
	public static void main(String[] args) {
		System.out.println("in main method before do stuff");
		doStuff();
		System.out.println("in main method after do stuff");
	}

	public static void doStuff() {
		System.out.println("in do stuff before do more stuff");
		try {
		doMoreStuff();
		}catch(Exception e) {}
		System.out.println("in do stuff before do more stuff");
	}
	
	public static void doMoreStuff() {
		System.out.println("dont sleep");
		System.out.println(2/0);
		System.out.println("wake up");
	}
}
