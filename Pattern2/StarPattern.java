package Pattern2;
import java.util.Scanner;
public class StarPattern {
	Scanner input =new Scanner (System.in);
	int n=input.nextInt();
	int i= 1;
	while (i<=n)
	{
		int j=1;
		while (j<= n-i)
		{
			System.out.print(" ");
			j++;
		}
		int k=1;
		while(k<=i)
		{
			System.out.print("*");
			k++;
		}
		int l= 1;
		while (l<=i-1)
		{
			System.out.print("*");
			l++;
		}
		System.out.println();
		i++;
	}

	
}

}
