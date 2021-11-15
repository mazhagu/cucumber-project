package com.helper;

import org.openqa.selenium.WebDriver;

import com.project.Booking_Details;
import com.project.Loginpage;
import com.project.Payment_detail;

public class POM_Project {
	
	public static WebDriver driver;
 
 private Loginpage lp;
private Booking_Details bd;
private Payment_detail pd;

public  POM_Project(WebDriver driver2) {
	  this.driver=driver2;
}

 public Payment_detail getPd() {
	 pd=new Payment_detail(driver);
	return pd;
}

public Booking_Details getbd() {	 
bd=new Booking_Details(driver);
	return bd;
}

public Loginpage getLp() {
	lp=new Loginpage(driver);
	return lp;
}

}
