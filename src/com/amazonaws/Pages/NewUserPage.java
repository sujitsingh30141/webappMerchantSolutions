/**
 * 
 */
package com.amazonaws.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Sujit
 *This page has locators and methods for NewUser Page
 */
public class NewUserPage {
	
	WebDriver driver;
	public NewUserPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(how=How.ID,using="user_username")
		WebElement new_username;
	
    @FindBy(how=How.ID,using="user_password")
    WebElement password;
    
    @FindBy(how=How.ID,using="user_email")
    WebElement user_email;
    
    @FindBy(how=How.NAME,using="commit")
    WebElement create_user;
    
    public void create_new_user(String userID, String pass, String email)
    {
    	new_username.sendKeys(userID);
    	password.sendKeys(pass);
    	user_email.sendKeys(email);
    	create_user.click();
    	
    }
}
