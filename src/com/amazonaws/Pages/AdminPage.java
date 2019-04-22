/**
 * 
 */
package com.amazonaws.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Sujit
 * This Class will store locatores and methods of AdminPage
 *
 */
public class AdminPage {
	
	WebDriver driver;
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(id="users") WebElement usermenu;
	
	public void click_Users() {
		usermenu.click();
	}
	
}
