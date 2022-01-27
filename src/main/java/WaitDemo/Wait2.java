package WaitDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		  driver.findElement(By.id("testWait123")).click(); 
		WebDriverWait wait= new WebDriverWait(driver, 5);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=\"Welcome To Automation Testing Insider\"]")));
		

		 String titleText=ele.getText(); 
		 System.out.println("msg of text:"+titleText); 
		 // driver.close(); 
		 	}

}

