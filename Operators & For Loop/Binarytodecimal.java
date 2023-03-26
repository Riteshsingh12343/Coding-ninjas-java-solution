package Solution;
import java.util.Scanner;
public class Binarytodecimal {
	static int revers(int n)
	{
		int rn=0;
		while (n>0)
		{
			rn=rn*10+n% 10;
			n=n/10;
		}
		return rn;
	}
	public static void main(String[] args) {
		// Write your code here
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
System.out.println(revers(n));
	}
}
