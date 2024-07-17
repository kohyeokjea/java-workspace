package section14.ex02;

public class Ex1401 {
    public static void main(String[] args) {
        String numberString = "123";

        int number = Integer.parseInt(numberString); // NumberFormatException

        System.out.println(number +1);
    }
}
