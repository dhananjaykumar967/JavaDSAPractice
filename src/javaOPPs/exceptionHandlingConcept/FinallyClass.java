package javaOPPs.exceptionHandlingConcept;

public class FinallyClass {
    public static String m1() {
        try {
            int i = 9 / 0;
            return "try block";
        } catch (Exception e) {
            return "catch block";
        }finally {
            return "finally block";
        }
    }

    public static void main(String[] args) {
//        try {
//            int i = 9 / 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally block executed");
//        }

        System.out.println(m1());
    }
}
