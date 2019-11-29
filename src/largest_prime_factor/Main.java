package largest_prime_factor;

public class Main {
    public static void main(String[] args) {
        long n = 600851475143L;
        long mx = 1L;
        long x = 2L;
        while(n != 1) {
            while(n % x == 0) {
                n /= x;
                mx = x;
            }
            x++;
        }
        System.out.println(mx);
    }
}
