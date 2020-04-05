package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//rahulonlinetutor@gmail.com
public class LoginPageTest {
	public WebDriver driver;

	public LoginPageTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(className = "capText font16")
	private WebElement continueButton;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(className = "btnContainer appendBottom25 ")
	private WebElement loginButton;

	public boolean enterUserNamePwdToLogin(String uname, String pwd) throws Exception {
		username.sendKeys(uname);
		continueButton.click();
		password.sendKeys(pwd);
		loginButton.click();

		return false;

	}

}
