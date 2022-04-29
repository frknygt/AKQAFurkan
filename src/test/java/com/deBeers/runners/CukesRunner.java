package com.deBeers.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue = "com/deBeers/stepDefinitions",
        dryRun = false,
        tags="@wip1"
)
public class CukesRunner {
}
