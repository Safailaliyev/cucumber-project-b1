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

    //implemented threadLocal to achieve multithread locally, we created pool for drivers
    private static InheritableThreadLocal<WebDriver> driverPool= new InheritableThreadLocal<>();


    /*
    reusable method that will return the same driver instance everytime when called
     */

    /**
     * singleton pattern
     * @return
     * @author nsh
     */

    public static WebDriver getDriver(){

        if (driverPool.get()==null){
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }


        }
        return driverPool.get();
    }

    /**
     * closing driver
     * @author nsh
     */
    public static void closeDriver (){
        if (driverPool.get() !=null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
