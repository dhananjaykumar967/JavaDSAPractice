package javaOPPs.superKeyword;

public class TestCar {

    /**
     * super Keyword:
     * 1. Behave as immediate parent class object: To call parent class method and instance variable
     * 2. To call the immediate parent class constructor.
     * 3. again just like this keyword one first statement should be super in a constructor and shall not be used more than once this
     * 4. the parent has already inherited everything from the grandparent, so grandparent members are reachable through super keyword.
     *
     * */
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.display();
        bmw.driver();
    }

}
