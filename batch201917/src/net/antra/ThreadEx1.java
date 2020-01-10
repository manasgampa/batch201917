package net.antra;

public class ThreadEx1 extends Thread{

	
	Calculator c;
	ThreadEx1(Calculator c){
		this.c=c;
	}
	
	
	@Override
	public void run() {
		c.mul(10);
	}
	
}
