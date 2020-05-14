package SpicejetApplication;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.google.com/");
		   File src=((TakesScreenshot)web).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src, new File("C://users//chinni//Screenshot.png"));
	}

}
