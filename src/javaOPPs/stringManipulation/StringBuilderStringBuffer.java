package javaOPPs.stringManipulation;

public class StringBuilderStringBuffer {
    public static void main(String[] args) {
        StringBuffer sbfr = new StringBuffer("Dhananjay");
        // Threadsafe--> during multiple threading or parallel execution it executes in synchronized, hence slower
        sbfr.append("Kumar");
        System.out.println(sbfr);

        StringBuilder sbldr = new StringBuilder("Dhananjay");
        //  Not Threadsafe--> during multiple threading or parallel execution it executes all of them together, hence faster
        sbldr.append("Kumar");
        System.out.println(sbldr);
    }
}
