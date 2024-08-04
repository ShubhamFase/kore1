package kore;

public class Smax {

	public static void main(String[] args) {
		int a[]= {12,34,32,45,15,24,35};
		int max=0;
		int smax=0;
		int temp=0;
		for(int i=0;i<a.length;i++) 
		{
			
				if(a[i]>max) 
				{
					
					smax=max;
					max=a[i];
				}
				
				  if(smax<a[i] && max>a[i]) {
					  smax=a[i]; 
					  }
				 
			
		}
		System.out.println(smax);
	}

}
