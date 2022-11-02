package testcases;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass{
	@Test
	public void verify_homePage_logoPresent()
	{
		HomePage homepage= new HomePage(driver);
		homepage.get_Title();
		homepage.verify_logo_displayed();
		String path= System.getProperty("user.dir");
		System.out.println(path);

	}
}
