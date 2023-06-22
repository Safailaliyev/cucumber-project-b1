package com.loop.step_definitions;

import com.loop.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
        Driver.getDriver();
    }

    @After
    public void tearDown(Scenario scenario){
        //only takes a screenshot when scenario is field
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "Image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
