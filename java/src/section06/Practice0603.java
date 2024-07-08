package section06;

import java.util.Scanner;

public class Practice0603 {
    public static void main(String[] args) {
        // 1부터 10까지의 홀수의 합: 25

        int sum = 0;

        for (int i = 1; i <= 10; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        int start;
        int end;
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 숫자를 입력하세요: ");
        start = scanner.nextInt();
        System.out.print("끝 숫자를 입력하세요: ");
        end = scanner.nextInt();

        System.out.print("홀수는 1, 짝수는 2를 입력하세요: ");
        number = scanner.nextInt();

        sum = 0;
        for (int i = start; i <= end; i++) {
            if (number == 1) {
                if (i % 2 != 0) {
                    sum += i;
                }
            } else {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }

        String isOdd = number == 1 ? "홀수" : "짝수";

        System.out.println(start + "부터 " + end + "까지의 " + isOdd + "의 합은: " + sum);

        scanner.close();
    }
}
