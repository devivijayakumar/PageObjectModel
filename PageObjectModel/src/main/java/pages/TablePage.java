package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypackage.UtilityExample;

public class TablePage {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='table-pagination.php']")
	WebElement TableLink;
	@FindBy(xpath = "//tbody//tr[2]//td[1]")
	WebElement TablePersonName;
	
	public TablePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void click_table_button()
	{
		TableLink.click();
	}
	public String get_second_person_name()
	{
		UtilityExample UtilityExample= new UtilityExample(driver);
		return UtilityExample.getTextofElements(TablePersonName);
		
	}
	public List <String> PrintDetails()
	{
		List <String> tabledetails= new ArrayList<String>();
		UtilityExample UtilityExample= new UtilityExample(driver);
		tabledetails= UtilityExample.get_TextofElements("//tbody//tr//td[3]");
		System.out.println(tabledetails);
		return tabledetails;
	}
	public String personOffice(String name)
	{
		List<String> namelist= new ArrayList<String>();
		UtilityExample utilityexample= new UtilityExample(driver);
		namelist= utilityexample.get_TextofElements("//tbody//tr//td[1]");
		int i;
		for(i=0; i<namelist.size(); i++)
		{
			if(name.equals(namelist.get(i)))
			{
				i++;
				break;
			}
		}
		WebElement officetext= driver.findElement(By.xpath("//tbody//tr["+i+"]//td[3]"));
		String officename= officetext.getText();
		return officename;
	}

}
