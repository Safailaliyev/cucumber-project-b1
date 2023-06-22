package com.loop.step_definitions;

import com.loop.pages.LoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstant;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("test"));

    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(loginPage.login, 10);
        loginPage.username.sendKeys(DocuportConstant.USERNAME_CLIENT);

    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {

        loginPage.password.sendKeys(DocuportConstant.PASSWORD);

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.login.click();

    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {
        loginPage.homeButton.isDisplayed();
    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        loginPage.username.sendKeys(DocuportConstant.USERNAME_EMPLOYEE);
    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        loginPage.password.sendKeys(DocuportConstant.PASSWORD);

    }
    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {
        loginPage.homeButton.isDisplayed();

    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        loginPage.username.sendKeys(DocuportConstant.USERNAME_ADVISOR);
    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {
        loginPage.password.sendKeys(DocuportConstant.PASSWORD);

    }
    @Then("user should see the home page for advisor")
    public void user_should_see_the_home_page_for_advisor() {
        loginPage.homeButton.isDisplayed();

    }

    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
        BrowserUtils.waitForClickable(loginPage.login, 10);
        loginPage.username.sendKeys(DocuportConstant.USERNAME_SUPERVISOR);
    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {
        BrowserUtils.waitForClickable(loginPage.login, 10);
        loginPage.password.sendKeys(DocuportConstant.PASSWORD);

    }
    @Then("user should see the home page for supervisor")
    public void user_should_see_the_home_page_for_supervisor() {
        loginPage.homeButton.isDisplayed();

    }


}
