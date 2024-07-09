package section07;

public class Practice0706 {
    public static void main(String[] args) {
        // 1. 3*3 크기의 2차원 배열을 선언하고 다음 값을 할당하시오

        // 1 2 3
        // 4 5 6
        // 7 8 9

        int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // 2. for문을 이용해 배열의 모든 요소를 출력하는 프로글램을 작성하시오.

        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] number : numbers) {
            for (int arr : number) {
                System.out.print(arr+" ");
            }
            System.out.println();
        }

    }
}
