package javaOPPs.inheritance;

public class Audi extends Car {

    public Audi(){
        start();
        carPolicyMaker();
    }
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

    public void audiAutoParking() {
        System.out.println("Audi Auto-parking facilities......");
    }

    public void carPolicyMaker(){

    }
}
