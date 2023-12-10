package golbaltek.ny.ruuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	
		plugin= {"pretty","json:target/cucumber.json" }, 
		features = {"./Features/"},
		glue = {"golbaltek.ny.stepdefintions","golbaltek.ny.hooks"},
		tags = "@login"
		)
public class MyRunner extends AbstractTestNGCucumberTests{
}
