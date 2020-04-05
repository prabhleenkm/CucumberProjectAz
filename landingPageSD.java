package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import managers.TestContext;

import cucumber.api.java.en.Then;

import pages.LandingPageTest;
import pages.LoginPageTest;
import pages.PortalHomePageTest;
//import pages.baseTest;

public class landingPageSD {

	LandingPageTest landingPage;
	LoginPageTest loginPage;
	PortalHomePageTest homePage;
	TestContext testContext;

	public landingPageSD(TestContext context) {
		testContext = context;
		landingPage = testContext.getPageObjectManager().getlandingPage();
	}

	@Given("^Navigate to Amazon homepage$")
	public void navigate_to_amazon() throws Throwable {

		landingPage.navigateToHomepage();
	}

	@When("^Amazon landing page is displayed$")
	public void make_my_trip_landing_page_is_displayed() throws Throwable {

		// Assert.assertTrue("Make my trip landing page is not displayed as
		// expected",landingPage.isLandingPageDisplayed());

		landingPage.isLandingPageDisplayed();
	}

	@Then("^User signs in to the application with \"(.*?)\" and \"(.*?)\"$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page(String arg1, String arg2)
			throws Throwable {

		landingPage.isLoginSuccessfull(arg1, arg2);

	}

	@And("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
		// homePage = pageObjectManager.gethomePage();
		landingPage.IslandingPageDisplayedAfterLogin();

	}

}
