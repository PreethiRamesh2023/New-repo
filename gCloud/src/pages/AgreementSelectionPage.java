package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AgreementSelectionPage {
	public static JavascriptExecutor j;
static	WebDriver driver;
	
	public AgreementSelectionPage(WebDriver driver) {
		this.driver=driver;
		
	}
	By agreementname=By.id("accordion-default-heading-1");
	By lotname=By.linkText("Further compete your cloud support services");
	public void agreementpage()
	{
		j.executeScript("window.scrollBy(0,1200)");
		driver.findElement(agreementname).click();
		driver.findElement(lotname).click();
	}
	

}
