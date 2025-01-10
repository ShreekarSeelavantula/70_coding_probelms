import java.util.Scanner;

public class PrimeCheck {
    // Returns true if n is prime
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;        
        if (n % 2 == 0) return false;   

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        long num = sc.nextLong();
        System.out.println(num + (isPrime(num) ? " is prime." : " is NOT prime."));
        sc.close();
    }
}
