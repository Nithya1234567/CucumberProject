package com.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;
import com.pom.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinBookingPage extends LibGlobal {
	WebDriver driver;
	LoginPage login;
	SearchHotel sh;
	SelectHotel shotel;
	 BookHotel b;
	 ConfirmationPage cp;
	
	@Given("user is on Login page")
	public void user_is_on_Login_page() {
		driver=browserLaunch();
		getUrl("http://www.adactin.com/HotelApp/");
		}

	@When("user enters {string}and{string}")
	public void user_enters_and(String s1, String s2) {
		login = new LoginPage();
		WebElement txtUserName = login.getTxtUserName();
		fill(txtUserName, s1);
		WebElement txtpass = login.getTxtpass();
		fill(txtpass, s2);
	}

	@When("user should click the Login button")
	public void user_should_click_the_Login_button() {
		WebElement btnLogin = login.getBtnLogin();
		click(btnLogin);
	    
	}

	@When("user is on Booking Page")
	public void user_is_on_Booking_Page() {
	    System.out.println("User is on BookingPage");
	}

	@When("user enters {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters(String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {
	   sh = new SearchHotel(); 
	   selectByVisibleText(sh.getLocation(), s3);
	   WebElement hotel = sh.getHotels();
	   selectByVisibleText(hotel, s4);
	   WebElement roomType = sh.getRoomType();
	   selectByVisibleText(roomType, s5);
	   selectByVisibleText(sh.getNumberofRooms(), s6);
	   fill(sh.getCheckInDate(), s7);
	   fill(sh.getCheckOutDate(),s8);
	   selectByVisibleText(sh.getAdultAsPerRoom(), s9);
	   selectByVisibleText(sh.getChildPerRoom(), s10);
	   
	   
	  
	}

	@When("user enters the search button")
	public void user_enters_the_search_button() {
		click(sh.getSearch());
		
	    	}

	@When("user select the hotel")
	public void user_select_the_hotel() {
	   shotel = new SelectHotel();
	   click(shotel.getRadioButton());  		
	}

	@When("user Click the continue page")
	public void user_Click_the_continue_page() {
	    click(shotel.getCont());
	}

	@When("user is on Book a hotel page {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_is_on_Book_a_hotel_page(String s11, String s12, String s13, String s14, String s15, String s16, String s17, String s18) {
	  b = new BookHotel(); 
	  fill(b.getFirstName(), s11);
	  fill(b.getLastName(), s12);
	  fill(b.getAddress(), s13);
	  fill(b.getCcnum(), s14);
	  selectByVisibleText(b.getCcType(), s15);
	  selectByVisibleText(b.getExpMonth(),s16);
	  selectByVisibleText(b.getExpYear(),s17);
	  fill(b.getCvNo(), s18);
	  }

	@When("user Clicks the Book now button")
	public void user_Clicks_the_Book_now_button() {
	click(b.getBooknow());    
	}

	@When("print order Id")
	public void print_order_Id() throws InterruptedException {
	   cp = new ConfirmationPage();
	   Thread.sleep(5000);
	   WebElement orderno = cp.getOrderno();
	   String txt = orderno.getAttribute("value");
	   System.out.println(txt);
	   click(cp.getBookedItinerary());
	   driver.findElement(By.xpath("//input[@value='"+txt+"']/parent::td/preceding-sibling::td")).click();
	   Thread.sleep(3000);
	  cp.getCancelbutton().click();
	  Thread.sleep(7000);
	   simpleAlert();
	   Thread.sleep(3000);
	   
	   
	    
	   
	   
	}

	//@When("user is on Itenerary page")
	//public void user_is_on_Itenerary_page() throws InterruptedException {
		//System.out.println("user is on itenerary page");
		
	   
	//}

	//@Then("user cancels the hotel")
	//public void user_cancels_the_hotel() throws InterruptedException {
	//	Thread.sleep(2000);
		//WebElement cbut = cp.getCancelbutton();
	//(cbut);
	  //  simpleAlert(cbut);
	    
	//}
	


}
