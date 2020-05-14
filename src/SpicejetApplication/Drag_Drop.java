package SpicejetApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		web.get("https://jqueryui.com/droppable/");
//		System.out.println(web.findElements(By.cssSelector("[class='demo-frame']")).size());
		web.switchTo().frame(0);
		Actions act=new Actions(web);
		act.dragAndDrop(web.findElement(By.id("draggable")),web.findElement(By.id("droppable"))).build().perform();
	}

}
