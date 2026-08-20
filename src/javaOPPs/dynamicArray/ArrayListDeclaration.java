package javaOPPs.dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDeclaration {
    public static void main(String[] args) {

//        ArrayList<Integer> list =Arrays.asList(10, 20, 30, 40, 50);/// ❌
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);/// ✅
        System.out.println(list);

        /// Immutable
        List<String> listOfString = Arrays.asList("Chrome", "Opera", "Firefox", "Safari");/// ✅
        System.out.println(listOfString);

//        listOfString.add("Another element wi th");/// ❌ Exception: Unsupported exception
        /// Mutable
        ArrayList<String> empList = new ArrayList<>(listOfString);

    }
}
