package imagess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Software Testing Professionals ...")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
