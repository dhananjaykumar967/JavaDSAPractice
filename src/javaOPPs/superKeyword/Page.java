package javaOPPs.superKeyword;

public class Page {
    String name;
    String title;

    /**
     * Use Case of the constructor
     * 1. To initialize the instance variable with local variable within Constructor local variable
     * 2. Used with Getter/ Setter
     * 3. Builder patter: method return this
     * 4. Constructors calling one another withing the same class (but not allowed recursion of constructor calling)
     * */
    public Page() {
        this("Dhananjay", "Mera Desh Mahan");// Always and always the "this" can be used as first statement under any constructor
//        this("Dhananjay", "Mera Desh Mahan");// Not back-to-back "this" is allowed. Only one time and that is also in the form of first statement only
        System.out.println("Default const.......");
    }

    public Page(String name, String title) {
        System.out.println("Parametrized const.......");
        this.name = name;
        this.title = title;
        System.out.println("Name= " + name + " Title= " + title);
//        this();
    }


}
