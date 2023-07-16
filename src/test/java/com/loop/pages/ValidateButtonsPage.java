package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateButtonsPage {

    public ValidateButtonsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement passwordInput;

    @FindBy(className = "v-btn__content")
    public WebElement login;

    @FindBy(xpath="//span[.='Received docs']")
    public WebElement receivedDocs;

    @FindBy(xpath = "//span[.='My uploads']")
    public WebElement myUploads;

    @FindBy(xpath = "//span[.='Search']/span")
    public WebElement searchButton;

    @FindBy(xpath= "//i[@class='v-icon notranslate mdi mdi-menu theme--light']")
    public WebElement burgerButton;

    @FindBy(xpath = "//div[@class='d-flex align-center justify-start justify-sm-end flex-wrap']")
    public WebElement download;


    /**
     *
     *logins to docuport
     * @param username
     * @param password
     * @author safail
     */
    public void loginDocuport(String username, String password){
        BrowserUtils.waitForVisibility(usernameInput, 5);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        BrowserUtils.waitForClickable(login, 5);
        BrowserUtils.clickWithJS(login);
    }
}
