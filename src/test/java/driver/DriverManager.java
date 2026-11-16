package driver;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    static WebDriver driver;
    public abstract void setup();
    public abstract void loadProps();

    String defaultProfile="";
    String browser = "";
    String url="";
    public static WebDriver getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public void quitBrowser(){
        driver.quit();
    }
}
