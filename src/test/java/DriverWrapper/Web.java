package DriverWrapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver driver;

    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazom.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
