package smallet_multiple;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static boolean isPrime(long a) {
        for(long i = 2; i * i <= a; i++) {
            if(a % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long n = 20;
        Map<Long, Long> map = new HashMap<>();
        for(long i = 2; i <= n; i++) {
            if(isPrime(i)) {
                map.put(i, 0L);
            }
        }
        for(long i = 2; i <= n; i++) {
            long num = i;
            for(Long key : map.keySet()) {
                Long c = 0L;
                while(num % key == 0) {
                    num /= key;
                    c++;
                }
                if(c > map.get(key)) {
                    map.put(key, c);
                }
            }
        }
        Long res = 1L;
        for (Long key : map.keySet()) {
            res *= Double.valueOf(Math.pow(key, map.get(key))).longValue();
        }
        System.out.println(res);
    }
}
