package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AgreementSelectionPage;
import pages.Dhashboard;
import pages.LoginPage;
import utilities.Scroll;

public class Login_tc1 {
	WebDriver driver;

	public static LoginPage login;
	public static Dhashboard db;
	public static AgreementSelectionPage an;
	public static Scroll sc;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sit.redirect.contractawardservice.crowncommercial.gov.uk/");
         login=new LoginPage(driver);
         db=new Dhashboard(driver);
         an=new AgreementSelectionPage(driver);
         sc=new Scroll(driver);
         //login page
        login.enteremailaddress("cas_uat_28@yopmail.com");
        login.enterpassword("Password1234!");
        login.clickloginbtn();
        Thread.sleep(3000);
    sc.windowscrollby200();
        //choose commercial agreement
        db.commercialagreement();
     sc.windowscrollby1200();
        //Selecting agreement page
        an.agreementpage();
        
        
	}

}
