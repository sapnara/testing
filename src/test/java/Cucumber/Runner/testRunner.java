package Cucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/java/Cucumber/feature"},
        glue = {"Cucumber.steps"})
public class testRunner {
}