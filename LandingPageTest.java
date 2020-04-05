package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.ConfigFileReader;

public class LandingPageTest {
	public WebDriver driver;
	ConfigFileReader configFileReader;

	String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	public LandingPageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	@FindBy(id = "nav-xshop-container")
	private WebElement NavBar;

	@FindBy(id = "nav-link-accountList")
	private WebElement SignInMouseHover;

	@FindBy(linkText = "Sign in")
	private WebElement signInButton;

	@FindBy(id = "ap_email")
	private WebElement email;

	@FindBy(id = "continue")
	private WebElement continueButton;

	@FindBy(id = "ap_password")
	private WebElement password;

	@FindBy(id = "signInSubmit")
	private WebElement login;

	@FindBy(id = "glow-ingress-block")
	private WebElement afterLogin;

	@FindBy(id = "nav-item-signout")
	private WebElement signOut;

	public void navigateToHomepage() {
		driver.get(configFileReader.getApplicationUrl());

	}

	public void isLandingPageDisplayed() {

		if (driver.getTitle().equals(ExpectedTitle) && NavBar.isDisplayed()) {
			System.out.println("landing page is displayed");
		}

	}

	public void isLoginSuccessfull(String arg1, String arg2) {
		Actions actions = new Actions(driver);

		actions.moveToElement(SignInMouseHover).perform();
		signInButton.click();
		email.sendKeys(arg1);
		continueButton.click();
		password.sendKeys(arg2);
		login.click();

	}
	public void IslandingPageDisplayedAfterLogin() 
	{
		afterLogin.isDisplayed();
		Actions actions = new Actions(driver);
		actions.moveToElement(SignInMouseHover).perform();
		signOut.isDisplayed();
	}
	

}
