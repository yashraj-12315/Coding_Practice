import java.util.*;
public class factorial {
	public static void calculateFactorial(int n) {
	 int fact=1;
	 if(n<0) {
		 System.out.println("Invalid Input");
		 return;
	 }
     for(int i=n;i>=1;i--) {
			
			fact=fact*i;
		}
     System.out.println("Factorial of "+ n + " is :"+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Find the factorial of :");
		int n=sc.nextInt();
		calculateFactorial(n); 
		
		
		

		
	}

}
