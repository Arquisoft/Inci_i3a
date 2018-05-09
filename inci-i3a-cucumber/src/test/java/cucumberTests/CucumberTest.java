package cucumberTests;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import main.Application;

@SpringBootTest(classes = { Application.class })
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber" ) //,glue = "cucumbertests.steps"
@ContextConfiguration
public class CucumberTest{

}