package javaOPPs.hashMapConcept;

import java.util.Arrays;
import java.util.HashMap;

public class Employee {
    public static void main(String[] args) {
       /**
        * Hashing mechanism
        * 1. Hashing code for 2 or more similar key value could be same.
        * 2. There are total 15 segments by default- 0-14
        * 3. There has to be total 3 blocks under each index: 1-> for hash code, 2-> Key name and third for the value key holds
        * 4. In case of similar hash code of multiple key; new collided node created for each duplicate hashcode on the same index node.
        * 5. There is no limit for the collision where same index gets referred by multiple keys and they will all be connected each other.
        * 6. With reference to point 5th, each node is connected by their previous and next nodes, called LinkedList node. Though from java
        * ---- 8 onwards maximum 8 threshold is 8 which will follow LinkedList, if crosses 8, will become Binary Tree and execute accordingly
        * 7. Similarly, as addition of a key take place with hashing so is the .get("Key_Value")-> as it also check the key hashcode.
        * 8. With Binary tree will help it to follow the tree structure where each node is connected to two node. e.g. left and right so are others.
        * 9. So Hashcode can be duplicate for sure and it is dealt accordingly.
        * 10. Hash code always calculated on the basis of Key only.
        * */

        HashMap<String, String> studentMap = new HashMap<>();
        studentMap.put("Ravi", "A");
        studentMap.put("Ramesh", "C");
        studentMap.put("Vinod", "B");
        studentMap.put("Sonu", "A++");

        System.out.println(studentMap);

        System.out.println("================ Adding Duplicate key ==============");
        studentMap.put("Vinod", "C++");/// there will be no error but Key->Vinod will now hold latest C++ thus duplicate key is not allowed
        System.out.println(studentMap);

        System.out.println("================ Null key ==============");
        studentMap.put(null, null); /// null key is allowed but it go to the first place by default when call upon.
        System.out.println(studentMap);
        studentMap.put(null, "A+"); /// Again no error but null key holds the latest value of null not not more than null key value holds.
        System.out.println(studentMap);

        studentMap.put("Somesh", null); /// Well multiple null values are allowed under with keys
        studentMap.put("Romil", null); /// holds null again
        System.out.println(studentMap);

        System.out.println("================ Get the value with Key ==============");
        System.out.println(studentMap.get("Ravi"));

        /// HashMap don't follows the contiguous memory allocation, just fallow the hashing concept only.
        System.out.println(studentMap.size());
        ///  it has by default 15 segment


        System.out.println("================ What if Key is not available or not been defined ==============");
        System.out.println(studentMap.get("Sunaina")); /// this should return null as this are all the object related.

        System.out.println("================> With String[] as value pair <==============");
        HashMap<String, String[]> countryAndCityMap = new HashMap<>();
        String[] countryCity = {"New Delhi", "Agra", "Jaipur"};

        countryAndCityMap.put("India", countryCity);
        System.out.println(Arrays.toString(countryAndCityMap.get("India")) );


    }
}

