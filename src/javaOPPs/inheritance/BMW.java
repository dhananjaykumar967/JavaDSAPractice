package javaOPPs.inheritance;

public class BMW extends Car {
    int minimumSpeed = 200;

    @Override
    public void start() {
        System.out.println("Car start.....");
    }

    @Override
    public void stop() {
        System.out.println("Car stop.....");
    }

    @Override
    public void engine() {
        System.out.println("Car engine.....");
    }

    public void bmwAutoParking() {
        System.out.println("BMW Auto-parking facilities......");
    }
}
