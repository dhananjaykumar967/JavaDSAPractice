package javaOPPs.WebDriverArchInterface;

public interface WebDriver extends SearchContext {
    @Override
    public void findElement(String name);

    @Override
    public void findElements(String name);

    public void get(String url);

    public String getTitle();

    public void click(String elements);

    public void sendsKeys(String elements, String value);

    public void close();
}
