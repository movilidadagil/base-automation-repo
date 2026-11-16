package driver;

import config.ConfigReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromiumDriver extends DriverManager{
    @Override
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    @Override
    public void loadProps() {
        ConfigReader.load();
        url = ConfigReader.props.getProperty("url");
        browser = ConfigReader.props.getProperty("browser");
        driver.navigate().to(url);
    }
}
