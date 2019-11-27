package even_fibonacci_numbers;

public class Main {
    public static void main(String[] args) {
        long a = 1, b = 1, mx = 0;
        while(b <= 4e6) {
            if(b % 2 == 0) {
                mx += b;
            }
            long c = b;
            b += a;
            a = c;
        }
        System.out.println(mx);
    }
}
