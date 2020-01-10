package net.antra1;

public class Sample1 {

	public static void main(String[] args) {
		
		I3 i3=(i,s)->{System.out.println("in interface");
						System.out.println(i);
						System.out.println(s);
						return 1;};
		
		
		int i=i3.m4(8,"manas");
		System.out.println(i);
		/*I1.m2();
		InterImpl in=new InterImpl();
		in.m3();*/
		
	}
}
