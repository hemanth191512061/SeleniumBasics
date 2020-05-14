package SpicejetApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalScoreCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		int totalScore=0;
		web.get("https://www.cricbuzz.com/live-cricket-scorecard/22711/rsaixi-vs-eng-2-day-practice-match-england-tour-of-south-africa-2019-20");
		WebElement element=web.findElement(By.xpath("(//div[@id='innings_1']/div)[1]"));
		int rows=element.findElements(By.cssSelector("div[id='innings_1'] div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int column=element.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1] //div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-right text-bold']")).size();
		for(int i=0;i<column;i++)
		{
			String score=element.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1] //div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
			int score1=Integer.parseInt(score);
		    totalScore=totalScore+score1;
		}
		
		
     String extras=element.findElement(By.xpath("(//div[text()='Extras'])[1]/following-sibling::div[1]")).getText();
                        totalScore=totalScore+Integer.parseInt(extras);
            System.out.println(totalScore);
     String actualScore=element.findElement(By.xpath("(//div[text()='Total'])[1]/following-sibling::div[1]")).getText();
                           if(totalScore==Integer.parseInt(actualScore))
                           {
                        	   System.out.println("score is matching");
                           }
                           else
                        	   System.out.println("score is not matching");
	}

}
