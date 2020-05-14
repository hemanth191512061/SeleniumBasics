package SpicejetApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.redbus.com/");
		web.manage().window().maximize();
		web.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// WebDriverWait wait=new WebDriverWait(web, 30);
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@class='react-autosuggest__input
		// react-autosuggest__input--open']")));
		WebElement element = web
				.findElement(By.id("src"));
		element.clear();
		element.sendKeys("hyd");
		Thread.sleep(5000);
		element.sendKeys(Keys.ENTER);

		
		  WebElement element2 =
		  web.findElement(By.id("dest")); 
		  element2.clear();
		    element2.sendKeys("che"); 
		   Thread.sleep(5000);
		  element2.sendKeys(Keys.ARROW_DOWN); 
		  element2.sendKeys(Keys.ENTER);
		 	}

}
