package section07;

public class Ex0701 {
    public static void main(String[] args) {
        int[] oddArr = { 1, 3, 5, 7, 9 };

        System.out.println("oddArr\t\t" + oddArr);

        /*
         * []: 배열의 의미
         * i: 정수형(int)
         * 
         * @
         * 251a69d7: 배열 객체 해시코드(16진수 포현)
         */

        System.out.println("oddArr\t\t" + oddArr.length);

        for (int i = 0; i < oddArr.length; i++) {
            System.out.println(oddArr[i]);
        }

        // System.out.println(oddArr[5]); //ArrayIndexOutOfBoundsException
    }
}
