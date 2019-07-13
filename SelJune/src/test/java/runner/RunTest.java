package runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/resorces/Login.feature",glue= "steps",monochrome=true, dryRun=true)


public class RunTest {

}
