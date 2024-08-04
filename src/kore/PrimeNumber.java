package kore;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) 
			
		{
			int n=i;
			boolean b=false;
			for(int j=2;j<=n/2;j++) 
			{
				if(n%j==0) 
				{
					b=true;
				}
				
			}
			if(!b) 
			{
				System.out.println(n+" is a prime number");
			}
		}
		
	}

}
