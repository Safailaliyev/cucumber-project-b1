package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocuportBasePage {


        public DocuportBasePage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

//        public void navbar(String advisor){
//            Driver.getDriver().findElement(By.xpath("//span[.='"+ advisor +"']"));
//            BrowserUtils.justWait(1);
//        }
//
//    public String getNavbar(String navbar){
//        String actual = Driver.getDriver().findElement(By.xpath("//span[normalize-space(.)='" +navbar + "']")).getText();
//        return actual.substring(0);



    public void navbar(String navbar1){
        Driver.getDriver().findElement(By.xpath("//span[.='"+ navbar1 +"']"));
        BrowserUtils.justWait(1);
    }

    public String getNavbar(String navbar1){
        return Driver.getDriver().findElement(By.xpath("//span[normalize-space(.)='"+ navbar1 +"']")).getText();
    }



    @FindBy(xpath = "//span[contains(text(),'Clients')]")
    public WebElement client;

    @FindBy(xpath = "//span[contains(text(),'Create new client')]")
    public WebElement createButton;

    @FindBy(xpath = "//span[contains(text(),'Personal')]")
    public WebElement personal;


    @FindBy(xpath = "//label[.= 'First name']/following-sibling::input")
    public WebElement firstName;

    @FindBy(xpath = "//label[.= 'Last name']/following-sibling::input")
    public WebElement lastName;

    @FindBy(xpath = "//label[.= 'Email address']/following-sibling::input")
    public WebElement email;

//    @FindBy(xpath = "//label[.= 'Advisor']/following-sibling::input")
//    public WebElement advisor;

    @FindBy(xpath = "//label[.= 'Phone number']/following-sibling::input")
    public WebElement phone;

    @FindBy(xpath = "//label[.= 'Password']/following-sibling::input")
    public WebElement password;

    @FindBy(xpath = "//label[.= 'Confirm password']/following-sibling::input")
    public WebElement confirmPassword;

    @FindBy(xpath = "//div[@class='v-input--selection-controls__ripple']")
    public WebElement checkBox;

    @FindBy(xpath = "//label[.='Advisor']/../div/div")
    public WebElement advisorDropdown;

    @FindBy(xpath = "//div[contains(text(),'Batch1 Group3')]")
    public WebElement group3;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//label[.='Advisor']/../div/following-sibling::div")
    public WebElement secondAdvisor;

    @FindBy(xpath = "//label[.='Services']/following-sibling::div/div")
    public WebElement services;

    @FindBy(xpath = "//div[contains(text(),'testing')]/../../div/div/div")
    public WebElement testing;

    @FindBy(xpath = "//span[@class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']")
    public WebElement bg;

    @FindBy(xpath = "//span[contains(text(),'Log out')]")
    public WebElement logout;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public WebElement search;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement secondLogin;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement secondPassword;






    //input[@type='text']



    //span[contains(text(),'Search')]


    //div[contains(text(),'Bookkeeping')]/../../div/div/div

    //span[@class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']



//div[contains(text(),'Batch1 Group3')]
    //div[@class='v-input--selection-controls__ripple primary--text']




        ///html/body/div/div[2]/main/nav/div[1]/div[2]/div/div/a[1]/div[2]/div/span
    //i[contains(@class, 'mdi-folder-download')]

//    public BasePage(){
//        PageFactory.initElements(Driver.driver(),this);
//    }
//    public void clickMenuLink(String link){
//        Driver.driver().findElement(By.xpath("//span[.='"+link+"']")).click();
//    }
//
//    public String getTextMenuLinks(String link){
//        return Driver.driver().findElement(By.xpath("//span[.='"+link+"']")).getText();

//    use cucumber framework
//    use page object model design
//if possible apple scenario outline
//
//    task1:
//    create the following pages for docuport
//  - Login Page
//  - Base Page or Common Page
//    and locate the elements
//
//    task2:
//            - validate left navigate items of docuport for 3 user
// - use data table
}
