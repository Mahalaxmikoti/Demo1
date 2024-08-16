package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Step {
	
	static WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
		 driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		
	   
	}

	@When("user enter valie credentials")
	public void user_enter_valie_credentials() {
	    
		driver.findElement(By.name("firstname"));
	}

	@Then("user will validate url")
	public void user_will_validate_url() {
	    
	   System.out.println(driver.getTitle());
	}

}
