package section14.practice.p03;

import java.util.Scanner;

// 나이를 입력하세요: 99
// 정상적인 처리: 99입니다.

// 나이를 입력하세요: -99
// 에러 발생: 음수 나이는 입력할 수 없습니다.

public class Practice1403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요: ");
        int age = scanner.nextInt();

        try {
            if (age < 0) {
                throw new Exception("음수 나이는 입력할 수 없습니다.");
            } else {
                System.out.println("정상적인 처리: " + age + "세 입니다.");
            }
        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
