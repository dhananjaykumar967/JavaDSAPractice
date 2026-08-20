package javaOPPs.accessModifiers;

public class Cycle {
    /**
     * Same package but non-sub class of any sub package class.
     *
     */
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "Blue";
        c.milage=56;
        c.name="sdfsdf";
    }
}
