package com.loop.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.InputMismatchException;

public class DocuportUtils {
    /**
     * logins to the docuport application
     * @param driver, which initialized in test base
     * @param role, comes from docuport constants
     * @author safail
     */
    public static void loginDocuport(WebDriver driver, String role){
        Driver.getDriver().get(ConfigurationReader.getProperty("test"));
        WebElement username = Driver.getDriver().findElement(By.xpath("//label[.='Username or email']//following-sibling::input"));
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));


        switch (role.toLowerCase()){
            case "client":
                username.sendKeys(DocuportConstant.USERNAME_CLIENT);
                password.sendKeys("Group3");
                break;

            case "supervisor":
                username.sendKeys(DocuportConstant.USERNAME_SUPERVISOR);
                password.sendKeys("Group3");
                break;

            case "advisor":
                username.sendKeys(DocuportConstant.USERNAME_ADVISOR);
                password.sendKeys("Group3");
                break;
            case "employee":
                username.sendKeys(DocuportConstant.USERNAME_EMPLOYEE);
                password.sendKeys("Group3");
                break;
            default:throw new InputMismatchException("There is no such a role" + role);
        }
        loginButton.click();

    }

    /**
     * logsout from the application
     * @param driver
     * @author safail
     */


    public static void logOut(WebDriver driver){
        WebElement userIcon = driver.findElement(By.xpath("//div[@class='v-avatar primary']"));
        userIcon.click();
        WebElement logOut = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();
    }
}
