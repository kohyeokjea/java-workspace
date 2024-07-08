package section07;

import java.util.Arrays;

public class Ex0705 {
    public static void main(String[] args) {
        // 얕은 복사
        // : 복사하면 어느 하나를 변경하든 같이 변경
        int[] originalArray = { 1, 2, 3, 4, 5 };

        int[] copieArray = originalArray;

        originalArray[0] = 100;
        copieArray[0] = 200;

        System.out.println("originalArray\t: " + Arrays.toString(originalArray));
        System.out.println("copiedArray\t: " + Arrays.toString(copieArray));

    }
}
