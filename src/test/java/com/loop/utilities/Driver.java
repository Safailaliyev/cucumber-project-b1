package com.loop.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver(){
    }
    /*
    Making driver instance private
     */

    private static WebDriver driver;

    /*
    reusable method that will return the same driver instance everytime when called
     */

    /**
     * singleton pattern
     * @return
     * @author nsh
     */

    public static WebDriver getDriver(){

        if (driver==null){
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    /**
     * closing driver
     * @author nsh
     */
    public static void closeDriver (){
        if (driver !=null){
            driver.quit();
            driver = null;
        }
    }
}
