public class factorial {
    public static void fact(int num){
        int fact=1,n=num;
        while(n>0){

            fact=fact*n;
            n--;
        }
        System.out.println("Factorial of "+num+" is "+ fact);
    }
    public static void main(String[] args) {
       fact(4);
    }
}
