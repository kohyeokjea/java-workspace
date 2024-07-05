package section05;

public class Ex0511 {
    public static void main(String[] args) {
        System.out.println("구구단");
        System.out.println("-----------");

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " ✕ " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
