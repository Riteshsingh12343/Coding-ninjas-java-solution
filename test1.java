package test1;
import java.util.Scanner;
public class test1 {
public static void main (String[]args) {
	Scanner s=new Scanner (System.in);
	int n =s.nextInt();
	int prev=s.nextInt();
	int current=s.nextInt();
	int count =3;
	int d=current -prev;
	prev=current;
	
	while(count <=n) {
		current =s.nextInt();
		int tempD =current - prev;
		if (tempD !=d) {
			System.out.println("False");
			return;
		}
		count++;
		prev =current;
	}
	System.out.println("true");
}
}
