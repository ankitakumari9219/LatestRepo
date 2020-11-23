package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.GetTitle_ProfilePage;
import pom.JobseekersLoginPage;

public class PrintTitleTest extends BaseTest {

	public PrintTitleTest()
	{
		super();
	}
	
	@Test
	public void clickOnProfileName() throws InterruptedException
	{
		JobseekersLoginPage JobseekersLoginPage = new JobseekersLoginPage(driver);	
		GetTitle_ProfilePage GetTitle_ProfilePage = new GetTitle_ProfilePage(driver);
		JobseekersLoginPage.enterUserName();
		JobseekersLoginPage.enterPassword();
		JobseekersLoginPage.loginButton();
		GetTitle_ProfilePage.clickOnName();
		Thread.sleep(5000);
		GetTitle_ProfilePage.getTitle1();
	}
	
}
