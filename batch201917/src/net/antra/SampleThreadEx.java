package net.antra;

public class SampleThreadEx {
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		ThreadEx1 tr1=new ThreadEx1(c);
		ThreadEx2 tr2=new ThreadEx2(c);
		
		tr1.setName("manas");
		tr2.setName("Rishi");
		tr1.start();
		tr2.start();
		
		/*ThreadEx3 th3=new ThreadEx3();
		Thread thr3=new Thread(th3);
		thr3.start();*/
	
		
		
		/*ThreadEx1 th1=new ThreadEx1();
		ThreadEx2 th2=new ThreadEx2();
		th1.start();//............
		th2.start();//...........
*/	
	}

}
