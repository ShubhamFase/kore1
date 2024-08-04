package kore;

public class PalindromeString {

	public static void main(String[] args) {
      
	   String a="Naan";
	   String b="";
	   for(int i=a.length()-1;i>=0;i--) 
	   {
		   b+=a.charAt(i);
	   }
	   if(a.toLowerCase().equals(b.toLowerCase())) 
	   {
		   System.out.println(a+" is a palindrome");
	   }
	   else 
	   {
		   System.out.println("is not palindrome");
	   }
	}

}
