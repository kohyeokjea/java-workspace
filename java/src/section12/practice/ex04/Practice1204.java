package section12.practice.ex04;

interface Machine {
    void start();

    void stop();
}

interface Drivable {
    void drive();
}

interface Flyable {
    void fly();
}

interface FlyingMachine extends Machine, Drivable, Flyable {

}

class FlyingCar implements FlyingMachine {
    @Override
    public void start() {
        System.out.println("Starting the flying car");
    }

    @Override
    public void drive() {
        System.out.println("Driving on the road");
    }

    @Override
    public void fly() {
        System.out.println("Flying in the shy");
    }

    @Override
    public void stop() {
        System.out.println("Stoping the flying car");
    }
}

public class Practice1204 {
    public static void main(String[] args) {
        FlyingCar mFlyingCar = new FlyingCar();

        mFlyingCar.start();
        mFlyingCar.drive();
        mFlyingCar.fly();
        mFlyingCar.stop();
    }
}
