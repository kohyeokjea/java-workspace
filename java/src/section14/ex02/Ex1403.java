package section14.ex02;

class Animal{}
class Dog extends Animal{}

public class Ex1403 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = (Dog)animal; // ClassCastException
    }
}
