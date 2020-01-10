package net.antra;

public class ThreadEx5 extends Thread{

	Calculator c;
	
	ThreadEx5(Calculator c){
		this.c=c;
	}
	
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("in thread 5:"+i);
		}
		//c.mul(8);
	}
}
