package SpicejetApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		web.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//web.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> elements=web.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> original_array= new ArrayList<String>();
		for(int i=0;i<elements.size();i++) {
			original_array.add(elements.get(i).getText());
			
		}
		System.out.println("fruits in original array");
		for( String fruit: original_array) {
			System.out.println(fruit);
		}
		ArrayList<String> duplicateArray=new ArrayList<String>();
		for(int i=0;i<elements.size();i++) {
			duplicateArray.add(original_array.get(i));
		}
		
		System.out.println("fruits in duplicate array");
		for(String fruits: duplicateArray) {
			
			System.out.println(fruits);
		}
		
		Collections.sort(duplicateArray);
	    Collections.reverse(duplicateArray);
		System.out.println("sorted array list");
		for(String sorted:duplicateArray)
		{
			System.out.println(sorted);
		}
		
		Assert.assertEquals(original_array,duplicateArray,"array are not equal");
		
	}

}
