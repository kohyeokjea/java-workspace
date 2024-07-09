package section07;

import java.util.Scanner;

public class Practice0705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 찾을 값을 입력하세요:
        // 배열에 ?? 값이 존재하지 않습니다.

        int target;

        System.out.print("찾을 값을 입력하세요: ");
        target = scanner.nextInt();

        int[] numbers = { 10, 20, 30, 40, 50 };

        boolean found = false;

        for (int number : numbers) {
            if (target == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("배열에 " + target + " 값이 존재합니다.");
        } else {
            System.out.println("배열에 " + target + " 값이 존재하지 않습니다.");
        }

        scanner.close();
    }
}
