package com.itLearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	public DashboardPage(WebDriver lDriver) {
		
		PageFactory.initElements(lDriver, this);		
	}
	@FindBy(xpath="//a[@class=\"lg_button\" and normalize-space()='Dashboard']") WebElement dash;
	@FindBy(xpath="//*[@id=\"learn-press-user-profile\"]/ul/li[3]") WebElement offerAcademeis;
	@FindBy(xpath="//body/div[1]/div[5]/div/div/div/div/main/article/div/div[1]/div/div[2]/div/div/div/ul/li[1]/form/div/button") WebElement subscribeButton;
	
	
	public void dashboardclick() {
		dash.click();
		offerAcademeis.click();
		subscribeButton.submit();		
	}
	
}
