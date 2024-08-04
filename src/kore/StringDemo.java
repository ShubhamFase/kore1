package kore;

public class StringDemo {
	public static void main(String args[]) 
	{
		String s="I am java developer";
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++) 
		{
			String temp=s1[i];
				for(int j=temp.length()-1;j>=0;j--)
				s2 += temp.charAt(j);
				s2 +=" ";
			}
		System.out.println(s2);
	}
}
