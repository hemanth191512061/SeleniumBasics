package SpicejetApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		web.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		web.findElement(By.id("name")).sendKeys("nani");
		web.findElement(By.id("alertbtn")).click();
		web.switchTo().alert().accept();
		System.out.println(web.switchTo().alert().getText().contains("nani"));
		
		
		
		
	}

}
