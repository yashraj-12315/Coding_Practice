import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int z = n, sum = 0;//we have assigned in another variable so that n value should not change
        int count = 0;
        while (z > 0) {
            count++;
            z /= 10;
        }
        System.out.println("No. of digits:" + count);
        z = n;//we have assigned in another variable so that n value should not change
        while (z > 0) {
            int digit = z % 10;
            int product = 1;
            for (int i = 1; i <= count; i++) {//to claculate cube 

                product = product * digit;
            }
            sum = sum + product;
            z = z / 10;
        }
        if (sum == n) {
            System.out.println("Number is an  Armstrong number");
        } else {
            System.out.println("No. is not an Armstrong number");
        }
    }
}
