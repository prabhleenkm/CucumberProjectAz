package pages;

import java.io.IOException;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GenericUtilsTest {
	WebDriver driver;
	 
	    public WebDriverWait wait;
	    public Actions actions;
	    
	   
	    
	   // public void setUp() throws IOException
	    //{
	    	//baseTest instanceDriver=baseTest.getInstance();
	    	//driver=instanceDriver.initializeDriver();
	    //}

		public   boolean navigateToURL(String URL) {
	      
	        try {
	        	 driver.navigate().to(URL);
	        } catch (Exception e) {
	            System.out.println("URL did not load: " + URL);
	            
	        }
			return false;
	    }

	   

		public String getPageTitle() throws Exception {
	        try {
	            System.out.print(String.format("The title of the page is: %s\n\n", driver.getTitle()));
	            return driver.getTitle();
	        } catch (Exception e) {
	            throw new Exception(String.format("Current page title is: %s", driver.getTitle()));
	        }
	    }

	    public WebElement getElement(WebElement element, String string) {
	        try {
	            return driver.findElement((By) element);
	        } catch (Exception e) {
	            System.out.println(String.format("Element %s does not exist - proceeding", element));
	        }
	        return null;
	    }




	    public void sendKeys(WebElement element, String string, String text) throws Exception {
	        
	        clearField(element);
	        try {
	            element.sendKeys(text);
	        } catch (Exception e) {
	            
	        }
	    }

	    public void clearField(WebElement element) {
	        try {
	            element.clear();
	        } catch (Exception e) {
	            System.out.print(String.format("The following element could not be cleared: [%s]", element.getText()));
	        }
	    }


	  /*  public void click(By selector) throws Exception {
	        WebElement element = getElement(selector);
	        waitForElementtobeClickable(selector);
	        try {
	            element.click();
	        } catch (Exception e) {
	            throw new Exception(String.format("The following element is not clickable: [%s]", selector));
	        }
	    }*/
	    
	    public  boolean click(WebElement element, String string) throws Exception {
	       WebElement element1 = getElement(element, string);
	        waitForElementtobeClickable(element1, string);
	        try {
	            element1.click();
	        } catch (Exception e) {
	            throw new Exception(String.format("The following element is not clickable: [%s]", element1));
	        }
			return false;
	    }

		
	    public WebElement waitForElementtobeClickable(WebElement element, String string)
	    {
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
	        System.out.println("Got the element to be clickable within 10 seconds" + element1);
	        return element1;
	    }
	    
		

		/*public  boolean isElementVisible(WebElement element, String string) {
			// TODO Auto-generated method stub
			return false;
		} */

}
