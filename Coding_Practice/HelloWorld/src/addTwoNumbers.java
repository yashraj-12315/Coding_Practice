import java.util.*;
public class addTwoNumbers {
	public static int sum(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no.:");
		a=sc.nextInt();
		System.out.println("Enter the second no.:");
		b=sc.nextInt();
		int sum=sum(a,b);
		System.out.println("The sum is:"+sum);
		
		
	}

}
