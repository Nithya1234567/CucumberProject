package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPage extends LibGlobal{
	

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
	private WebElement btnLogin;
	
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
