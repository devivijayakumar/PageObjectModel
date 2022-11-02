package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By logoimage= By.xpath("//div[@class='top-logo']//img[@src='images/logo.png']");
	public void verify_logo_displayed()
	{
		WebElement logoelemet= driver.findElement(logoimage);
		if(logoelemet.isDisplayed())
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("logo not displayted");
		}
	}
	public void get_Title()
	{
		System.out.println(driver.getTitle());
		
	}

	public HomePage(WebDriver driver)
	{
		this.driver= driver;
	}
}

