package kore;

public class Swapping {
	public static void main(String args[]) 
	{
		int a=40;
		int b=30;
		//int temp=0;
		System.out.println("a = "+a+" b ="+b);
		System.out.println("-----------------");
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a+" b ="+b);
		System.out.println("-----------------");
	}
}
