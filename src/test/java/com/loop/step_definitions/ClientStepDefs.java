package com.loop.step_definitions;

import com.loop.pages.ClientPage;
import com.loop.pages.DocuportLoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstant;
import com.loop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import com.loop.pages.ClientPage;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.*;
import org.assertj.core.api.SoftAssertions;

import static org.junit.Assert.*;

import java.util.Map;

import static org.junit.Assert.assertTrue;



public class ClientStepDefs{
    ClientPage clientPage = new ClientPage();
    private static final Logger LOG = LogManager.getLogger();

    private SoftAssertions softAssertions = new SoftAssertions();

    @When("user validates choose account pop up is visible")
    public void user_validates_choose_account_pop_up_is_visible() {
        BrowserUtils.waitForVisibility(clientPage.chooseAccount, 5);
//        assertTrue(clientPage.chooseAccountText.isDisplayed());
//        assertTrue(clientPage.chooseAccountText.getText().equals("Choose Account"));
//        assert (clientPage.chooseAccountText.getText().equals("Choose account"));
        softAssertions.assertThat(clientPage.chooseAccount.getText()).isEqualTo("Loop Academy");
        LOG.info("Account text is visible");
    }

    @When("user chooses account form drop down")
    public void user_chooses_account_form_drop_down() {
        //assertTrue(clientPage.continueButton.isDisplayed());
        softAssertions.assertThat(clientPage.continueButton.isDisplayed()).isTrue();
        softAssertions.assertThat(clientPage.continueButton.getText()).isEqualTo("Loop Academy");
        clientPage.continueButton.click();
        softAssertions.assertAll();
    }
}
