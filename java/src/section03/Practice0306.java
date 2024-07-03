package section03;

public class Practice0306 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';

        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println(++c); // 'B'
        System.out.println(c + 1);

    }
}
