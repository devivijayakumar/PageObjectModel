package utilitypackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityExample {
	WebDriver driver;
	public String getTextofElements(WebElement element)
	{
		return element.getText();
	}
	public UtilityExample(WebDriver driver)
	{
		this.driver= driver;
	}
	public List <String> get_TextofElements(String xpath)
	{
		List <WebElement> elements= driver.findElements(By.xpath(xpath));
		List <String> textelemet= new ArrayList<String>();
		for(WebElement E: elements )
		{
			textelemet.add(E.getText());
		}
		return textelemet;
		
	}

}
