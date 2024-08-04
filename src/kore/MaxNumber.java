package kore;

public class MaxNumber {
	public static void main(String[] args) {
		int a[]= {10,68,20,25,39,44};
		int max=0;
		//int smax=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				
				max=a[i];
			}
			
		}
		System.out.println(max);
	}
}
