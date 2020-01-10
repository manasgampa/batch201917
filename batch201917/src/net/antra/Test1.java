package net.antra;

public class Test1 {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		ThreadEx4 t4=new ThreadEx4(c);
		ThreadEx5 t5=new ThreadEx5(c);
		
		t4.start();
		
		t5.start();
		
	}
}
