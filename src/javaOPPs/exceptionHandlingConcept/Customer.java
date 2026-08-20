package javaOPPs.exceptionHandlingConcept;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Hello world");

        try{
            int i=9/0;
            System.out.println("I don't care");
        }
        /**
         * Means we can use n numbers of exceptions with "|" single Gate Logic as well or we can use multiple catch block as well.
         * */
        catch (ArithmeticException | NullPointerException | ClassCastException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured");
            e.printStackTrace();
        }
    }
}
