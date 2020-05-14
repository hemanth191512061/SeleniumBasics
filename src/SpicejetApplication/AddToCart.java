package SpicejetApplication;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();

		web.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		String[] products = { "Brocolli", "Cucumber", "Carrot", "Tomato" };
		// web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> element = web.findElements(By.xpath("//button[text()='ADD TO CART']"));
		List<WebElement> elements = web.findElements(By.cssSelector("h4.product-name"));
		AddToCart to = new AddToCart();
		to.loopClass(elements, products, element);

		WebDriverWait wait = new WebDriverWait(web, 5);
		web.findElement(By.cssSelector("img[alt='Cart']")).click();
		web.findElement(By.xpath("//button[contains(text(),'PROCEED TO ')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		web.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		web.findElement(By.cssSelector(".promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		web.findElement(By.xpath("//button[text()='Place Order']")).click();

	}

	public void loopClass(List<WebElement> elements, String[] products, List<WebElement> element) {

		int size = elements.size(), j = 0;
		List newArrayList = Arrays.asList(products);
		for (int i = 0; i < size; i++) {

			String[] name = elements.get(i).getText().split("-");
			String formattedName = name[0].trim();

			if (newArrayList.contains(formattedName)) {
				j++;

				System.out.println(elements.isEmpty());
				System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
				// web.findElements(By.xpath("button[text()='ADD TO CART']")).get(i).click();
				element.get(i).click();

				if (j == products.length)
					break;

			}
		}

	}
}
