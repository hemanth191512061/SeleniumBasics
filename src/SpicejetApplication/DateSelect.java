package SpicejetApplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		web.get("https://www.redbus.com/");
		web.findElement(By.xpath("//section[@id='search']/div/div[3]/span")).click();
		System.out.println(web.findElement(By.xpath("(//tr[@class='rb-monthHeader']/td[2])[2]")).getText());
		
		while(!web.findElement(By.xpath("(//tr[@class='rb-monthHeader']/td[2])[2]")).getText().contains("Jun 2022")) {
			
			web.findElement(By.xpath("(//td[@class='next'])[2]")).click();
			//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle'][contains(text(),'Apr 2020')]
			
		
		}
	List<WebElement> ele=web.findElements(By.cssSelector("td.wd.day"));
	
   int size=web.findElements(By.cssSelector("td.wd.day")).size();
   for(int i=0;i<size;i++) {
	   
	   if(ele.get(i).getText().contains("22"))
	   {
		   ele.get(i).click();
	   }
	   
   }

	}

}
