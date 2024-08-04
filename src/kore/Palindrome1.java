package kore;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number= ");
		int n=sc.nextInt();
		int sum=0;
		int n1=n;
		{
			while(n!=0) 
			{
				sum*=10;
				sum+=n%10;
				n/=10;
			}
			if(sum==n1) 
			{
				System.out.println(n1+" is palindrome number");
			}
			else 
			{
				System.out.println("number not palindrome number");
			}
		}
	}
}
