package kore;

public class SmaxNumber1 {

	public static void main(String[] args) {
		
		int a[]= {14,24,35,84,34,75,38};
		int max=0;
		int smax=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				smax=max;
				max=a[i];
			}
			if(smax<a[i]&&max>a[i]) 
			{
				smax=a[i];
			}
		}
		System.out.println(smax);
	}
}
