package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

public class baseTest {

	public WebDriver driver;

	public baseTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\CucumberProject\\original\\E2EProjectCucumber\\src\\main\\java\\browsers\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\CucumberProject\\original\\E2EProjectCucumber\\src\\main\\java\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\CucumberProject\\original\\E2EProjectCucumber\\src\\main\\java\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\CucumberProject\\original\\E2EProjectCucumber\\src\\main\\java\\browsers\\IEDriverServer.exe");
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;

	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//" + result + "screenshot.png"));

	}

}
