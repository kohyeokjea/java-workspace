package section07;

import java.util.Arrays;

public class Ex0706 {
    public static void main(String[] args) {
        // 깊은 복사
        // : 변경하면 다르다 (얕은 복사와 다르다)
        int[] originalArray = { 1, 2, 3, 4, 5 };

        int[] copieArray = Arrays.copyOf(originalArray, originalArray.length);

        copieArray[0] = 200;

        System.out.println("originalArray\t: " + Arrays.toString(originalArray));
        System.out.println("copiedArray\t: " + Arrays.toString(copieArray));

    }
}
