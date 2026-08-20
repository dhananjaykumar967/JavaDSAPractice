package javaOPPs.abstractOPPs;

public abstract class Page {

    static final int TIME_OUT = 10;
    public Page() {
        System.out.println("Page -- default constructor");
    }

    public Page(int a) {
        System.out.println("Page -- Para constructor" + 10);
    }

    public abstract void title();

    public abstract void url();

    // This way no one can override the "displayLogo" method since it is not just "final" but "static" as well.
    public static final void displayLogo() {
        System.out.println("Page -- display logo");
    }

    public void getPageInfo() {
        System.out.println("Page -- getPageInfo");
    }

    /**
     * Extension (default) methods can only be used within an interface
     * */
//    default void getPageData(){
//
//    }
}
