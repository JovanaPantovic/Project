package page.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.AddPost;
import page.objects.HomePage;
import page.objects.LogIn;
import utility.Constant;
import utility.ExcelUtils;

public class LogInTest {
	
//Method for manual LogIn
	public static void logInManual (WebDriver dr) {
		
		Scanner sc = new Scanner (System.in);
		
//Add and set username		
		System.out.println ("Enter username: ");
		LogIn.clickUsername(dr);
		String username = sc.next();
		LogIn.sendKeysUsername(dr, username);
		
//Add and set password
		System.out.println("Enter password: ");
		LogIn.clickPassword(dr);
		String password = sc.next();
		LogIn.sendKeysPassword(dr, password);
		
//Click LogIn button
		LogIn.clickLog_In(dr);
		
//Successful or not successful LogIn
		if (dr.getCurrentUrl().equals(AddPost.DASHBOARD_URL)) {
			System.out.println("Successful Log-In.");
		} 
		else
			System.out.println("Log-In was not successful.");
		}
		
		// LogIn.LogIn(dr, username, password);
	
	
//Method for LogIn using single row data from excel file
		public static void logInAutomation (WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.
		setExcelFile (Constant.Path_TestData+Constant.File_TestData,Constant.SHEET_NAME);
		
//Username	
		LogIn.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		LogIn.sendKeysUsername(dr, data);
		
//Password
		LogIn.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		LogIn.sendKeysPassword(dr, data);
		
//LogIn button
		LogIn.clickLog_In(dr);
		
		
	}
	
//Login using multiple data from excel 
		public static void testWithAllData(WebDriver dr) throws Exception {
			
			ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET_NAME);
			
			for(int i=1; i<ExcelUtils.getWorkSheet().getLastRowNum()+1; i++) {
				logInAutomation(dr,i);
				HomePage.openPage(dr);
			}
		
	}
		
		
	/* public static void navigateToDashboard (WebDriver dr) {
		AddPost.getMakeAPostButton(dr);
	} */
}

