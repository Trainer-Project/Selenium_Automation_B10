package golbaltek.ny.hooks;

import golbaltek.ny.basepage.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {
	
	@Before
	public void getLoginApplication() {
		System.out.println("Automation is Started");
		BasePage.getInitialization();
	}
	
	@After
	public void getTearDown() {
		System.out.println("Automation is completed");
		driver.quit();
	}

}
