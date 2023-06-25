package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath="//input[@autofocus='autofocus']")
    public WebElement searchBox;

    @FindBy(xpath="//i[@class='sprite svg-search-icon']")
    public WebElement searchButton;

    @FindBy(xpath="//div[@class='fn']")
    public WebElement imageHead;


    @FindBy(xpath="//span[contains(text(),'Steve Jobs')]")
    public WebElement mainHead;


}