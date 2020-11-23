package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class JobseekersLoginPage extends BaseTest{

	@FindBy(id="usernameField")
	private WebElement userNameField;
	
	@FindBy(id="passwordField")
	private WebElement passwordField;
	
	@FindBy(xpath="//div[@class=\"action row mb0\"]/div/button")
	private WebElement LoginButton;
	
	public JobseekersLoginPage(WebDriver driver)
	{	
	//this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	
	public void enterUserName()
	{
	    userNameField.sendKeys("ankitakumari9219@gmail.com");
	}
	
	public void enterPassword()
	{
		passwordField.sendKeys("Ankita@007");	
	}
	
	public void loginButton()
	{
		LoginButton.click();
	}

}
