import java.util.*;
public class mulTwoNumbers {
	
	public static int product(int a,int b) {
		int product=a*b;
		return product;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no.:");
		a=sc.nextInt();
		System.out.println("Enter the second no.:");
		b=sc.nextInt();
		
		System.out.println("Product of two numbers is :"+product(a,b));

	}

}
