package tests;


import driver.ChromiumDriver;
import driver.DriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseTest {
    static DriverManager chromeDriver = new ChromiumDriver();

    @BeforeClass
    public static void launchBrowser(){
        chromeDriver.setup();
        chromeDriver.loadProps();
    }

    @AfterClass
    public static void closeBrowser(){
        chromeDriver.quitBrowser();
    }

}
