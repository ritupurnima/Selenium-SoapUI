package Demo3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;


public class hijk {

	  public static WebDriver driver;
	  public static String z;
	  public static String di() throws IOException
	 
	{
	driver.manage().window().maximize();
	driver.get(z);
	String y=driver.getCurrentUrl();
	System.out.println("The URL is : "+y);
	driver.close();
	
	if(z.equals(y))
	{
		return "PASS";
	}
	else
	{
		File scrFile=(File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("Desktop\\"));
		return "FAIL";
	}
	}

	public static void main(String[] args) throws IOException 
	{
		Scanner scn=new Scanner(System.in);
		  
	       System.out.println("Enter URL");
	       String z=scn.next() ;
	       
	       System.out.println("enter your choice");
	       int a=scn.nextInt();

		   if(a==1)
		{
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
				driver=new ChromeDriver();
				System.out.println(di());


			}

		}
		else if(a==2)
			
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\geckodriver.exe");
			driver= new FirefoxDriver();
			System.out.println(di())          ;

		}
		else
		{
			System.out.println("Invalid input");
		}
		}


	}

