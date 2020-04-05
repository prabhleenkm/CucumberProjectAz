package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(  
		features =  "D:\\CucumberProject\\original\\E2EProjectCucumber\\src\\test\\resources\\features\\login.feature",
		glue= "stepDefinations",
		plugin = {"pretty","json:target/cucumber-reports/Cucumber.json",
				 "junit:target/cucumber-reports/Cucumber.xml",
				 "html:target/cucumber-reports"},
		 monochrome = true
		
		)
public class TestRunnerTest    {

}
