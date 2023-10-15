package itea.com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/didihenkelmann/Desktop/ITEA/FirstCucumberProject/src/main/resources/features",
        glue = "com/itea/stepDefinitions",
        tags = "@validData",
        plugin = {"pretty", "json:build/cucumber-report/cucumber.java"})
public class TestRunner {
}
