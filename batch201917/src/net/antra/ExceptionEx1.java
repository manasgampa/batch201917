package net.antra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.StubNotFoundException;
import java.util.Scanner;


public class ExceptionEx1 {
	
	public static void main(String[] args) throws Exception   {
	
		String str=new String();
		
		/*Integer i1=new Integer(45);
		Integer i2=new Integer(5);
		System.out.println(i1+i2);
		String str=i1.toString();
		String str2=i2.toString();
		System.out.println(str+str2);
		System.out.println(str);*/
		//FileInputStream fis=new FileInputStream("abc.txt");
			
		
			System.out.println("in main");
		
		//ObjectOutputStream obj=new ObjectOutputStream(fos);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter i value");
		int i=sc.nextInt();
		System.out.println("enter j value");
		int j=sc.nextInt();
		try {
		System.out.println("div");
		System.out.println(i/j);
		//FileInputStream fis=new FileInputStream("abc.txt");
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("in catch block");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("in finally");
		}
		System.out.println("add");
		System.out.println(i+j);
		throw new StudentNotFoundException("in student exception");
		
	}

}
