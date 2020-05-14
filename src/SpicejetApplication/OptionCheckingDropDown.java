package SpicejetApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;

public class OptionCheckingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://ksrtc.in/oprs-web/guest/home.do");
		web.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		web.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		JavascriptExecutor java= (JavascriptExecutor)web;
		String value="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) java.executeScript(value);
		while(!text.contains("INTERNATION"))
		{
			System.out.println(text);
			web.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			 text=(String) java.executeScript(value);
		}
		
		
	}

}
