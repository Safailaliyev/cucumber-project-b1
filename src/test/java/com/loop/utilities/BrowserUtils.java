package com.loop.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class BrowserUtils {

    /**
     * validate if driver switched to expected url and title
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author safail
     * note: usually we do not do validation in method, this is for practicing purposes
     */

    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle){
        expectedUrl = expectedUrl.toLowerCase();
        expectedTitle = expectedTitle.toLowerCase();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }
        }
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    public static void switchToWindow(WebDriver driver, String targetTitle){
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)){
                return;
            }
        }

        driver.switchTo().window(origin);

    }

    /**
     *
     * @param driver
     * @param expectedTitle
     * returns void, assertion is implemented
     * @autor safail
     */

    public static void validateTitle(WebDriver driver, String expectedTitle){
        assertTrue(driver.getTitle().contains(expectedTitle));
    }

    /**
     * Click any link from loop practice
     * @param nameOfPage
     * @author safail
     */

    public static void loopLinkClick(String nameOfPage){
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfPage + "']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    /**
     * method that will hover over
     * @param element
     * @outhor safail
     */

    public static void hoverOverAnyElement(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**
     * method that scrolls to the given element
     * @param element
     * @author safail
     */
    public static void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arquments[0].scrollIntoView(true);", element);
    }

    /**
     * method which scroll to element and click js
     * @param element
     * @author safail
     */

    public static void scrollAndClick(WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    /**
     * this method will double click any given element
     * @param element
     * @author safail
     */
    public static void doubleClick(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick().perform();
    }
    /**
     * waits for providing element to be visible
     * @param element
     * @param timeToWait
     * return element
     * @author safail
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWait){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWait));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * wait for providing element to be not visible
     * @param element
     * @param timeToWait
     * @author safail
     */
    public static void  waitForInVisibility(WebElement element, int timeToWait){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * Waits for provided element to be clickable
     * @param element
     * @param timeout
     * @return
     * @author nsh
     */
    public static WebElement waitForClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    /**
     * method performs a pause
     * @param seconds
     */
    public static void justWait (int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
