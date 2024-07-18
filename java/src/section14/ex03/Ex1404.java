package section14.ex03;

import section08.Animal;

public class Ex1404 {
    public static void main(String[] args) {
        try {
            int result = 4 / 2;
            System.out.println(result);

            int[] arr = { 1, 2, 3 };
            System.out.println(arr[3]);

            String numberString = "123a";
            int numbers = Integer.parseInt(numberString);
            System.out.println(numbers);

            String data = null;
            System.out.println(data.toString());

            class Dog extends Animal {
            }
            Animal animal = new Animal();
            Dog dog = (Dog) animal;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        } catch (ClassCastException e) {
            System.out.println("ClassCastException" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
