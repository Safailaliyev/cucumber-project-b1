package com.loop.step_definitions;

import com.loop.pages.DocuportBasePage;
import com.loop.pages.DocuportLoginPage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

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

        docuportBasePage.navbar(leftBar.get("client"));
        String actual = docuportBasePage.getNavbar((leftBar.get("client")));

        String expected = leftBar.get("client");
        Assert.assertEquals(expected, actual);

            docuportBasePage.navbar(leftBar.get("advisor"));
            String actual1 = docuportBasePage.getNavbar((leftBar.get("advisor")));

            String expected1 = leftBar.get("advisor");
            Assert.assertEquals(expected, actual);

            docuportBasePage.navbar(leftBar.get("supervisor"));
            String actual2 = docuportBasePage.getNavbar((leftBar.get("supervisor")));

            String expected2 = leftBar.get("supervisor");
            Assert.assertEquals(expected, actual);

            docuportBasePage.navbar(leftBar.get("employee"));
            String actual3 = docuportBasePage.getNavbar((leftBar.get("employee")));

            String expected3 = leftBar.get("employee");
            Assert.assertEquals(expected, actual);
    }

    }
}
