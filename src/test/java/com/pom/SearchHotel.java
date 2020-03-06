package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotel extends LibGlobal {
	
	public SearchHotel()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement Location;
	@FindBy(id="hotels")
	private WebElement Hotels;
	@FindBy(id="room_type")
	private WebElement RoomType;
	@FindBy(id="room_nos")
	private WebElement NumberofRooms;
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="adult_room")
	private WebElement adultAsPerRoom;
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultAsPerRoom() {
		return adultAsPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearch() {
		return search;
	}


}
