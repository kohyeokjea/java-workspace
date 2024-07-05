package section06;

import java.util.Scanner;

public class Practice0602 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correntPassword = "java";
        String password="";

        while (true) {
            System.out.print("비밀번호를 입력하세요: ");
            password = scanner.nextLine();
            if (correntPassword.equals(password)) {
                System.out.println("확인되었습니다.");
                break;
            } else {
                System.out.println("잘못된 비밀번호입니다.");
            }
        }
        scanner.close();
    }
}
