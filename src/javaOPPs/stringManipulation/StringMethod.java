package javaOPPs.stringManipulation;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String str = "this is my java code and i am so happy";

        System.out.println(str.length());// to get the length of string.
        System.out.println(str.charAt(0));// bring the char at the index provided position.
//        System.out.println(str.charAt(-1));// Exception: StringOutOfBoundException----->

        System.out.println(str.indexOf('i'));//return the index of first occurrence of the char.);
        System.out.println(str.indexOf('i', 3));// return the first occurrence of char after 3 index position.
        System.out.println(str.indexOf('i', str.indexOf('i')));// return the first occurrence of char after 3 index position.

        System.out.println(str.indexOf("naveen"));// if a value is not there in string then it will return -1

        String text = "I am going to am Sheohar am";
        System.out.println(text.replace("am", "OM"));
        System.out.println(text.replaceAll("am", "OM"));

        String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
        String[] langSplit = lang.split("\\_");
        int a = langSplit.length;
        for (String s : langSplit) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(langSplit));

        String a1 = "a.b.c";
        System.out.println(a1.replace(".", "-"));
        System.out.println(a1.replaceFirst(".", "-"));// it replaces the first only

        String word = "I love \"java\" coding"; // "I love "java" coding.
        System.out.println(word);

        String k = " hello     testing    ";
        System.out.println(k.replaceAll("\\s+", " ")); // it will replace all spaces with single space.
        System.out.println(k.replaceFirst(" ", ""));

    }
}
