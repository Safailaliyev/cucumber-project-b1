package com.loop.step_definitions;

import com.loop.pages.WikiSearchPage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


import java.lang.module.Configuration;

public class WikiSearchStepDefs {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wiki.url"));

    }
    @When("User types {string} is the wiki search box")
    public void user_types_is_the_wiki_search_box(String StevenPaulJobs) {
        wikiSearchPage.searchBox.sendKeys("Steven Jobs");

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();

    }
    @Then("User sees {string} is in the {string}")
    public void user_sees_is_in_the(String actual, String expected) {
            Assert.assertEquals(Driver.getDriver().getTitle(),actual, expected);
            Assert.assertEquals( wikiSearchPage.mainHead.getText(),actual, expected);
            Assert.assertEquals( wikiSearchPage.imageHead.getText(),actual, expected);
    }

}
