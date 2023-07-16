package com.loop.step_definitions;

import com.loop.pages.DocuportLoginPage;
import com.loop.pages.ValidateButtonsPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.SoftAssertions;

import static org.junit.Assert.assertTrue;

public class ValidateDocuportButtonsStepDefs {

    DocuportLoginPage docuportLoginPage = new DocuportLoginPage();

    private static final Logger LOG = LogManager.getLogger();

    private SoftAssertions softAssertions = new SoftAssertions();


    ValidateButtonsPage validateButtonsPage = new ValidateButtonsPage();
    @And("click on Received documents")
    public void clickOnReceivedDocuments() {
        BrowserUtils.justWait(3);
        validateButtonsPage.receivedDocs.click();
    }
    @And("validate search button is displayed")
    public void validateSearchButtonIsDisplayed() {
    assertTrue(validateButtonsPage.searchButton.isDisplayed());
    }
    @And("validate download button is displayed")
    public void validateDownloadButtonIsDisplayed() {
        assertTrue(validateButtonsPage.download.isDisplayed());

    }
    @And("validate Received docs is displayed")
    public void validateReceivedDocsIsDisplayed() {
        assertTrue(validateButtonsPage.receivedDocs.isDisplayed());
        
    }
    @Then("click on MyUploads")
    public void clickOnMyUploads() {
        validateButtonsPage.myUploads.click();
        
    }
    @Then("validate MyUploads is displayed")
    public void validateMyUploadsIsDisplayed() {
        assertTrue(validateButtonsPage.myUploads.isDisplayed());
    }

}
