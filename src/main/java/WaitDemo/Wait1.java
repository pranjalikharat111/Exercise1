package WaitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		
		 
		  driver.findElement(By.id("testWait123")).click(); 
		  //Thread.sleep(5000);
		  WebElement ele= driver.findElement(By.xpath("//div[text()=\"Welcome To Automation Testing Insider\"]"));
		 String titleText=ele.getText(); 
		 System.out.println("msg of text:"+titleText); 
		  driver.close(); 
		 	}

}

