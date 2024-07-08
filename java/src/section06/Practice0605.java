package section06;

import java.util.Scanner;

public class Practice0605 {
    public static void main(String[] args) {
        // 문자열 입력하세요: java
        // 문자열 뒤집기: avaj

        System.out.println("java".length()); // 4 (문자열)
        System.out.println("java".charAt(1));

        Scanner scanner  = new Scanner(System.in);

        String input;
        String reversed ="";

        System.out.print("문자열을 입력하세요: ");

        input = scanner.nextLine();

        for(int i = input.length()-1; i>=0; i--){
            reversed += input.charAt(i);
        }

        System.out.println(reversed);
        scanner.close();

    }
}
