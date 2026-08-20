package javaOPPs.WebDriverArchInterface;

public class FireFoxDriver implements WebDriver {

    public FireFoxDriver() {
        System.out.println("FireFoxDriver is launched.....");
    }

    @Override
    public void findElement(String name) {
        System.out.println("FireFoxDriver -- findElement" + name);
    }

    @Override
    public void findElements(String name) {
        System.out.println("FireFoxDriver -- findElements" + name);
    }

    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver -- get" + url);
    }

    @Override
    public String getTitle() {
        return "Amazon";
    }

    @Override
    public void click(String elements) {
        System.out.println("FireFoxDriver -- click" + elements);
    }

    @Override
    public void sendsKeys(String elements, String value) {
        System.out.println("FireFoxDriver -- sendkeys" + elements + "value is " + value);
    }

    @Override
    public void close() {
        System.out.println("FireFoxDriver -- close");
    }
}
