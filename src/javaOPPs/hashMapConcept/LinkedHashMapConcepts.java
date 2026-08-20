package javaOPPs.hashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcepts {
    public static void main(String[] args) {

        /**
         * LinkedHashMap: It extends the HashMap
         * 1. Since HashMap follow Hashing concept and do not maintain insertion order, on the other hand LinkedHashMap maintain the order
         * 2.
         * */
        Map<String, String> studentMap = new LinkedHashMap<>();
        studentMap.put("Ravi", "A");
        studentMap.put("Ramesh", "C");
        studentMap.put("Vinod", "B");
        studentMap.put("Sonu", "A++");
        studentMap.put(null, "A++");

        System.out.println(studentMap);
    }
}
