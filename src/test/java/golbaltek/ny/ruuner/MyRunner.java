package golbaltek.ny.ruuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	
		features = {"./Features/"},
		glue ="golbaltek.ny.ruuner"		
		)
public class MyRunner extends AbstractTestNGCucumberTests{
	
	

}
