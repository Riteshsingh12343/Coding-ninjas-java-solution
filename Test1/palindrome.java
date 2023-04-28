package test1;
 import java.util.Scanner;
public class palindrome {
	 public static boolean checkPalindrome(String str){
		  boolean isPalindrome=true;
		  for (int i = 0,j = str .length() -1;i < (str .length()/2); i++,j--)
		  {
			  if (str.charAt(i) !=str.charAt(j))
			  {
				  isPalindrome = false;
				  break;
			  }
		  }
		  return isPalindrome;
	  }
public static void main(String[] args) {
	// Write your code here
	Scanner s=new Scanner(System.in);
	String str =s.nextLine();
	boolean isPlaindrome =checkPalindrome(str);
	System.out.print (isPlaindrome);
}
}
