package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DeleteAndEditPost {
	
	public static final String DASHBOARD_URL = "http://localhost/izlet/dashboard.php";
	
	private static final String POSTS = "posts"; //class
	private static final String DOTS = "fa-ellipsis-v"; //class
	private static final String EDIT = "fa-edit"; //class
	private static final String DELETE = "fa-trash-alt"; //class
	
	private static final String EDIT_TITLE ="//input[@id='title']"; //path
	private static final String EDIT_LOCATION = "//input[@id='location']"; //path
	private static final String CHANGE_IMG = "//input[@id='location']"; //path
	private static final String EDIT_TRANSPORT = "//select[@id='transport']"; //path
	private static final String EDIT_DESCRIPTION = "//textarea[@id='description']"; //path
	private static final String EDIT_POST = "//div[@class='popupEdit']//input[@name='postSubmit']"; //path
	
// Method to find Post to Edit/Delete
//pn - post number
	public static WebElement getPostToEdit(WebDriver dr, int pn) {
		List<WebElement> list = dr.findElements(By.className(POSTS));
		WebElement wb = list.get(pn);
		return wb;
	}
	
// Method to click on Post to Edit/Delete
	public static void clickPostToEdit(WebDriver dr, int pn) {
		getPostToEdit(dr, pn).click();
	}
	
// Method to find More options button
	public static WebElement getMore(WebDriver dr, int i) {
		clickPostToEdit(dr, i);
		List<WebElement> list = dr.findElements(By.className(DOTS));
		WebElement wb = list.get(i);
		return wb;
	}
	
// Method to click More options button
	public static void clickMore(WebDriver dr, int i) {
		getMore(dr, i).click();
	}


// Method to find Edit element
	public static WebElement getEdit(WebDriver dr, int i) {
		clickMore(dr, i);
		List<WebElement> list = dr.findElements(By.className(EDIT));
		WebElement wb = list.get(i);
		return wb;
	}
	
// Method to click Edit post
	public static void clickEdit(WebDriver dr, int i) {
		getEdit(dr, i).click();
	}
	
	
// Method to find Delete button
	public static WebElement getDelete(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(DELETE));
		WebElement wb = list.get(i);
		return wb;
	}
	
// Method to click Delete
	public static void clickDelete(WebDriver dr, int i) {
		getDelete(dr, i).click();
	}
	
	
// Method to find Post title field 
	public static WebElement getEditTitle(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EDIT_TITLE));
		return wb;
	}

// Method to click on the title field to edit
	public static void clickEditTitle(WebDriver dr) {
		getEditTitle(dr).click();
	}

// Method to set edited Post title
	public static void sendKeysEditTitle(WebDriver dr, String str) {
		getEditTitle(dr).sendKeys(str);
	}
	
// Method to find Location field 
	public static WebElement getEditLocation(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EDIT_LOCATION));
		return wb;
	}

// Method to click on Location field to edit
		public static void clickEditLocation(WebDriver dr) {
		getEditLocation(dr).click();
	}

// Method to set edited Location
	public static void sendKeysEditLocation(WebDriver dr, String str) {
		getEditLocation(dr).sendKeys(str);
	}
	
	public static WebElement getEditImage (WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(CHANGE_IMG));
		return wb;
	}
	
	public static void clickChangeImage (WebDriver dr) {
		getEditImage(dr).click();
	}
	
	public static void attachImage (WebDriver dr) {
		getEditImage(dr).sendKeys("C:\\Users\\Jo\\Desktop\\Projekat\\projekat\\Photo2.PNG");
	}
	
// Method to find Transport drop-down menu
	public static WebElement getSelect(WebDriver dr) {
		WebElement wb=dr.findElement(By.xpath(EDIT_TRANSPORT));
		return wb;
	}
	
// Method to select and edit Transport from drop-down menu
	public static void selectTransport(WebDriver dr, String str) {
		Select list = new Select(getSelect(dr));
		list.selectByVisibleText(str);
	}
	
// Method to find Description field to edit
	public static WebElement getEditDescription(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EDIT_DESCRIPTION));
		return wb;
	}

// Method to click Description field to edit
	public static void clickEditDescription(WebDriver dr) {
		getEditDescription(dr).click();
	}

	// Method to set edited Description
	public static void sendKeysEditDescription(WebDriver dr, String str) {
		getEditDescription(dr).sendKeys(str);
	}
	
// Method to find Post button
	public static WebElement getEditPostButton(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EDIT_POST));
		return wb;
	}

// Method to click Edit post button
	public static void clickEditPostButton(WebDriver dr) {
		getEditPostButton(dr).click();
	}



		


}