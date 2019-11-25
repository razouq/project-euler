package multiple_of_3_and_5;

public class Main {
    public static void main(String[] args) {
        long n = 1000;
        long res = 0;
        for(long i = 1; i < n; i++) {
            if(i % 3 == 0) {
                res += i;
            }
            else if(i % 5 == 0) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
