package section08;

public class Ex0802 {
    int sumFromeOneToTen() {
        int sum = 0;
        int number = 1;
        while (true) {
            sum += number;
            number++;
            if (number > 10) {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Ex0802 sum = new Ex0802();

        int result = sum.sumFromeOneToTen();
        System.out.println(result);
    }
}
