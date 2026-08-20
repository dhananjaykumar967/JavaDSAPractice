package javaOPPs.abstractOPPs;

public class PageTest {
    public static void main(String[] args) {
        /**Since we are creating the LoginPage constructor here that means if there
         .....is any constructor of its parent, that will be called in sequence*/
        LoginPage loginPage = new LoginPage();
        //e.g., the output is given below:
        // Page -- default constructor
        // LoginPage default constructor......
//        e.g., the output is given below:
//         Page -- default constructor
//         LoginPage default constructor......
        LoginPage loginPage1 = new LoginPage(10);

        System.out.println(Page.TIME_OUT);
        System.out.println(LoginPage.TIME_OUT); // same timeout of Page class is called here with child class.

    }

}
