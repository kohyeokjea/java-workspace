package section06;

import java.util.Scanner;

public class Practice0604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단의 단을 입력하세요: ");

        int dan = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " ✕ " + i + " = " + (dan * i));
        }

        scanner.close();
    }
}
