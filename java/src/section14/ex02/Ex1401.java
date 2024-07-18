package section14.ex02;

import java.util.Scanner;

public class Ex1401 {
    public static void main(String[] args) {
        // String numberString = "123";

        // int number = Integer.parseInt(numberString); // NumberFormatException

        // System.out.println(number +1);

        
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("숫자를 입력해 주세요: ");
                int number = scanner.nextInt();

                System.out.println("입력한 값은 " + number + "입니다.");
            } catch (Exception e) {
                System.out.println("숫자가 아닌 값은 입력할 수 없습니다!");
            }
        }

    }
}
