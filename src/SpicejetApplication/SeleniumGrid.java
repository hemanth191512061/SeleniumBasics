package SpicejetApplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		///set general capabilites of node system
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WINDOWS);
        WebDriver web=new RemoteWebDriver(new URL("https://localhost:4444/wd/console"),dc);
        web.get("https://www.google.com");
	}

}
