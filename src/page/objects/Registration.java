package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {
	
	public static final String URL = "http://localhost/izlet/index.php"; 
	private static final String FIRST_NAME = "//input[@name='firstname']";
	private static final String LAST_NAME = "//input[@name='lastname']";
	private static final String USERNAME = "//div[@class='register_form']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//div[@class='register_form']//input[@name='password']";
	private static final String REGISTER = "//input[@id='blue_btn']";
	
// Find First name field
	public static WebElement getFirstName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(FIRST_NAME));
		return wb;
	}

// Click on that field
	public static void clickFirstName(WebDriver dr) {
		getFirstName(dr).click();
	}

// Set First name
	public static void sendKeysFirstName(WebDriver dr, String str) {
		getFirstName(dr).sendKeys(str);
	}
	
	
// Find Last name field
	public static WebElement getLastName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LAST_NAME));
		return wb;
	}

//Click on that field
	public static void clickLastName(WebDriver dr) {
		getLastName(dr).click();
	}

// Set Last Name
	public static void sendKeysLastName(WebDriver dr, String str) {
		getLastName(dr).sendKeys(str);
		
	}
		
// Find Username field
	public static WebElement getUsername(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(USERNAME));
			return wb;
		}

//Click on that field
	public static void clickUsername(WebDriver dr) {
			getUsername(dr).click();
		}

// Set Username
	public static void sendKeysUsername(WebDriver dr, String str) {
			getUsername(dr).sendKeys(str);

}
	
// Find Email field
	public static WebElement getEmail(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EMAIL));
		return wb;
	}

// Click on that field
	public static void clickEmail(WebDriver dr) {
		getEmail(dr).click();
	}

// Set Email
	public static void sendKeysEmail(WebDriver dr, String str) {
		getEmail(dr).sendKeys(str);

}
	
// Find Password field
	public static WebElement getPassword (WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PASSWORD));
		return wb;
	}

// Click on that field
	public static void clickPassword(WebDriver dr) {
		getPassword(dr).click();
	}

// Set Password
	public static void sendKeysPassword(WebDriver dr, String str) {
		getPassword(dr).sendKeys(str);

}
	
// Find Registration button
	public static WebElement getRegister(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(REGISTER));
		return wb;
	}
	
// Click on the button
	public static void clickRegister(WebDriver dr) {
		getRegister(dr).click();
	}
	
	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(URL);
	}
	
	
}
