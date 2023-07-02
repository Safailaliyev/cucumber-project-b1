package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage  extends SmartBearBasePage{
     public  SmartBearLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='ctl00_MainContent_username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_login_button']")
    public WebElement loginInput;


    public void loginSmartBear(String username, String password){
        BrowserUtils.waitForVisibility(usernameInput, 5);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        BrowserUtils.waitForClickable(loginInput, 5);
        BrowserUtils.clickWithJS(loginInput);

    }
}
