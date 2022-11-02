package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePage {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='date-picker.php']")
	WebElement todatepage;
	@FindBy(xpath = "//input[@id='single-input-field']")
	WebElement searchfeild;
	
	public DatePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void click_date_page()
	{
		todatepage.click();
	}
	public void click_on_enetr_date_feild()
	{
		searchfeild.click();
	}
	public void select_date(String date)
	{
		click_on_enetr_date_feild();
		String splitArrayString[]= date.split("-");
		String year= splitArrayString[2];
		String day=splitArrayString[0];
		int n= Integer.parseInt(splitArrayString[1]);
		String month= "";
		switch(n)
		{
		case 1: month= "January";
		break;
		case 2: month="February";
		break;
		case 3: month="March";
		break;
		case 4: month="April";
		break;
		case 5: month="May";
		break;
		case 6: month="June ";
		break;
		case 7: month="July ";
		break;
		case 8: month="August ";
		break;
		case 9: month="September";
		break;
		case 10: month="October";
		break;
		case 11: month="November";
		break;
		case 12: month="December";
		break;
			
		}
		System.out.println(month+" "+day+" "+year);
		WebElement nextbutton= driver.findElement(By.xpath("//th[@class='next']"));
		WebElement prevbutton= driver.findElement(By.xpath("//th[@class='prev']"));
		String month_year= month+" "+year;
		while(true)
		{
			String actualMonthYear=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
			if(actualMonthYear.equals(month_year))
			{
				break;
			}
			else if(n>10)
			{
				nextbutton.click();
			}
			else
			{
				prevbutton.click();
			}
		}
		driver.findElement(By.xpath("//td[text()='"+day+"' and @class='day']")).click();
		
	}

}
