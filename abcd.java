package Demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class abcd {

			public static void main(String[] args) 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
				WebDriver myD= new ChromeDriver();
				
				
				myD.manage().window().maximize();
				myD.get("https://www.google.co.in/");
				System.out.println("Title is :"+myD.getTitle());
				System.out.println("The URL is : "+myD.getCurrentUrl());
				myD.close();

			}


	}

