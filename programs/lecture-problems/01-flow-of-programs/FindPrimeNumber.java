public class FindPrimeNumber {

    public static void main(String[] args) {
        int n =  531; //provide the number to identify whether it is prime or not.

        if( n < 2) {
            System.out.println(n + " is neither prime not composite...");
        } else {
            for(int i = 2; i*i <= n; i++) {
                if(n % i == 0) {
                    System.out.println(n + " is not a prime number. It is divisible by "+i);
                    System.exit(0);
                }
            }
        }
        System.out.println(n + " is a prime number.");
    }
}