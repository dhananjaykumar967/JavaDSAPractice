package javaDSA.lamdaExpression;

@FunctionalInterface
interface Car {
    public void bookCab();
}

@FunctionalInterface
interface Truck {
    public void permitRegistration(String state, String district);
}

@FunctionalInterface
interface Auto {
    public String companyName(String companyName);
}

//class Ola implements Car{
//
//    @Override
//    public void bookCab() {
//        System.out.println("Ola cab is booked");
//    }
//}

public class Test {
    public static void main(String[] args) {
//        By using the Lamda Expression we do need to create a class to define the abstract method it implements from the interface
//        We can directly use the lamda expression.
//        Car car = new Ola();
//        car.bookCab();
        Car car = () -> System.out.println("Ola cab is booked");
        car.bookCab();
        Truck truck = (stateName, districtName) -> System.out.println("Truck from state " + stateName + " and district " + districtName + " is registered for AIP");
        truck.permitRegistration("Bihar", "Sheohar");

        Auto auto = (companyName )-> companyName;
        String companyName=auto.companyName("Bajaj three wheeler auto");
        System.out.println(companyName);
    }
}

