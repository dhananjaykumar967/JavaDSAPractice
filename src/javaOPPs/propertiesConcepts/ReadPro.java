package javaOPPs.propertiesConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPro {
    public final static String CONFIG_FILE_PATH = "./src/javaOPPs/propertiesConcepts/config.properties";
    public static Properties properties;

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(CONFIG_FILE_PATH);
            properties = new Properties();
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browserName = properties.getProperty("browser"); /// getting the property value with Key. e.g., "browser"
        System.out.println(browserName);

        /// setting the property value with Key. e.g., "browser" on the fly. That does not change the physical value but applied on runtime.
        properties.setProperty("browser", "Opera");
        browserName = properties.getProperty("browser");
        System.out.println(browserName);

        properties.setProperty("version", "99.98"); /// same way set the key-value pair on the fly.
        String browserVersion = properties.getProperty("version");
        System.out.println(browserVersion);


    }
}
