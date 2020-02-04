package rediffff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_mail {

	public static void main(String[] args) throws Exception
	{

				System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.findElement(By.id("login1")).sendKeys("ritu.15ec089@citech.edu.in");
				driver.findElement(By.id("password")).sendKeys("1234567890");
				driver.findElement(By.name("proceed")).click();
				Thread.sleep(1000);
				driver.quit();

	}

}
