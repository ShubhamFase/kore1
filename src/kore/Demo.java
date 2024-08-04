package kore;

public class Demo {

	public static void main(String[] args) {
		int a[]= {32,13,45,12,78,65,47};
		double evensum=0;
		double oddsum=0;
		double even=0;
		double odd=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				evensum+=a[i];
				even++;
				
			}
			else 
			{
				oddsum+=a[i];
				odd++;
			}
			
		}
		System.out.println("avg of even "+(evensum/even));
		System.out.println("avg o odd "+(oddsum/odd));
	}

}
