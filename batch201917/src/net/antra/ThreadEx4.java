package net.antra;

public class ThreadEx4 extends Thread{
	
	Calculator c;
	
	ThreadEx4(Calculator c){
		this.c=c;
	}
	
	public void run() {
		
		for(int i=0;i<50;i++) {
			System.out.println("in thread 4:"+i);
			Thread.yield();
		}
		//c.mul(5);
	}
	

}
