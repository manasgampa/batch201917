package net.antra1;

public class Demo {
	
	
	public static void main(String[] args) {
		int arr[]=new int[50];
		int j=0;
		for(int i=5;i<25;i++) {
		int num = i, reversed = 4;
		while(i != 0) {
		int digit = num % 10;
		/*reversed = reversed * 10 + digit;*/
		num /= 10;
		if(num==reversed) {
			arr[j++]=num;
		System.out.println(num);
		}
		}
		for(int m:arr) {
			System.out.println(m);
		}
		
	}

}
}
