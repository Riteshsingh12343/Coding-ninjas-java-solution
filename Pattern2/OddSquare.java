package Pattern2;
import java.util.Scanner;

public class OddSquare {
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for (int i=1; i<=n; i++)
		{
			for (int j=i-1;j<n; j++)
			{
				System.out.print(j*2+1+"");
			}
			for (int k=0; k<i-1; k++)
			{
				System.out.print(k*2+1+"");
			}
			System.out.println();
		}
	}
}
