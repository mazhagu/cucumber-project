package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public static WebDriver driver;	
@FindBy(xpath = "//input[@name='username']")
private WebElement username;
@FindBy(xpath = "//input[@name='password']")
private WebElement pass;
@FindBy(xpath = "//input[@name='login']")
private WebElement login;
 String name="azhaguraj";
 String password="@azhagu4687";	

	public Loginpage(WebDriver driver2) {	
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
}
		
	public WebElement getusername() {
	return username;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return login;
}			
}
