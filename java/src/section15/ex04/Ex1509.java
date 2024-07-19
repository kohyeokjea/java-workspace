package section15.ex04;

import java.util.Arrays;

public class Ex1509 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        // 문자 길이
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        int length2 = str2.length();
        System.out.println("Length of str2: " + length2);

        // 문자 접근
        char firstChar = str1.charAt(0);
        System.out.println("FirstChar: " + firstChar);

        char lastChar = str1.charAt(str1.length() - 1);
        System.out.println("LastChar: " + lastChar);

        // 문자열 검색
        int index1 = str1.indexOf("World");
        System.out.println("str1.indexOf: " + index1);

        int index2 = str1.indexOf("World!!");
        System.out.println("str1.indexOf: " + index2); // -1 (없다라는 뜻)

        int index3 = str1.indexOf("o");
        System.out.println("str1.indexOf: " + index3); // 첫번째걸 보여준다.

        int index4 = str1.indexOf("o", 5);
        System.out.println("str1.indexOf: " + index4);

        int index5 = str1.indexOf("O", 5); // -1
        System.out.println("str1.indexOf: " + index5);

        // 문자열 포함 여부
        boolean contains = str1.contains("World");
        System.out.println(contains);

        boolean contains1 = str1.contains("Java");
        System.out.println(contains1);

        // 문자열 변환
        String replaceStr1 = str1.replaceAll("World", "Java");
        System.out.println(replaceStr1);

        replaceStr1 += " " + replaceStr1;

        System.out.println(replaceStr1);

        String replaceStr2 = replaceStr1.replaceAll("Java", "World");
        System.out.println(replaceStr2);

        // 부분 문자열 추출
        String substringStr2 = str2.substring(5, str2.length());
        System.out.println(substringStr2);

        String substringStr3 = str2.substring(5);
        System.out.println(substringStr3);

        // 문자열 비교
        String str3 = new String(str1);
        boolean isEqual = str1.equals(str3);
        System.out.println(isEqual); // true
        System.out.println(str1 == str3); // false

        // 대소문자 변환
        System.out.println(str2.toUpperCase()); // 다 대문자로 변경
        System.out.println(str2.toLowerCase()); // 소문자로 변경

        // 문자열 배열 반환
        String[] str2Arr = str2.split(" ");
        System.out.println(Arrays.toString(str2Arr));

        // 배열을 문자열로 반환
        String str2ArrJoin = String.join(" ", str2Arr);
        System.out.println(str2ArrJoin);

    }
}
