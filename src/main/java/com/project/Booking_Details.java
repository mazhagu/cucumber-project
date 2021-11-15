package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Details {	
	public static WebDriver driver;		
	
	@FindBy(xpath="//select[@name='location']")
	public WebElement loc;
	
	@FindBy(xpath="//select[@name='hotels']")
	public WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	public WebElement roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	public WebElement no_of_rooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	public WebElement cid;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	public WebElement cod;
	
	@FindBy(xpath="//select[@name='adult_room']")
	public WebElement no_of_adults;
	
	@FindBy(xpath="//select[@name='child_room']")
	public WebElement no_of_child;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement seacrh;
	
	@FindBy(xpath="//input[@type='radio']")
	public WebElement selectbut;
	
	public WebElement getNext() {
		return next;
	}

	@FindBy(xpath="//input[@type='submit']")
	public WebElement next;
	
	
	public WebElement getSelectbut() {
		return selectbut;
	}
	public WebElement getSeacrh() {
		return seacrh;
	}
	public Booking_Details(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
}	
	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getCid() {
		return cid;
	}

	public WebElement getCod() {
		return cod;
	}

	public WebElement getNo_of_adults() {
		return no_of_adults;
	}

	public WebElement getNo_of_child() {
		return no_of_child;
	}


	

}
