public class Palindrome {
    public static void palindrome(int n) {
        int z = n, rev = 0;
        while (z > 0) {

            rev = (rev * 10) + z % 10;
            z /= 10;

        }
        if (rev == n) {
            System.out.println(n + " is palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }

    public static void main(String[] args) {

        palindrome(153);
    }
}
