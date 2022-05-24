package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumberstepdefination {
	
WebDriver d= null;
	
	@Given("browser is open")
	public void browser_is_open() {
		//String projectPath= System.getProperty("usre.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");	
	    d=new ChromeDriver();
		d.manage().window().maximize();
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	  d.navigate().to("https://hrlabs-at.web.app/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		d.findElement(By.id("input-userName")).sendKeys("admin@gmail.com");
		d.findElement(By.id("input-password")).sendKeys("admin123");
	    
	}

	@And("user click on login")
	public void user_click_on_login() {
		d.findElement(By.id("button-submit")).click();
		  
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		d.get("https://hrlabs-at.web.app/cbag/dashboard");
	   d.close();
	   d.quit();
	}

}
