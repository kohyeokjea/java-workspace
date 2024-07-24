package section19;

public class Ex1902 {
    public static void main(String[] args) {
        int n = 1;

        int result = 0;
        while (1000 > n) {
            if (n % 3 == 0 || n % 5 == 0) {
                // System.err.println(n);
                result += n;
            }
            n++;
        }

        System.out.println(result);
    }
}
