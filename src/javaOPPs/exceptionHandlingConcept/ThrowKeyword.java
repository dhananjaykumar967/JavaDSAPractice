package javaOPPs.exceptionHandlingConcept;

public class ThrowKeyword {
    /**
     * Own customized exception.
     *
     */

    public static void main(String[] args) {
        String a = null;
        String b = "Pramod";
//        if (a == null) {
//            throw new RuntimeException("DATA is not available...");
//        }
        if (b != null) {
            throw new MyOwnExceptionClass("VALUE IS NOT NULL");
        }
    }
}
