package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class ConfirmationPage extends LibGlobal {
	
	public ConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderno;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement BookedItinerary;
	//@FindBy(xpath="//input[@value='"+txt+"']/parent::td/preceding-sibling::td")
	//private WebElement cancelRadio;
	@FindBy(name="cancelall")
	private WebElement cancelbutton;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}
	//public WebElement getCancelRadio() {
		//return cancelRadio;
	//}
	public WebElement getCancelbutton() {
		return cancelbutton;
	}
	
	
	
	

}
