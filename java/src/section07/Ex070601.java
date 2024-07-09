package section07;

import java.util.Arrays;

public class Ex070601 {
    public static void main(String[] args) {

        int[] originalArray = { 1, 2, 3, 4, 5 };

        int[] copieArray = new int[originalArray.length];

        System.arraycopy(originalArray, 1, copieArray, 0, originalArray.length - 2);
        // (원본배열, 복사할 위치, 붙여넣을 배열, 붙여넣을 위치, 복사할 길이)

        // copieArray[0] = 200;

        System.out.println("originalArray\t: " + Arrays.toString(originalArray));
        System.out.println("copiedArray\t: " + Arrays.toString(copieArray));

    }
}
