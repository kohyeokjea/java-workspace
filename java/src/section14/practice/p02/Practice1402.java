package section14.practice.p02;

import java.util.Scanner;

// 피제수를 입력하세요: 5
// 제수를 입력하세요: 0
// 0으로 나눌 수 없습니다.
// 프로그램을 종료합니다.

// 피제수를 입력하세요: 5
// 제수를 입력하세요: 1
// 나눗셈 결과: 5

public class Practice1402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("피제수를 입력하세요: ");
        int dividend = scanner.nextInt(); // 피제수

        System.out.print("제수를 입력하세요: ");
        int divisor = scanner.nextInt(); // 제수

        try {
            int result = dividend / divisor;
            System.out.println("나눗셈 결과: " + result);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
            scanner.close();
        }
    }
}
