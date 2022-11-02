package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass
{
	InputFormPage inputformpage;
@Test
	public void verify_show_message()
	{
	inputformpage = new InputFormPage(driver);
	inputformpage.click_input_page();
	String expectedresult= "devi";
	String actualresult= inputformpage.verify_message_button();
	System.out.println(actualresult);
	Assert.assertEquals(expectedresult, actualresult);
	
	}
	public void input_click()
	{	
		inputformpage = new InputFormPage(driver);
		inputformpage.click_input_page();
		inputformpage.verify_message_feild();
		inputformpage.verify_message_button();
	}
}
