package SpicejetApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_certifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//general chrome profile
        DesiredCapabilities ch=new DesiredCapabilities();
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        //local chrome browser
		ChromeOptions ch1=new ChromeOptions();
		
		ch1.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver(ch1);
		
	}

}
