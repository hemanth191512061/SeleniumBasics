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
		
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver web=new ChromeDriver();
        web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        web.manage().window().maximize();
        web.get("https://www.amazon.in");
        //for mouse over functions use action class and need to build and perform for actions class
        Actions action= new Actions(web);
        
        //go to target element and right(context) click
        action.moveToElement(web.findElement(By.xpath("//span[@class='nav-line-2']"))).contextClick().build().perform();
        
        //select textbox and enter capital letters and select the text
        action.moveToElement(web.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        
        //close driver
        web.close();
        
	
		
		
		 

	}

}
