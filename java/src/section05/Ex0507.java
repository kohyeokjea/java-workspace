package section05;

public class Ex0507 {
    public static void main(String[] args) {
        // 1~10 짝수 출력
        // 2 4 6 8 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d", i);
            }
        }

        System.out.println();

        // 1~10 홀수 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.printf("%d", i);
            }
        }
    }
}
