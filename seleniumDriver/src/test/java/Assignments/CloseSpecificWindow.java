package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {
	public static void main(String[] args) {
		// open browser
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// maximize window
		driver.manage().window().maximize();

		// open url
		driver.get("https://testautomationpractice.blogspot.com/");

		// Search selenium and click on the links

		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit'][@class='wikipedia-search-button']")).click();
//		
//	/*	driver.findElement(By.linkText("Selenium")).click();
//		driver.findElement(By.linkText("Selenium in biology")).click();
//		driver.findElement(By.linkText("Selenium (software)")).click();
//		driver.findElement(By.linkText("Selenium disulfide")).click();
//		driver.findElement(By.linkText("Selenium dioxide")).click();
//		driver.findElement(By.linkText("More »")).click();
//
//		Set<String> ids = driver.getWindowHandles();
//		for (String winId : ids) {
//			System.out.println(winId + "=" + driver.getTitle());
//		}*/
//		
		// Locate the container with the links
       WebElement container = driver.findElement(By.className("wikipedia-search-results"));
       List<WebElement> links=container.findElements(By.tagName("a"));
       for(WebElement link:links) {
    	   System.out.println("Clicking on link" + link.getText());
    	   link.click();
       }

         //Print the number of links
        System.out.println("Number of links: " + links.size());
        String originalId =driver.getWindowHandle();
        
        Set<String> ids = driver.getWindowHandles();
        for(String id:ids) {
        	if(id.equals(originalId))
        	{
        		driver.close();
        		break;
        	}
        }
		
		
		
//		
//		 // Locate the container with the links (use an appropriate locator)
//        WebElement container = driver.findElement(By.className("wikipedia-search-results"));
//
//        // Find all link elements within the container
//        List<WebElement> links = container.findElements(By.tagName("a"));
//
//        // Iterate through the list and click on each link
//        for (WebElement link : links) {
//            try {
//                // Print the text or href of the link before clicking
//                System.out.println("Clicking on link: " + link.getText());
//
//                // Click on the link
//                link.click();
//                // Re-locate the container and links after navigating back
//                container = driver.findElement(By.className("wikipedia-search-results"));
//                links = container.findElements(By.tagName("a"));
//
//            } catch (Exception e) {
//                System.out.println("Exception encountered: " + e.getMessage());
//            }
//        }
		
		
	}
}
