package javaOPPs.WebDriverArchInterface;

public class AmazonTest {

    public static void main(String[] args) {
        String browserName = "ei";
//        ChromeDriver driver = new ChromeDriver();
//        FireFoxDriver driver = new FireFoxDriver();
        WebDriver driver = null;

        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FireFoxDriver();
                break;
            default:
                System.out.println("Please pass the right browser name....");
        }

        driver.get("https://mail.google.com/mail/u/0/#label/Jobs+%26+Recruitment/FMfcgzQhVhhQwcDNMqHhjcvJhllXBFDr");
        String title = driver.getTitle();

        if (title.equals("Amazon")) {
            System.out.println("title is correct");
        } else {
            System.out.println("title is incorrect");
        }

        driver.findElement("Amazon logo");
        driver.sendsKeys("Email", "sfdsf@dfsfs.com");
        driver.sendsKeys("password", "sfsfsf");
        driver.click("loginButton");
        driver.close();
    }
}
