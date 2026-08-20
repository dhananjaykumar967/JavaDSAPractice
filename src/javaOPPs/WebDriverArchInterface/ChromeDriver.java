package javaOPPs.WebDriverArchInterface;

public class ChromeDriver implements WebDriver {

    public ChromeDriver() {
        System.out.println("Chrome is launched.....");
    }

    @Override
    public void findElement(String name) {
        System.out.println("ChromeDriver -- findElement" + name);
    }

    @Override
    public void findElements(String name) {
        System.out.println("ChromeDriver -- findElements" + name);
    }

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver -- get" + url);
    }

    @Override
    public String getTitle() {
        return "Amazon";
    }

    @Override
    public void click(String elements) {
        System.out.println("ChromeDriver -- click" + elements);
    }

    @Override
    public void sendsKeys(String elements, String value) {
        System.out.println("ChromeDriver -- sendkeys" + elements + "value is " + value);
    }

    @Override
    public void close() {
        System.out.println("ChromeDriver -- close");
    }
}
