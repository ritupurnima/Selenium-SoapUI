package vtuu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtu_Demo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vturesource.com/vtu-results/");
		driver.findElement(By.xpath("//*[@placeholder='Enter USN']")).sendKeys("1CD19EC001");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='SUBMIT']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
