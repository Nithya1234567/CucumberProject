package com.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
 public static WebDriver driver;
	
	 public WebDriver browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\workspace\\CucumberPom\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		takeScreenShot();
		return driver;
		
		
		}
	public void getUrl(String link) {
		driver.get(link);
		takeScreenShot();
		
	}
	
	public void fill(WebElement ele,String name) {
		ele.sendKeys(name);
		takeScreenShot();
		
	}
	public void quit() {
		driver.quit();
	}
	public void click(WebElement click)  {
		click.click();
		takeScreenShot();
}
	public  void selectByVisibleText(WebElement sel, String vt) {
		 new Select(sel).selectByVisibleText(vt);
		 takeScreenShot();
		
		}
	public void selectByIndex(WebElement sel1, Integer index)  {
		new Select(sel1).selectByIndex(index);
		takeScreenShot();
		
	}
	public void selectByValue(WebElement sel2, String value) {
	new Select(sel2).selectByValue(value);
	takeScreenShot();
		}
	public String getTitle() {
		return driver.getTitle();
		
	}
	public String getText(WebElement text) {
		return text.getText();
		}
	public String getAttributetext(WebElement attributeValue) {
		 String attribute = attributeValue.getAttribute("Value");
		 System.out.println(attribute);
		 return attribute;
		 
		
		
		}
	public String generateRandomrData() {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmss");
		String format = sf.format(d);
		return format;
		
				
		}
	public void takeScreenShot()  {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hi\\workspace\\CucumberPom\\src\\test\\resources\\ScreenShot\\"+generateRandomrData()+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}
	public void typeJSFill(WebElement jsfill, String name1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+ name1+"')",jsfill);

	}
	public void simpleAlert()
	{
		Alert a = driver.switchTo().alert();
		a.accept();
		
		takeScreenShot();
	}
	

}
