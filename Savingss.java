package youcandeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Savingss {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youcandealwithit.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/ul/li[5]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("food")).sendKeys("100");
	    driver.findElement(By.id("clothing")).sendKeys("10");
	    driver.findElement(By.id("shelter")).sendKeys("50");
	    driver.findElement(By.id("monthlyPay")).sendKeys("500");
	    driver.findElement(By.id("monthlyOther")).sendKeys("50");
	    Thread.sleep(1000);
	    
	    String expense= driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	    System.out.println("Monthly expense is="+expense);
	    
	    String income = driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
	    System.out.println("Monthly expense is="+income);
	    
	    float myexpense=Float.parseFloat(expense);
	    float myincome=Float.parseFloat(income);
	    if(myexpense>myincome)
	    {
	    	System.out.println("You are very poor");
	    }
	    else
	    {
	    	System.out.println("You Re Warren Buffet");
	    }
	    
	}

}
