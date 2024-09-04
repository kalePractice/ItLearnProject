package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Vishal, Hope you are doing well");
		WebDriver driver = new ChromeDriver();
		
		//wait statement
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//maximize window
		
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		
		//Login to the nokodr
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vishal.gadewad@enzigma.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vishal@123");
		driver.findElement(By.xpath("//div[@title='Log In']")).click();
		
		//go to layout
		
		driver.findElement(By.xpath("//img[@title='Vishal Gadewad']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select Instance']")).sendKeys("instv");
	    driver.findElement(By.xpath("//li[@title='instv']")).click();
		driver.findElement(By.xpath("//img[@title='Vishal Gadewad']")).click();
	    driver.findElement(By.linkText("Setup")).click();
	    driver.findElement(By.xpath("//span[@title='Business']")).click();
	    driver.findElement(By.xpath("//span[@title='Layouts']")).click();
	    
		
	}

}
