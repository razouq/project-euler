package sum_square_difference;

public class Main {
    public static void main(String[] args) {
        long n = 100;
        long r = 0L;
        for(long i = 1; i <= n; i++) {
            r += i * i;
        }
        long sum = n * (n + 1) / 2;
        System.out.println(sum * sum - r);
    }
}
