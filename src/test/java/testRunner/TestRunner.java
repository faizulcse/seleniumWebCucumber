package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\java\\features"},
        glue = "stepDefinitions",
        tags = {"@test-02"}
)

public class TestRunner {
}