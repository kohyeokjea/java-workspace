package section10.casting;

class Animal {

}

class Dog extends Animal {

}

class HouseDog extends Dog {

}

class Cat extends Animal {

}

class HouseCat extends Cat {

}

public class Ex1005 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal ad = new Dog();
        Animal ahd = new HouseDog();
        Animal ac = new Cat();
        Animal ahc = new HouseCat();

        // Dog a1 = (Dog)a; //ClassCastException
        Dog ad1 = (Dog) ad; // 자식 타입으로 강제 형변환은 가능

        // HouseDog hd = (HouseDog)ad1; //ClassCastException
        HouseDog hd = (HouseDog) ahd;

        Dog hd2 = (Dog)ahd;

        // Cat c1 = (Cat)ad; //ClassCastException
        System.out.println(ad1);

        /*
         1. 자식에서 부모 타입으로 형변현은 자동
         2. 부모 타입에서 자식 타입으로 형변환은 강제 (조건: 자식에서 부모 타입으로 형변환된 경우)
         */


    }
}
