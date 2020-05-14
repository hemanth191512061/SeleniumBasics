package SpicejetApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		web.get("https://www.spicejet.com");
		web.manage().window().maximize();

		  web.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  web.findElement(By.xpath("//a[@value='BLR']")).click();
		  web.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		 // web.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 

		
		/*
		 * Assert.assertFalse(web.findElement(By.cssSelector(
		 * "input[id*='friendsandfamily']")).isSelected());
		 * web.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		 * System.out.println(web.findElement(By.cssSelector(
		 * "input[id*='friendsandfamily']")).isSelected());
		 * web.findElement(By.cssSelector("input[type='checkbox']"));
		 * Assert.assertTrue(web.findElement(By.cssSelector(
		 * "input[id*='friendsandfamily']")).isSelected());
		 */
		//System.out.println(web.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style"));
		/*
		 * web.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 * if(web.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute(
		 * "style").contains("0.5")) { System.out.println("it is disabled"); } else {
		 * System.out.println(web.findElement(By.id("Div1")).getAttribute("style"));
		 * System.out.println("it is enabled"); }
		 */
		//Assert.assertTrue(web.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("1"));
		web.findElement(By.xpath("(//a[text()='10'])[1]")).click(); 
		  
		web.findElement(By.id("divpaxinfo")).click();
		Select sel=new Select(web.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		sel.selectByIndex(3);
		
		web.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
     
		 
	}

}
