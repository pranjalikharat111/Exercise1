package Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/p/selenium-quesansw.html");
		String parentWinId=driver.getWindowHandle();
		System.out.println("Parent win id is:" +parentWinId);
		driver.findElement(By.xpath("//a[contains(text(),\"Selenium Questions Part1: Selenium and Automation Testing\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Selenium Questions Part3: Theoretical Questions on Selenium\")]")).click();

		Set<String> allWinsId= driver.getWindowHandles();
		System.out.println("All Win Id are:");
		System.out.println("total window size:"+allWinsId.size());
		for(String allId:allWinsId) {
			System.out.println(allWinsId);
		}

		Iterator <String>itr= allWinsId.iterator();
		while(itr.hasNext()) {
			String childWinId= itr.next();
			if(!parentWinId.equalsIgnoreCase(childWinId)) {
				driver.switchTo().window(childWinId);
				System.out.println("Child URL is:"+driver.getCurrentUrl());
				System.out.println("Child Title is:"+driver.getTitle());

				//driver.findElement(By.id("searchInput")).sendKeys("selenium tutorial");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWinId);
		driver.quit();

		//driver.quit();





	}

	private static String ChildWinId() {
		// TODO Auto-generated method stub
		return null;
	}


}
