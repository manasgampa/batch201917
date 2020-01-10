package net.antra;

public class ThreadEx3 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("in Thread3:"+i);
			}
		
	}

}
