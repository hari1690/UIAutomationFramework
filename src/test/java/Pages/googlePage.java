package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class googlePage {
	
	protected WebDriver driver;
	
//	private By searchField = By.name("q"); Elements to be declared like wise if we use constructor without pagefactory
	
	
	//Constructor method without Page Factory
/*	public googlePage(WebDriver driver){
		this.driver = driver;
	}*/
	
	//Elements using Pagefactory, do not use cachelookup for complex applications
	@FindBy(name="q")
	@CacheLookup
	WebElement searchField;
	
	/*@FindBy(partialLinkText="Hari") - This is to store all the links with the link text. This is possible only because of pagefactory
	List<WebElement> Links;*/
	
	
	
	
	//pagefactory initialization
	public googlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
/*		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30); This is to avoid no elements issue in ajax pages
		PageFactory.initElements(factory, this);*/ 
		
	}
	
	public void enterSearchBox(String searchTerm) {
		//driver.findElement(searchField).sendKeys(searchTerm);
		searchField.sendKeys(searchTerm);
	}

	
	public void clickEnter() {
		
		searchField.sendKeys(Keys.ENTER);
	}
}
