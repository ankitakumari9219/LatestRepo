package pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BaseTest;

public class SearchApperance_HomePage extends BaseTest{
	
	@FindBy(xpath="//div[@class=\"searchRecruiter mt5\"]/a[1]/span[1]")
	private WebElement searchAppearance;
	
	public SearchApperance_HomePage(WebDriver driver)
	{	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
public void checkSearchAppearances()
{
	searchAppearance.getText();
	
	System.out.println(searchAppearance.getText());
	String A = "7465";
	String B = searchAppearance.getText();
	Assert.assertEquals(A,B);
	System.out.println(driver.getTitle());
}
}
