package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
}
