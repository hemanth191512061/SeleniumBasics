package SpicejetApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.manage().deleteAllCookies();
		//to delete specific cookie
		web.manage().deleteCookieNamed("coolieName");
		web.get("https://www.google.com/");
	}

}
