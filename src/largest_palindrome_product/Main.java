package largest_palindrome_product;

public class Main {
    public static void main(String[] args) {
        long mx = 0;
        for(long i = 100; i <= 999; i++) {
            for(long j = 100; j <= 999; j++) {
                if(i * j >= mx && isPalindrome(Long.toString(i * j))) {
                    mx = i * j;
                }
            }
        }
        System.out.println(mx);
    }

    static boolean isPalindrome(String str) {
        int a = 0;
        int b = str.length() - 1;
        while(a < b) {
            if(str.charAt(a) != str.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
