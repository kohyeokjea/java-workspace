package section15.practice.p03;

import java.util.Arrays;

public class Practice1503 {
    public static void main(String[] args) {
        // 1. 문자열 길이를 구하고 출력
        String str = "Hello, World!";
        System.out.println(str.length());

        // 2. 두 문자열을 비교하여 값이 같으면 "같다", 다르면 "다르다"를 출력
        String str1 = "Hello";
        String str2 = "Hello";

        if (str1.equals(str2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다F");
        }

        // 3. 두 문자열을 연결하여 전체 이름을 출력하세요
        String firstName = "일남";
        String lastName = "김";
        System.out.println(lastName + firstName);

        // 4. 문자열 str에서 "World" 부분 문자열을 추출하여 출력
        System.out.println(str.substring(7, str.length()-1));

        // 5. 모든 'o'를 '0'으로 대체하여 출력하세요
        System.out.println(str.replaceAll("o", "0"));

        // 6. 문자열을 콤마를 기준으로 분리하여 각각의 단어를 출력하세요
        String str5 = "Apple, Banana, Cherry";  
        String[] str4 = str5.split(", ");
        System.out.println(Arrays.toString(str4));

        // 7. 양쪽의 공백을 제거한 후 출력
        String str6  = "   Hello, World!   ";
        String trimmedStr6 = str6.trim();
        System.out.println(trimmedStr6);
    }
}
