package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	
	private static final String USERNAME = "//input[@placeholder='username']";
	private static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOG_IN = "//input[@name='login']";
	private static final String LOG_OUT = "//a[@id='logoutBtn']";
	
// Method to open LogIn page
		public static void openLogInPage(WebDriver wd) {
			wd.get(HomePage.URL);
		}
//Navigate to Home Page if some other page is opened
	public static void clickHomePage (WebDriver dr) {
		dr.navigate().to(HomePage.URL);
	}
	
//Find LogIn Username field
	public static WebElement getUsername(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(USERNAME));
		return wb;
	}

//Click on that field
	public static void clickUsername(WebDriver dr) {
		getUsername (dr).click();
	}

//Set LogIn Username
	public static void sendKeysUsername(WebDriver dr, String str) {
		getUsername(dr).sendKeys(str);
	}
	
//Set LogIn Password
	public static WebElement getPassword(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PASSWORD));
		return wb;
	}

//Click on that field
	public static void clickPassword(WebDriver dr) {
		getPassword (dr).click();
	}

//Set LogIn Password
	public static void sendKeysPassword(WebDriver dr, String str) {
		getPassword(dr).sendKeys(str);
	}
	
//Find LogIn Button
	public static WebElement getLog_In(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOG_IN));
		return wb;
	}
	
//Click on that button
	public static void clickLog_In(WebDriver dr) {
		getLog_In(dr).click();
	}
	
	
	/* public static void LogIn (WebDriver dr, String username, String pass) {
		sendKeysUsername (dr, username);
		sendKeysPassword (dr, pass);
	} */
	
//Find LogOut Button
	public static WebElement getLogOut (WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOG_OUT));
		return wb;
	}
	
//Click on that button
	public static void clickLogOut (WebDriver dr, int i) {
		getLogOut(dr).click();
	} 
}
