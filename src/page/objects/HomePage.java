package page.objects;


import org.openqa.selenium.WebDriver;


public class HomePage {
	
	public static final String URL = "http://localhost/izlet/index.php";
	
//Method to open main page	
	public static void openPage (WebDriver dr) {
		dr.get(URL);
	}

	
	
}
