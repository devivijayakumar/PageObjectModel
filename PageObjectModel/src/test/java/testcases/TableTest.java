package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass 
{
	TablePage tablepage;
	@Test
	public void verify_firstName()
	{
		tablepage= new TablePage(driver);
		tablepage.click_table_button();
		String Expectedresult= "Garrett Winters";
		String Actualresult= tablepage.get_second_person_name();
		System.out.println("second name:"+tablepage.get_second_person_name());
		Assert.assertEquals(Actualresult, Expectedresult);
		
	}
	@Test
	public void verify_persons_office()
	{
		List<String> tabledetails= new ArrayList<String>();
		tablepage= new TablePage(driver);
		tablepage.click_table_button();
		tabledetails= tablepage.PrintDetails();
		System.out.println(tabledetails);
	}
	@Test
	public void verify_person_office()
	{
		tablepage= new TablePage(driver);
		tablepage.click_table_button();
		String officename= tablepage.personOffice("Cedric Kelly");
		System.out.println(officename);
	}

}
