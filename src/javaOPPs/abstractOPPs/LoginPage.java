package javaOPPs.abstractOPPs;

public class LoginPage extends Page {

    int timeout= 20;

    public LoginPage() {
        System.out.println("LoginPage default constructor......");
    }

    public LoginPage(int a) {
        System.out.println("Parametrised LoginPage  constructor......" + a);
    }

    @Override
    public void title() {
        System.out.println("The page title for Login page");
    }

    @Override
    public void url() {
        System.out.println("The url for Login page");
    }

    public void doLogin(String un, String pwd) {
        System.out.println("Login to the app with " + un + " and " + pwd);
    }
}
