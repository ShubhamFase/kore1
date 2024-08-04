package kore;

public class Swapping1 {

	public static void main(String[] args) {
		
		int a=40;
		int b=70;
		System.out.println("a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+" b="+b);
	}
}
