package Pattern2;
import java.util.Scanner;
public class MirrorImageNumberPattern {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int spaces=1;
			int j=1;
			while(spaces<=n-i)
			{
				System.out.print(" ");
				spaces=spaces+1;
			}
			int num=1;
			while(num<=i)
			{
				System.out.print(num);
			    num=num+1;
			
			}
			System.out.println();
			i=i+1;
		}


		
	}

}
