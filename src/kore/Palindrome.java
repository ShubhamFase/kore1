package kore;

public class Palindrome {
	public static void main(String args[]) {
		
		int n=125;
		int sum=0;
		int n1=n;
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
			System.out.println(n1+" is not palindrome number");
		}
		}
	}

