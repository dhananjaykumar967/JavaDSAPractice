package javaOPPs.interfaceOOPs;

public interface UsMedical extends WHO{
    int MIN_FEE= 10;

    public void physioServices();
    public void physioServices(int a);
    public void oncologyServices();
    public void dentalServices();
    public void emergencyServices();

    // Can not be overridden in "static method"
    public static void billing(){
        System.out.println("US -- billing");
    }

    // can have default method with method body: non-static
    // default method can be overridden
    default void helpDesk(){
        System.out.println("US -- helpDesk");
    }

}
