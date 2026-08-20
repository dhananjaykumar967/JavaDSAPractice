package javaOPPs.superKeyword;

public class Car {
    int speed = 100;

    public Car() {
        System.out.println("Car - Default Constructor");
    }

    public Car(int a) {
        System.out.println("Car - Parametrized Constructor "+ a);
    }

    public void display() {
        System.out.println("Car - display");
    }
}
