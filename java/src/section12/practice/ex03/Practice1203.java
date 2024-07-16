package section12.practice.ex03;

interface Drivable {
    void drive();
}

interface Flyable {
    void fly();
}

class FlyingCar implements Drivable, Flyable {

    @Override
    public void drive() {
        System.out.println("Driving on the road");
    }

    @Override
    public void fly() {
        System.out.println("Flying in the shy");
    }
}

public class Practice1203 {
    public static void main(String[] args) {
        FlyingCar mFlyingCar = new FlyingCar();

        mFlyingCar.drive();
        mFlyingCar.fly();
    }
}
