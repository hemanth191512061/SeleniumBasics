package SpicejetApplication;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		web.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(web.findElements(By.tagName("a")).size());
		WebElement footer_links=web.findElement(By.id("gf-BIG"));
		//System.out.println(footer_links.findElements(By.tagName("a")).size());
		
                      WebElement InFooter_links=footer_links.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
                     int size=InFooter_links.findElements(By.tagName("a")).size();
                     for(int i=0;i<size;i++) {
                    	 
                    	 InFooter_links.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
                    	 Thread.sleep(5000);
                    	 
                     }
                     
                     
                     Set<String> handler=web.getWindowHandles();
                    Iterator<String> iterate=handler.iterator();
                     while(iterate.hasNext()) {
                    	
                    	 web.switchTo().window( iterate.next());
                    	 System.out.println(web.getTitle());
                    	 
                    	 
                    	 
                     }
                     
                     
	}

}
