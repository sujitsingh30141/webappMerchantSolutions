/**
 * 
 */
package com.amazonaws.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Sujit
 *This Page Contains Locators of User Page
 */
public class UserPage {
	
	WebDriver driver;
	public UserPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="New User")
	WebElement newuser_button;
	
	@FindBy(how=How.NAME,using="commit")
	WebElement Filter;
	
	@FindBy(how=How.XPATH,using="//div[@id='q_username_input']//select")
	WebElement usernameFilter_dropdown;
	
	@FindBy(how=How.ID, using="q_username")
	WebElement username;
	
	public void create_new_user() {
				newuser_button.click();
	}

	public void filter_click() {
		Filter.click();
	}
	public void selection_dropdown() {
		Select choice = new Select (usernameFilter_dropdown);
		choice.selectByVisibleText("Equals");
	}	
	
	public void SearchUser(String name) {
		
		username.sendKeys(name);
	}
	
}
