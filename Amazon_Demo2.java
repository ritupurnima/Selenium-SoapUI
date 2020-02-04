package xpathhh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Demo2 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fossil watches for men");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Fossil']")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Gen 5')])")).click();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"(nav-flyout-ya-signin)\"]/a/span")).click();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
