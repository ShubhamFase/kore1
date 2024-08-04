package kore;

public class MaximimNumber {

	public static void main(String args[]) 
	{
		int a[]= {13,46,37,87,65,32};
		int max=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}

