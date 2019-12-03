package _10001st_prime;

public class Main {

    static boolean isPrime(long n) {
        for(long i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long n = 1;
        long c = 0;
        while(c < 10001) {
            n++;
            if(isPrime(n)) {
                c++;
            }

        }
        System.out.println(n);
    }
}
