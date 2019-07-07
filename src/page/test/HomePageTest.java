package page.test;

import org.openqa.selenium.WebDriver;

import page.objects.HomePage;

public class HomePageTest {
		
//Check if we are on the right page
//If we are not go to right page (Home Page)
	public static void openHomePage (WebDriver dr) {
		if (!dr.getCurrentUrl().equals(HomePage.URL)) {
			dr.navigate().to(HomePage.URL);
		}
	}
	
	

}
