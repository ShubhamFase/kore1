package kore;

public class PerfectNumber1 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++) 
		{
			int n=i;
			int count=0;
			for(int j=1;j<=n/2;j++) 
			{
				if(n%j==0) 
				{
					count+=j;
				}
			}
			if(count==n) 
			{
				System.out.println(n+" is perfect number");
			}
			
		}
		
		
	}
}
