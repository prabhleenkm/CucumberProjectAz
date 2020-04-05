package managers;

import org.openqa.selenium.WebDriver;

import pages.LandingPageTest;
import pages.LoginPageTest;
import pages.PortalHomePageTest;
import pages.baseTest;

public class PageObectManager {


	private WebDriver driver;
	private LandingPageTest landingPage;
	private LoginPageTest loginPage;
	private PortalHomePageTest homePage;
	private baseTest base;



	public PageObectManager(WebDriver driver) {

		this.driver = driver;

	}


	public LandingPageTest getlandingPage(){

		return (landingPage == null) ? landingPage = new LandingPageTest(driver) : landingPage;

	}

	public LoginPageTest getloginPage() {

		return (loginPage == null) ? loginPage = new LoginPageTest(driver) : loginPage;

	}


	public PortalHomePageTest gethomePage() {

		return (homePage == null) ? homePage = new PortalHomePageTest(driver) : homePage;

	}

	public baseTest getbase() {

		return (base == null) ? base = new baseTest(driver) : base;

	}



}
