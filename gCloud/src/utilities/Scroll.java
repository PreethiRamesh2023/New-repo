package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {
	public static JavascriptExecutor j;
static	WebDriver driver;
	
	public Scroll(WebDriver driver) {
		this.driver=driver;
		
	}
	public static void windowscrollby200()
	{
		j.executeScript("window.scrollBy(0,200)");
	}
	public static void windowscrollby500()
	{
		j.executeScript("window.scrollBy(0,500)");
	}
	public static void windowscrollby600()
	{
		j.executeScript("window.scrollBy(0,600)");
	}
	public static void windowscrollby800()
	{
		j.executeScript("window.scrollBy(0,800)");
	}
	public static void windowscrollby1000()
	{
		j.executeScript("window.scrollBy(0,1000)");
	}
	public static void windowscrollby1200()
	{
		j.executeScript("window.scrollBy(0,1200)");
	}


}
