package javaOPPs.accessModifiers;

public class BMW extends Car {
    public static void main(String[] args) {
        BMW bmw = new BMW();
//        I can access public, protected and default data members of Car class.
        bmw.milage = 40;
        bmw.name = "Robert Bratheon";
        bmw.color = "Red";
//        bmw.price=455;// this can not be access as private member shall access within the same class else with public layer of the same class only.
    }
}
