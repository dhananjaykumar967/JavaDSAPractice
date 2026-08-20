package javaOPPs.inheritance;

public class Car extends Vehicle {

//    int minimumSpeed = 100;

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

    public void carTypeCheck() {

    }
    protected void carPolicyMaker(){

    }
}
