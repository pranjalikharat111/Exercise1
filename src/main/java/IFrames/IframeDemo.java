package IFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class IframeDemo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();

		List<WebElement> iframeList= driver.findElements(By.tagName("iframe"));
		int TotalIframe =iframeList.size();
		System.out.println("No of Iframe:"+TotalIframe);
		System.out.println("No of iframeId are:");
		for(WebElement iframe: iframeList) {
			System.out.println(iframe.getAttribute("id"));
			if(iframe.getAttribute("id").equals("iframe_b")) {
				driver.switchTo().frame("iframe_b");
				driver.findElement(By.id("searchInput")).sendKeys("iframe testing");
				Thread.sleep(3000);
				driver.switchTo().defaultContent();
				
			}
		}
		boolean btnDisplayed =driver.findElement(By.id("simpleAlert")).isDisplayed();
		System.out.println(btnDisplayed );
		driver.close();
	}

}
