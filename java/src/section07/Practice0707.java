package section07;

public class Practice0707 {
    public static void main(String[] args) {
        // 1. 2차원 배열을 다음과 같이 초기화하시오

        // 10 20 30
        // 40 50 60
        // 70 80 90

        int[][] numbers = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

        // 2. for문을 이용해 배열의 모든 요소의 합을 계산해 출력하는 프로그램을 작성하시오.

        int sum = 0;

        for (int[] number : numbers) {
            for (int arr : number) {
                sum += arr;
            }
        }

        System.out.println("for - 배열의 모든 요소의 합: " + sum);
        System.out.println();

        sum = 0;

        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                sum += numbers[i][j];   
            }
        }
        System.out.println("for - 배열의 모든 요소의 합: " + sum);
        System.out.println();
    }
}
