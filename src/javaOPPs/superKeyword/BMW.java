package javaOPPs.superKeyword;

public class BMW extends Car {
    int speed = 100;

    public BMW() {
//        super(); // it will call parent class default constructor
        super(10); // it will call parent class default constructor
//        super(10); // again just like this keyword one first statement should be super in a constructor and shall not be used more than once.
//        this()
        System.out.println("BMW - Constructor");
    }

    public void display() {
        super.display();
        System.out.println("BMW speed " + speed);
        System.out.println("BMW speed " + super.speed);
        System.out.println("BMW - display");
    }

    public void driver() {
        super.display();
        System.out.println(super.speed);
    }
}
