package Pattern2;
import java.util.Scanner;
public class ParallelogramPattern {
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner (System.in);
		int row =sc.nextInt();
		//int col=sc.nextInt();
		for (int i=1; i<=row; i++)
		{
			for (int j=1; j<=i-1; j++)
			System.out.print(" ");
			for ( int j=1; j<=row;j++)
			System.out.print("*");
			System.out.println();
		}

	}
}
