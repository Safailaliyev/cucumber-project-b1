package com.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-reports.html", "json:target/json-reports/json-report"},
        features = "src/test/resources/features/",
        glue = "com/loop/step_definitions",
        dryRun = false,
        tags = "@AS",
        monochrome = true
)







public class CukesRunner {
}
