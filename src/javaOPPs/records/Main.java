package javaOPPs.records;

public class Main {
    public static void main(String[] args) {
        var student = new Student(23, "dsfsd", "sdfsdf", "sdfsd");
        System.out.println(student.id());
//        student.name=89; // Since all the data members are by default private and final in nature so once it is defined by the object the becomes immutable not changes with the same object ref.
        var student1 = new Student(45,"Suraj", "Prashant", "3424234");
        System.out.println(student1.id());

    }
}

