package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class GetTitle_ProfilePage extends BaseTest{

	@FindBy(xpath="//div[@class=\"personal-info col s12 center\"]/div[1]")
	private WebElement name;
	
	public GetTitle_ProfilePage(WebDriver driver)
	{	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	
	public void clickOnName()
	{
		name.click();
	}
	public void getTitle1()
	{
		System.out.println(driver.getTitle());
	}
}
