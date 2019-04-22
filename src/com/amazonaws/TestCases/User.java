package com.amazonaws.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazonaws.Pages.AdminPage;
import com.amazonaws.Pages.NewUserPage;
import com.amazonaws.Pages.UserPage;

import Helper.BrowserSetting;



public class User {
	WebDriver driver = BrowserSetting.startBrowser("chrome", "http://ec2-54-84-52-184.compute-1.amazonaws.com:8080/admin/dashboard");
	AdminPage AdminPage=PageFactory.initElements(driver, AdminPage.class);
	UserPage UserPage = PageFactory.initElements(driver,UserPage.class);
	
	@Test 
	public void UserCreation() 
	
	{
		
	AdminPage.click_Users();
	
	UserPage UserPage = PageFactory.initElements(driver,UserPage.class);
	UserPage.create_new_user();
	
	
	NewUserPage NewUserPage = PageFactory.initElements(driver, NewUserPage.class);
	
	NewUserPage.create_new_user("Sujit100", "12345", "suj1@g1mail.com");
	
	 
	WebElement status_bar = driver.findElement(By.cssSelector(".flash"));
	 
	 Assert.assertEquals(status_bar.getText(), "User was successfully created.");
	
	}
	
	
	@Test(dependsOnMethods="UserCreation")
	public void VerifyUserJustCreated() {
		
		driver.navigate().back();
		driver.navigate().back();
		
		//UserPage UserPage = PageFactory.initElements(driver,UserPage.class);
		UserPage.selection_dropdown();
		UserPage.SearchUser("Sujit100");
		UserPage.filter_click();
		
		String result = driver.findElement(By.className("pagination_information")).getText();
		
		Assert.assertEquals(result, "Displaying 1 User");
		
		
		
	}
	

}
