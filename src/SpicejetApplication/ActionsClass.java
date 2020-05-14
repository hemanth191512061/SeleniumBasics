package SpicejetApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		web.get("https://www.amazon.in/");
		web.manage().window().maximize();
		Actions act=new Actions(web);
		act.moveToElement(web.findElement(By.cssSelector("#nav-link-accountList"))).contextClick().build().perform();
		act.moveToElement(web.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
		
		
		 

	}

}
