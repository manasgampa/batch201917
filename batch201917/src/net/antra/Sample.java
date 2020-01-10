package net.antra;

public class Sample {//identifier
	
	static int y=45;
	int x=12;
	
	public static void m2() {
		System.out.println("in m2() of sample");
	}
	
	public static void main(String ar[]) {//identifier
		
		//Employee em=new Employee(10);
		//Employee em1=new Employee();
		
		/*Student st=new Student();
		st.m2(10, "manas");*/
		
		/*Parent p=new Parent();
		p.m1();
		p.m3();*/
		
		/*Child ch=new Child();
		ch.m2();
		ch.m3();
		ch.m1();*/
		
		/*Parent p=new Child();
		p.m1();
		//p.m2();//not possible
		p.m3();*/
		
		
		/*Employee emp=new Employee();
		int i=emp.getEmpId();
		System.out.println(i);
		emp.setEmpId(10);
		*/
		/*String str=new String("manas");
		System.out.println(str);
		char ch=str.charAt(0);
		System.out.println(ch);
		
		Employee emp=new Employee();
		emp.salary();*/
		/*System.out.println(I1.k);
		Sample3 sm=new Sample3();
		System.out.println(sm.orderId);*/
		//Order or=new Order();
		
		/*Order or=new Order();
		System.out.println(or.orderId);
		or.orderId=98;
		System.out.println(or.orderId);*/
		/*Student st=new Student();
		st.name="kumar";
		st.rollNo=59;*/
		/*String str="manas";
		String str2="kumar";
		//System.out.println(str+str2);
		int i=10;
		int j=20;
		int k=30;
		int m=40;
		System.out.println(i+j+str+k+m);
		System.out.println(i!=j);*/
		
		/*int x=4;
		int y=x--;
		System.out.println("x:"+x);
		System.out.println("y:"+y);*/
		
		/*int m=69;
		System.out.println(m);*/
		/*Student st=new Student();
		st.marks=64;
		System.out.println(st.marks);
		
		Student st2=new Student();
		System.out.println(st.marks);*/
		
		/*System.out.println(Student.marks);
		Student.m3();*/
		
		/*m2();
		System.out.println(y);*/
		/*Student st=new Student();
		st.rollNo=90;
		System.out.println(st.rollNo);
		System.out.println(st.name);
		st.m2();
		
		Student st2=new Student();
		System.out.println(st2.rollNo);
		*/
		
		/*Sample sm=new Sample();
		sm.x=67;
		System.out.println(sm.x);
		sm.m1();
		*/
		
		
		/*int j[]= {5,3,6,4,9,5,3};
		int i[]=new int[3];
		i[0]=54;
		i[1]=34;
		i[2]=89;
		System.out.println(i.length);
		for(int k=0;k<j.length;k++) {
			System.out.println(j[k]);
		}*/
	
		
		//int i=10;
		/*boolean b=true;//no size//no range
		
		char ch='a';//2 bytes//single character
		System.out.println(ch);
		
		float f=45.523563f;//4 bytes//5 to 6 decimal
		double d=56.32432;//8 bytes//14 to 15 decimal points
		
		byte b=127;//-128 to 127//1 byte
		short s=1;//-32768 to 32767//2 bytes
		int i=56;//-2^31 to (2^31)-1//4 bytes
		long l=67;//-2^63 to (2^63)-1//8 bytes
		//System.out.println(f);
*/		
		
		//int i=10;//identifier //a-z, A-Z, 0-9, _,$
		
	}
	
	public void m1() {
		Student st=new Student();
		System.out.println(st.rollNo);
		System.out.println(x+"in m1 method");
	}
	
	
	
}
