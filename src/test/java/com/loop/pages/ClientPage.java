package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage extends DocuportLoginPage{

    public ClientPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3[.='Choose account']")
    public WebElement chooseAccount;

    @FindBy(xpath = "//span[.=' Continue ']")
    public WebElement continueButton;

    public void chooseAccountFromDropdown(String option){
        Driver.getDriver().findElement(By.xpath("//span[.=' "+ option +" ']/..")).click();
    }
}
