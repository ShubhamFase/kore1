package kore;

public class StringDemo2 {
	public static void main(String args[]) 
	{
		String s ="i am java developer";
		String s1[]=s.split(" ");
		String s2="";int max=0;
		String a="";
		for(int i=0;i<s1.length;i++) 
		{
			if(s1[i].length()>max) 
			{
				s2=s1[i];
				max=s2.length();
			}
		}
		System.out.println(s2 +"="+max);
	}
}
			