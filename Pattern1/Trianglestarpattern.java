package Pattern1package;
import java.util.Scanner;
public class Trianglestarpattern {

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
	int p=i;
	int j=1;
 while (j<=i)
 {
	 System.out.print("*");
	 p=p+1;
	 j=j+1;
 }
 System.out.println();
 i=i+1;
}
		
	}

}