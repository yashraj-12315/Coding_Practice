import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 1, sum = 0;//x and y are starting two numbers
        System.out.println("Enter the max value:");
        int n = sc.nextInt();
        while (sum <= n) {//n is the max value of number upto which we have to count the value
            System.out.print(sum+" ");
            x=y;
            y=sum;
            sum=x+y;
        }

    }
}
