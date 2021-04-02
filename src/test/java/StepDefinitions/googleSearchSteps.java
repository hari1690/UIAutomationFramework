package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.googlePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchSteps {

	WebDriver driver = null;
	googlePage gpage;

	@Given("browser is open")
	public void browser_is_open() {	
		System.out.println("Opening the browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("Passing the URL");
		driver.navigate().to("https://google.com");

	}

	@And("^search using the (.*)$")
	public void search_using_the_search_term(String searchTerm) {
		gpage = new googlePage(driver);
		gpage.enterSearchBox(searchTerm);
		gpage.clickEnter();
		
		/*gpage = new googlePage(driver); If used contructor without page factory
		gpage.enterSearchBox(searchTerm);  
		gpage.clickEnter();*/  

	}

	@Then("^user is on google search page with the correct (.*)$")
	public void user_is_on_google_search_page(String searchTerm) {
		driver.getPageSource().contains(searchTerm);
		driver.close();
	}


}
