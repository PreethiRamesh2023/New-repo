package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Dhashboard {
	public static JavascriptExecutor j;
static	WebDriver driver;
	
	public Dhashboard(WebDriver driver) {
		this.driver=driver;
		
	}
	By commercialagree=By.linkText("choose a commercial agreement.");
	public void commercialagreement() 
	{
		j.executeScript("window.scrollBy(0,500)");
		driver.findElement(commercialagree).click();
	}

}
