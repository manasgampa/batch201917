package net.antra;

public class Sample1 {
	
	public static void main(String ar[]) {
		
		Parent p=new Parent();
		System.out.println(p.patentI);
		//p.patentI=67;
		p.m1();//5min
		p.m1(10, 15, "manas");//10min
		p.m3();
		//p.m2();
		//System.out.println(p.childJ);
		
		Child ch=new Child();
		System.out.println(ch.childJ);
		//System.out.println(ch.patentI);
		ch.m2();
		//ch.m1();
		ch.m3();
		
		
	}

}
