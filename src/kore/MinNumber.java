package kore;

public class MinNumber {
	public static void main(String[] args) {
		int a[]= {10,68,20,25,5,39,44};
		int min=a[0];
		for(int i=0;i<a.length;i++)
	
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
