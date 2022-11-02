package testcases;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.DatePage;

public class DateTest extends BaseClass {
	DatePage datepage;
	@Test
	public void verify_date()
	{
		String date="25-02-2021";
		datepage= new DatePage(driver);
		datepage.click_date_page();
		datepage.select_date(date);
		datepage.click_on_enetr_date_feild();
		
	}

}
