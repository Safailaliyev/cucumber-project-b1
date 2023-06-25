package com.loop.step_definitions;
import com.loop.pages.GoogleSearchPage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.List;

public class GoogleSearchStepDefs {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        @Given("user is on Google search page")
        public void user_is_on_google_search_page () {
            Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        }
        @When("user types Loop Academy in the google search box and clicks enter")
        public void user_types_loop_academy_in_the_google_search_box_and_clicks_enter () {
            googleSearchPage.searchBox.sendKeys("Loop Academy"+ Keys.ENTER);
            //googleSearchPage.searchButton.click();
        }
        @Then("user should see Loop Academy - Google Search in the google title")
        public void user_should_see_loop_academy_google_search_in_the_google_title () {
            String actualTittle = Driver.getDriver().getTitle();
        }
        @When("user types {string} in the google search box and click enter")
        public void user_types_in_the_google_search_box_and_click_enter (String input){

            googleSearchPage.searchBox.sendKeys(input + Keys.ENTER);
        }
        @Then("User should see {string} search is in the google title")
        public void user_should_see_search_is_in_the_google_title (String title){


        }

        @Then("user searches the following item")
        public void user_searches_the_following_item (List < String > items) {

//            items.forEach(p -> {
//                googleSearchPage.searchBox.clear();
//                googleSearchPage.searchBox.sendKeys(p + Keys.ENTER);
//                Assert.assertEquals(p, " - Google Search", Driver.getDriver().getTitle());
//            });
            for (String s : items) {
                googleSearchPage.searchBox.clear();
                googleSearchPage.searchBox.sendKeys(s + Keys.ENTER);
                Assert.assertEquals(s + " - Google Search", Driver.getDriver().getTitle());
            }
        }
        @When("user searches for the {string}")
        public void user_searches_for_the (String country) throws InterruptedException {
            googleSearchPage.searchBox.sendKeys("What is the capital of " + country + Keys.ENTER);
            Thread.sleep(3000);

        }
        @Then("user should see the {string} in the result")
        public void user_should_see_the_in_the_result (String capital){
            Assert.assertEquals(googleSearchPage.capital.getText(), capital);

        }


}
