package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	WebDriver driver;
	By inputpage=By.xpath("//a[@href='simple-form-demo.php']");
	By showmsgfeild= By.xpath("//input[@id='single-input-field']");
	By showmsgbutton= By.xpath("//button[@id='button-one']");
	public void click_input_page()
	{
		WebElement inputelement= driver.findElement(inputpage);
		inputelement.click();
	}
	public void verify_message_feild()
	{
		WebElement messagefeild= driver.findElement(showmsgfeild);
		messagefeild.sendKeys("devi");
	}
	public String verify_message_button()
	{
		WebElement messagebutton= driver.findElement(showmsgbutton);
		messagebutton.click();
		return messagebutton.getText();
		
	}
	public InputFormPage(WebDriver driver)
	{
		this.driver= driver;
	}

}
