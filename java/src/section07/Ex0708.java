package section07;

import java.util.Arrays;

public class Ex0708 {
    public static void main(String[] args) {
        int[][] arrs = new int[3][4];

        int index = 0;
        for (int[] arr : arrs) {
            System.out.println("index " + index + ": " + Arrays.toString(arr));
            index++;
        }
        System.out.println();

        int[][] copiedArray = Arrays.copyOf(arrs, arrs.length);

        // 다차원 배열에서는 깊은 복사가 안된다.
        arrs[0][0] = 100;

        index = 0;
        for (int[] arr : arrs) {
            System.out.println("index " + index + ": " + Arrays.toString(arr));
            index++;
        }
        System.out.println();

        index = 0;
        for (int[] arr : copiedArray) {
            System.out.println("index " + index + ": " + Arrays.toString(arr));
            index++;
        }
    }
}
