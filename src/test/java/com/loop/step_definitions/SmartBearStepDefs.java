package com.loop.step_definitions;

import com.loop.pages.SmartBearBasePage;
import com.loop.pages.SmartBearLoginPage;
import com.loop.pages.SmartBearOrderPage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SmartBearStepDefs {

SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();
    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartbear.url"));
        smartBearLoginPage.loginSmartBear(ConfigurationReader.getProperty("smart.username"), ConfigurationReader.getProperty("smart.password"));
        Assert.assertTrue(smartBearLoginPage.webOrders.isDisplayed());
        smartBearOrderPage.order.click();
        Assert.assertTrue(smartBearOrderPage.orderHeading.isDisplayed());

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        Select dropdown = new Select(smartBearOrderPage.product);
        dropdown.selectByValue(product);

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        smartBearOrderPage.quantity.sendKeys(quantity.toString());
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName ) {
        smartBearOrderPage.customerName.sendKeys(customerName);

    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        smartBearOrderPage.street.sendKeys(street);

    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        smartBearOrderPage.city.sendKeys(city);

    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        smartBearOrderPage.state.sendKeys(state);

    }
    @When("user enters zip {string}")
    public void user_enters_zip(String zip) {
        smartBearOrderPage.zip.sendKeys(zip);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
//        smartBearOrderPage.card.stream()
//                .filter(element -> element.getAttribute("value").equals(cardType))
//                .findFirst()
//                .ifPresent(WebElement::click);

        for (WebElement each : smartBearOrderPage.card) {
            if(each.getAttribute("value").equals(cardType) ){
                each.click();
                break;
            }
        }


    }
    @When("user enters credit car number {string}")
    public void user_enters_credit_car_number(String cardNumber) {
        smartBearOrderPage.cardNumber.sendKeys(cardNumber);

    }
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String exp) throws InterruptedException {

        smartBearOrderPage.expiration.sendKeys(exp);


    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        smartBearOrderPage.processButton.click();

    }
    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String name) {
        Assert.assertEquals(smartBearOrderPage.orderHeading.getText(), name,"does not match");

    }
    @Then("user should see {string} at the end of the page.")
    public void user_should_see_at_the_end_of_the_page(String successMessage) {
        Assert.assertEquals(smartBearOrderPage.successMessage.getText(), successMessage,"does not match");

    }


}
