package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement password;

    @FindBy(className = "v-btn__content")
    public WebElement login;

    @FindBy(xpath="//span[.='Home']")
    public WebElement homeButton;




}
