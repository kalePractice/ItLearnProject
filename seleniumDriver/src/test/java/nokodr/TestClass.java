package nokodr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
public static void main(String args[]) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://app-staging.nokodr.com");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vishal.gadewad@enzigma.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vishal@123");
	driver.findElement(By.xpath("//div[@title='Log In']")).click();
	driver.findElement(By.xpath("//img[@title='Vishal Gadewad']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Select Instance']")).click();
	driver.findElement(By.xpath("//li[@title='instv']")).click();
	driver.findElement(By.xpath("//img[@title='Vishal Gadewad']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Setup']")).click();
	driver.findElement(By.xpath("//div[@class='slds-tree__item']//span[@title='Schema']")).click();
	driver.findElement(By.xpath("//div[@class='slds-tree__item slds-is-active slds-nav-vertical__item']")).click();
	
}
}
