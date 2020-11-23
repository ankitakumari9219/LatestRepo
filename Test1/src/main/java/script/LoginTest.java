package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.JobseekersLoginPage;

public class LoginTest extends BaseTest {
	
	public LoginTest()
	{
		super();
	}
		
@Test
public void NaukriLogin()
{
	JobseekersLoginPage JobseekersLoginPage = new JobseekersLoginPage(driver);	
	JobseekersLoginPage.enterUserName();
	JobseekersLoginPage.enterPassword();
	JobseekersLoginPage.loginButton();
}
}
