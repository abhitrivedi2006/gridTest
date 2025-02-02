package gridTestCases2;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import utils.Base;

public class Test2SeleniumSite9   {
	public static WebDriver driver;
	//public String gridUrl="http://10.62.234.23:4444";
	
	@Description("Test to verify HomePage")
	@Parameters("gridUrl")
	@Test
	public void testSeleniumPage(String gridUrl) throws Exception {
		ChromeOptions options = new ChromeOptions();
		driver = new RemoteWebDriver(new URL(gridUrl), options);
		driver.get("https://selenium.dev/");
		System.out.println("Url loaded");
		System.out.println("Intentional Wait");
		Base.intentionalWaitValue();
	    WebElement l =driver.findElement(By.tagName("body"));
	    System.out.println("Intentional Wait");
	    Base.intentionalWaitValue();
	    System.out.println("Text content: "+ l.getText());
	    driver.manage().window().maximize();
	    System.out.println("Intentional Wait");
	    Base.intentionalWaitValue();
	    driver.quit();
	}

}
