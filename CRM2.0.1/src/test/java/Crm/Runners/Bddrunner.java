package Crm.Runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
plugin = {"pretty"
        , "html:target/cucumber/report.html"
        , "summary"}
,features = {"src\\test\\resources\\Features"}
,glue = {"Crm.StepDefinations"}
,dryRun=true
,monochrome=true
,tags = "@test"
		)

public class Bddrunner {
  
	
	
}
