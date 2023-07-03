package com.loop.step_definitions;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks {
    private static final Logger LOG = LogManager.getLogger();
    @Before
    public void setUp(){
        Driver.getDriver();

        LOG.info("...........START AUTOMATION.......LOOP ACADEMY......");

    }

    @After
    public void tearDown(Scenario scenario){
        //only takes a screenshot when scenario is field
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "Image/png", scenario.getName());
        }
        Driver.closeDriver();
        LOG.info("...........END AUTOMATION.......LOOP ACADEMY.....");
    }
}
