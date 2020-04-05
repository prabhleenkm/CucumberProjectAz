package managers;

public class TestContext {
	
	private WebDriverManager webDriverManager;
	 private PageObectManager pageObjectManager;
	 
	 public TestContext(){
	 webDriverManager = new WebDriverManager();
	 pageObjectManager = new PageObectManager(webDriverManager.getDriver());
	 }
	 
	 public WebDriverManager getWebDriverManager() {
	 return webDriverManager;
	 }
	 
	 public PageObectManager getPageObjectManager() {
	 return pageObjectManager;
	 }


}
