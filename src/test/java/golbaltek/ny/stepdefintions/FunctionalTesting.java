package golbaltek.ny.stepdefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalTesting {
	WebDriver driver;
	@Given("User is able to select Jackets from the man module")
	public void user_is_able_to_select_jackets_from_the_man_module() {
		WebDriverManager.chromedriver().setup(); 
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    
	}
	@When("User is able to click on Jupiter All-Weather Trainer from list of jackects")
	public void user_is_able_to_click_on_jupiter_all_weather_trainer_from_list_of_jackects() {
	    
	    
	}
	@When("User is able to select the L size")
	public void user_is_able_to_select_the_l_size() {
	    
	    
	}
	@When("User is able to select the Purple color and {int} quantity")
	public void user_is_able_to_select_the_purple_color_and_quantity(Integer int1) {
	    
	    
	}
	@When("User is able to click on add to cart BTN")
	public void user_is_able_to_click_on_add_to_cart_btn() {
	    
	    
	}
	@When("User is able to click on shopping cart on the top")
	public void user_is_able_to_click_on_shopping_cart_on_the_top() {
	    
	    
	}
	@When("User is able to click on Proceed to Checkout BTN")
	public void user_is_able_to_click_on_proceed_to_checkout_btn() {
	    
	    
	}
	@When("User is able to add the shipping information")
	public void user_is_able_to_add_the_shipping_information() {
	    
	    
	}
	@When("User is able to select shipping method")
	public void user_is_able_to_select_shipping_method() {
	    
	    
	}
	@When("User is able to click next BTN")
	public void user_is_able_to_click_next_btn() {
	    
	    
	}
	@When("User is able to click place order")
	public void user_is_able_to_click_place_order() {
	
	}
	@Then("User can verify the order confirmation Thank you for your purchase!")
	public void user_can_verify_the_order_confirmation_thank_you_for_your_purchase() {
	    
	    
	}
}
