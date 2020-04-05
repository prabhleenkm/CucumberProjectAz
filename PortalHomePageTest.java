package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//rahulonlinetutor@gmail.com
public class PortalHomePageTest  {
	public  WebDriver driver;
	
	
	public PortalHomePageTest(WebDriver driver) {
		 this.driver = driver;
	     PageFactory.initElements(driver, this);
	 }

	@FindBy(xpath="//li[contains(@class,'lhUser userLoggedIn'")
	private WebElement NavBarLoggedInSection;
	
	
	public boolean isLandingPageDisplayed()
	{
		if (NavBarLoggedInSection.isDisplayed())
		
		{
			
			return true;
		}
			else {
		
		
		return false;
			}
	}
	
	
	
	
	
	
/*public PortalHomePageTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}*/




	
	
	
	
}
