package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_Demo {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//*[contains(@name,'name')]")).sendKeys("Ritu Purnima");
		driver.findElement(By.xpath("//*[contains(@name,'login')]")).sendKeys("ritu.15ec089");
		driver.findElement(By.xpath("//*[contains(@value,'Check availability')]")).click();
		driver.findElement(By.xpath("//*[contains(@name,'passwd')]")).sendKeys("12345");
		driver.findElement(By.xpath("//*[contains(@name,'confirm_passwd')]")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[2]")).click();

		Select s=new Select(driver.findElement(By.id("country")));
		s.selectByVisibleText("American Samoa");
	
		driver.findElement(By.xpath("//*[@src='https://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='USA / Canada (+1)']")).click();
	
	}

}
