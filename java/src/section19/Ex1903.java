package section19;

public class Ex1903 {
    static int getDigitCount(int n) {
        int count = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            n = n / 10;
            count++;
        }
        return count;
    }

    static int getDigitCount2(int n) {
        String strNumber = "" + n;
        return strNumber.length();
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(200));
        System.out.println(getDigitCount(2));
        System.out.println(getDigitCount(3999));


        System.out.println(getDigitCount2(33));
        System.out.println(getDigitCount2(102939));
    }
}
