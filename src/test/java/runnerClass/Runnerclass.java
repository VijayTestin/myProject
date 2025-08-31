package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/home/ai/eclipse-workspace/Cucumber_beta/src/test/resources/Features.Selectcomp.feature",glue = {"runnerClass"},monochrome = true,plugin = 
{"html:report/webreport.html","json:report/josonreport.json"})
public class Runnerclass {
	

}
