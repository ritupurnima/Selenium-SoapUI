package Googleee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Demo {

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String def="cambridge institute of technology digi notes";
		driver.findElement(By.name ("q")).sendKeys(def);
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();

		String abc=driver.findElement(By.name("q")).getAttribute("value");
	
	     System.out.println(abc);
			if(def.equals(abc))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			driver.quit();
		
	}

}
