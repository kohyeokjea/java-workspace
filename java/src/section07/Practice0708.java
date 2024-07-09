package section07;

import java.util.Scanner;

public class Practice0708 {
    public static void main(String[] args) {

        int[][] arrs = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int target;

        Scanner scanner = new Scanner(System.in);

        System.out.print("검색할 값을 입력하세요: ");
        target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                if (target == arrs[i][j]) {
                    found = true;
                    System.out.println("값 " + target + "이(가) " + i + " 행 " + j + " 열 " + " 배열에서 찾았습니다.");
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("값 " + target + "을(를) 배열에서 찾을 수 없습니다.");
        }

        scanner.close();

    }
}
