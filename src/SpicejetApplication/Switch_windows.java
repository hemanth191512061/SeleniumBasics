package SpicejetApplication;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		web.get("https://www.google.com/search?q=facebook&oq=facebook&aqs=chrome..69i57j0l6j5.3943j0j7&sourceid=chrome&ie=UTF-8");
		web.manage().window().maximize();
		web.findElement(By.cssSelector("h3.sA5rQ")).click();
		System.out.println(web.getTitle());
		Set<String> handle=web.getWindowHandles();
		Iterator<String> iterate=handle.iterator();
	   String ParentId=iterate.next();
		web.switchTo().window(ParentId);
		System.out.println("after iterate to next window");
		System.out.println(web.getTitle());
		
		
	}

}
