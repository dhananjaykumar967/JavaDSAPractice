package javaOPPs.inheritance;

public class TestClass {
    public static void main(String[] args) {
        Vehicle v = new Car(); //Dynamic method dispatch--- Top casting or Upcasting
        v.start();
        v.stop();
        v.engine();
/**       v.carTypeCheck();// Since the method "carTypeCheck()" is not the part Vehicle class which is overridden from in Car class.*/

/**
 * Down casting: In Java the down casting is not possible
 * */
//        BMW bmw=new Car();// Down casting:
//        BMW bmw = (BMW) new Car();// Down casting: ---> This will through **ClassCastException**
        BMW bmw1= new BMW();
        Car car= new Car();
//        int speed=car.minimumSpeed; // if Car class do have the "minimumSpeed" then with Car class object we can not access the value even if is available in child class. e.g., BMW class.
    }
}
