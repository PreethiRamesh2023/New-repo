package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
static	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
By Email=By.id("email");
By Password=By.id("password");
By Loginbtn=By.id("loginButton");
public void enteremailaddress(String email)
{
	driver.findElement(Email).sendKeys(email);
	
}
public void enterpassword(String Pass) {
	driver.findElement(Password).sendKeys(Pass);
	
}
public void clickloginbtn()
{
	driver.findElement(Loginbtn).click();
}
}
