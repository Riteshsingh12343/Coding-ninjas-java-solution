module checkAp {
	import java.util.Scanner;
	import java.lang.*;
	public class Main {
		
		public static void main(String[] args) {
			// Write your code here
	     Scanner s=new Scanner(System.in);
		        int n = s.nextInt();
		     int prev =s.nextInt();
				int current =s.nextInt();
		        int count =3;
		        int d=current - prev;
				prev = current;

				while(count <=n){
					current = s.nextInt();
					int tempD =current - prev;
					if(tempD != d){
						System.out.println("false");
						return ;
					}
					count++;
					prev = current;
				}
		            System.out.println("true");
		    }
		}

		


}