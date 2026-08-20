package javaOPPs.hashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcepts {
    public static void main(String[] args) {
        /**
         * TreeMap: It implements the SortedMap interface
         * 1. It stores the elements in sorted order
         * 2. It uses Tree data structure for storing the objects
         * 3. It does not allow null key but allows multiple null values
         * 4. It provides the arrangement of elements in ascending order
         * 5. First preference always goes to numeric if there is alphabetic keys as well. So Numeric > Capital Alphabets > Lower alphabets
         * 6. All Map can be itera ted with the help of K-KeySet and V-entrySet
         * */

        Map<String, String> studentMap = new TreeMap<>();
        studentMap.put("Ravi", "A");
        studentMap.put("Ramesh", "C");
        studentMap.put("Vinod", "B");
        studentMap.put("Sonu", "A++");
        studentMap.put("SUmit", "A++"); /// ✅ do allow multiple duplicate values
        studentMap.put( "12Feast", "God");
        studentMap.put("a12Feast", "God");
        studentMap.put("a12Feast", null);/// ❌ No Exception or Error: but again this is duplicate key "a12Feast" therefore hold the latest value
        studentMap.put("aaaja", "ABC"); /// this will come a the very last of the sorting order according to TreeMap.
//        studentMap.put(null, "A++");/// ❌ Exception: Null pointer exception as TreeMap don't allow null as KEY

        System.out.println(studentMap);
        studentMap.forEach((key,value) -> System.out.println(key+" : "+value));
    }
}
