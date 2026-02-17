package javaDSA.miscellaneous;

public class InstancesReassign {
    String name;
    int age;
    int salary;
    String city;

    public static void main(String[] args) {
        InstancesReassign u1 = new InstancesReassign();
        u1.name = "Dhananjay";
        u1.age = 25;
        u1.salary = 50000;
        u1.city = "Pune";
        InstancesReassign u2 = new InstancesReassign();
        u2.name = "Naveen";
        u2.age = 30;
        u2.salary = 60000;
        u2.city = "Mumbai";

        InstancesReassign u3 = new InstancesReassign();
        u3.name = "Rahul";
        u3.age = 35;
        u3.salary = 70000;
        u3.city = "Delhi";
        InstancesReassign u4 = new InstancesReassign();
        u4.name = "Rohit";
        u4.age = 40;
        u4.salary = 80000;
        u4.city = "Chennai";

        u1 = u2 = u3 = u4;
        System.out.println(u1.name + " " + u1.age + " " + u1.salary + " " + u1.city);
        System.out.println(u2.name + " " + u2.age + " " + u2.salary + " " + u2.city);
        System.out.println(u3.name + " " + u3.age + " " + u3.salary + " " + u3.city);
        System.out.println(u4.name + " " + u4.age + " " + u4.salary + " " + u4.city);
    }
}
