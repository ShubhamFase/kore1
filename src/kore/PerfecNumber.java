package kore;

import java.util.Scanner;

public class PerfecNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number =");
		int n=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=n/2;i++) 
		{
			if(n%i==0)
			count+=i;
		}
		if(count==n) 
		{
			System.out.println(n+" is perfect number");
		}else 
		{
			System.out.println("no perfect number find");
		}
	}
}
