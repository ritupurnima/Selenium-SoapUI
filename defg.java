package Demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class defg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\geckodriver.exe");
		WebDriver myD= new FirefoxDriver();
		
		
		myD.manage().window().maximize();
		myD.get("https://www.google.com/");
		System.out.println("Title is :"+myD.getTitle());
		System.out.println("The URL is : "+myD.getCurrentUrl());
		myD.close();

	}

}
