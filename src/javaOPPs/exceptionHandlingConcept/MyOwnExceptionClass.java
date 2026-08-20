package javaOPPs.exceptionHandlingConcept;

public class MyOwnExceptionClass extends RuntimeException {
    public MyOwnExceptionClass(String msg) {
        super(msg);
    }
}
