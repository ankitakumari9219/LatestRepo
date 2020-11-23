package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.JobseekersLoginPage;
import pom.SearchApperance_HomePage;

public class SearchAppearanceTest extends BaseTest{

	public SearchAppearanceTest()
	{
		super();
	}
	
	@Test
	public void searchAppearanceProfile()
	{
		JobseekersLoginPage JobseekersLoginPage = new JobseekersLoginPage(driver);	
		SearchApperance_HomePage SearchApperance_HomePage = new SearchApperance_HomePage(driver);
		JobseekersLoginPage.enterUserName();
		JobseekersLoginPage.enterPassword();
		JobseekersLoginPage.loginButton();
		SearchApperance_HomePage.checkSearchAppearances();
		
	}
}
