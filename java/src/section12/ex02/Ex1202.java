package section12.ex02;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stoping");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }

    @Override
    void stop() {
        System.out.println("Car is stoping");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }

    @Override
    void stop() {
        System.out.println("Bike is stoping");
    }
}

public class Ex1202 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();
    }
}
