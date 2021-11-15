package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.helper.FileRedaerManager;
import com.project.BaseClass;
import com.project.Booking_Details;
import com.project.Loginpage;
import com.project.Payment_detail;
import com.runner.Adactin_runner;
import cucumber.api.java.en.*;

public class Adactin_stepdefinition extends BaseClass {
	 	 
	 		public static WebDriver driver=Adactin_runner.driver;
	Loginpage lp=new Loginpage(driver);	
	 Booking_Details bd = new  Booking_Details(driver);
	 Payment_detail pd = new Payment_detail(driver);
		 
	 @Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		 String url = FileRedaerManager.getInstanceCR().geturl();
		   to_get(url);	}

	@When("^user enter the valid user name in the field$")
	public void user_enter_the_valid_user_name_in_the_field() throws Throwable {
		 String username = FileRedaerManager.getInstanceCR().getusername();
		to_sendkeys(lp.getusername(),username);	}

	@When("^user enter the valid password in the field$")
	public void user_enter_the_valid_password_in_the_field() throws Throwable {
		String password = FileRedaerManager.getInstanceCR().getpassword();
	    to_sendkeys(lp.getPass(),password);	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
	     to_click(lp.getLogin());	}
	
	
	@Given("^user redirected to search hotel page$")
	public void user_redirected_to_search_hotel_page() throws Throwable {
	    to_referesh();
	    to_implicit_wait(30);
	}

	@When("^user enter the location detail$")
	public void user_enter_the_location_detail() throws Throwable {
	    to_dropdown(bd.getLoc(),"index","5");
	}

	@When("^user enter the hotel name$")
	public void user_enter_the_hotel_name() throws Throwable {
		to_dropdown(bd.getHotel(),"index","2");
	}

	@When("^user enter the room type$")
	public void user_enter_the_room_type() throws Throwable {
		to_dropdown(bd.getRoomtype(),"index","2");
	}

	@When("^user enter the no\\.of\\.rooms needed$")
	public void user_enter_the_no_of_rooms_needed() throws Throwable {
		to_dropdown(bd.getNo_of_rooms(),"index","6");
	}

	@When("^user enter the Check in Date$")
	public void user_enter_the_Check_in_Date() throws Throwable {
		to_clear(bd.getCid());
		to_sendkeys(bd.getCid(),"01/12/2021");
	}

	@When("^user enter the checkout date$")
	public void user_enter_the_checkout_date() throws Throwable {
		to_clear(bd.getCod());
		to_sendkeys(bd.getCod(),"05/12/2021");
	}

	@When("^user enter the no of adults$")
	public void user_enter_the_no_of_adults() throws Throwable {
		to_dropdown(bd.getNo_of_adults(),"index","3");
	}

	@When("^user enter the no of childs$")
	public void user_enter_the_no_of_childs() throws Throwable {
		to_dropdown(bd.getNo_of_child(),"index" ,"2");
	}

	@When("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
		to_click(bd.getSeacrh());
	}
	@When("^user click the checkbox to conform rooms$")
	public void user_click_the_checkbox_to_conform_rooms() throws Throwable {
		to_click(bd.getSelectbut());
	}

	@Then("^user click the continue button$")
	public void user_click_the_continue_button() throws Throwable {
		to_click(bd.getNext());
	}
	
	@Given("^user redirected to payment page$")
	public void user_redirected_to_payment_page() throws Throwable {
		to_referesh();
	    to_implicit_wait(30);
	}

	@When("^user enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		to_sendkeys(pd.getFirstname(),"azhaguraj");
	}

	@When("^user enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		to_sendkeys(pd.getLastname(),"M");
	}

	@When("^user enter the billing address$")
	public void user_enter_the_billing_address() throws Throwable {
		to_sendkeys(pd.getAddress(),"chennai-60001");
	}

	@When("^user enter the credit card no$")
	public void user_enter_the_credit_card_no() throws Throwable  {
		String card = FileRedaerManager.getInstanceCR().getcardno();
		 to_sendkeys(pd.getCardno(),card);
	}

	@When("^user enter the credit card type$")
	public void user_enter_the_credit_card_type() throws Throwable {
		 to_dropdown(pd.getCardtype(),"index","2");
	}

	@When("^user enter the expiry date$")
	public void user_enter_the_expiry_date() throws Throwable {
		to_dropdown(pd.getExpmonth(),"index","6");
		to_dropdown(pd.getExpyear(), "index", "12");
	}

	@When("^user enter the cvv no$")
	public void user_enter_the_cvv_no() throws Throwable {
		String cvv = FileRedaerManager.getInstanceCR().getcvv();
		
		to_sendkeys(pd.getCvv(),cvv);
	}

	@When("^user click the book now buttom$")
	public void user_click_the_book_now_buttom() throws Throwable {
		 to_click(pd.getBooknow());
	}

	@Then("^user click the my litenary button$")
	public void user_click_the_my_litenary_button() throws Throwable {
		to_click(pd.getLitinery());
	}

}
