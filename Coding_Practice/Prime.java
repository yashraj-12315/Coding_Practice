import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int n = sc.nextInt();

        int i = 1, count = 0;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;

        }
        if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }

    }
}
