package com.loop.step_definitions;

import com.loop.pages.DocuportBasePage;
import com.loop.pages.DocuportLoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstant;
import com.loop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


import java.util.List;
import java.util.Map;

public class DocuportStepDefs {

    DocuportBasePage docuportBasePage = new DocuportBasePage();
    DocuportLoginPage docuportLoginPage = new DocuportLoginPage();

    @Given("User is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("test"));

    }
    @When("user enters credentials {string} and {string}")
    public void user_enters_credentials_and(String username, String password) {
        docuportLoginPage.usernameInput.sendKeys(username);
        docuportLoginPage.passwordInput.sendKeys(password);

    }
    @When("click login button")
    public void click_login_button() {
        docuportLoginPage.login.click();

    }
    @Then("user should see the home page for each users")
    public void user_should_see_the_home_page_for_each_users(List<Map<String,String>> navbar) {
        for (Map<String, String> leftBar : navbar) {

//            //docuportBasePage.getNavbar(leftBar.get("advisor"));
//            String expected1 = docuportBasePage.getNavbar((leftBar.get("advisor")));
//
//            String actual1 = leftBar.get("advisor");
//            Assert.assertEquals(expected1, actual1);
//
//            //docuportBasePage.getNavbar(leftBar .get("supervisor"));
//            String actual2 = docuportBasePage.getNavbar((leftBar.get("supervisor")));
//
//            String expected2 = leftBar.get("supervisor");
//            Assert.assertEquals(expected2, actual2);
//
//            //docuportBasePage.getNavbar(leftBar.get("employee"));
//            String actual3 = docuportBasePage.getNavbar((leftBar.get("employee")));
//
//            String expected3 = leftBar.get("employee");
//            Assert.assertEquals(expected3, actual3);
//
//           // docuportBasePage.getNavbar(leftBar.get("client"));
//            String actual = docuportBasePage.getNavbar((leftBar.get("client")));
//
//            String expected = leftBar.get("client");
//            Assert.assertEquals(expected, actual);
    }
    }

    @When("login as an advisor")
    public void loginAsAnAdvisor() {
        docuportLoginPage.usernameInput.sendKeys(DocuportConstant.USERNAME_ADVISOR);
        docuportLoginPage.passwordInput.sendKeys(DocuportConstant.PASSWORD);
        docuportLoginPage.login.click();

    }
    String email1 = "hello@worldgmailtest10.com";
    String firstName1 = "Hello";
    String lastName1 = "World";
    String phoneNumber1 = "676767676767";
    String password1 = "Group3";


    @And("create a new client")
    public void createANewClient() throws InterruptedException {
        docuportBasePage.client.click();
        docuportBasePage.createButton.click();
        docuportBasePage.personal.click();
        docuportBasePage.firstName.sendKeys(firstName1);
        docuportBasePage.lastName.sendKeys(lastName1);
        docuportBasePage.checkBox.click();
        docuportBasePage.email.sendKeys(email1);
        docuportBasePage.advisorDropdown.click();
        docuportBasePage.group3.click();
        docuportBasePage.phone.sendKeys(phoneNumber1);
        docuportBasePage.password.sendKeys(password1);
        docuportBasePage.confirmPassword.sendKeys(password1);
        docuportBasePage.saveButton.click();
        Thread.sleep(10000);
        docuportBasePage.secondAdvisor.click();
        docuportBasePage.group3.click();
        docuportBasePage.services.click();
        docuportBasePage.testing.click();
        docuportBasePage.saveButton.click();


    }

    @And("validate that new client created")
    public void validateThatNewClientCreated() {
        docuportBasePage.search.click();
        docuportBasePage.email.click();
        docuportBasePage.email.sendKeys(email1);
        docuportBasePage.saveButton.click();
        Assert.assertEquals(email1, Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + email1 + "')]")).getText() );
    }

    @Then("Log out as an advisor")
    public void logOutAsAnAdvisor() {
        docuportBasePage.bg.click();
        docuportBasePage.logout.click();

    }

    @Then("log as a new client")
    public void logAsANewClient() {
//        docuportLoginPage.secondLogin.sendKeys(email1);
//        docuportLoginPage.secondPassword.sendKeys(password1);
//        docuportLoginPage.login.click();
    }
}
