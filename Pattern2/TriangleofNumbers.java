package Pattern2;
import java.util.Scanner;
public class TriangleofNumbers {
	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int i=1;
		while (i<=n)
		{
			int space =1;
			while(space<=n-i)
			{
				System.out.print(" ");
				space++;
			}
			int j=1;
			int p=i;
			while(j<=i)
			{
				System.out.print(p);
				p++;
				j++;
			}
			j=1;
			p=(i-1)*2;
			while(j<=i-1)
			{
				System.out.print(p);
				p--;
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
