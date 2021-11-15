package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_detail {
	public static WebDriver driver;	
	

	@FindBy(xpath="//input[@name='first_name']")
public WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
public WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
public WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
public WebElement cardno;
	
	@FindBy(xpath="//select[@name='cc_type']")
public WebElement cardtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
public WebElement expmonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
public WebElement expyear;
	
	
	@FindBy(xpath="//input[@name='cc_cvv']")
public WebElement cvv;
	@FindBy(xpath="//input[@name='book_now']")
	public WebElement booknow;
	
	@FindBy(xpath="//input[@name='my_itinerary']")
	public WebElement litinery;
	
	public Payment_detail(WebDriver driver2) {
     this.driver=driver2;
      PageFactory.initElements(driver2,this);
	}
	
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	public WebElement getLitinery() {
		return litinery;
	}
	
	
}
