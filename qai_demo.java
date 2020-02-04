package qaiii;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qai_demo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwarecertifications.org/");
		driver.findElement(By.xpath("//*[@class='cs-link cs-link-depth-0 cs-sticky-item sf-with-ul']")).click();

	}

}
