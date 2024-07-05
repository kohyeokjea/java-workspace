package section05;

public class Ex0509 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
            if(i==10){
                break;
            }
        }
    }
}
