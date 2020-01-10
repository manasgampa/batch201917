package net.antra;

public class ThreadEx2 extends Thread{

	Calculator c;
	
	ThreadEx2(Calculator c){
		this.c=c;
	}
	
	public void run() {
		c.mul(5);
	}
	
}
