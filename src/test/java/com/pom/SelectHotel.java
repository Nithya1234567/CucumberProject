package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotel extends LibGlobal{
	
	public SelectHotel()
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy(id="continue")
	private WebElement cont;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getCont() {
		return cont;
	}
	
	
	
	

}
