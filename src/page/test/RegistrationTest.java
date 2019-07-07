package page.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page.objects.LogIn;
import page.objects.Registration;
import utility.Constant;
import utility.ExcelUtils;

public class RegistrationTest {
	
//Manual user registration
	public static void fillFormManual (WebDriver dr) {
		Scanner sc = new Scanner (System.in);
		
//First Name
		System.out.println ("Enter first name: ");
		Registration.clickFirstName(dr);
		String firstName = sc.next();
		Registration.sendKeysFirstName(dr, firstName);
		
//Last Name	
		System.out.println ("Enter last name: ");
		Registration.clickLastName(dr);
		String lastName = sc.next();
		Registration.sendKeysLastName(dr, lastName);
		
//Username
		System.out.println ("Enter username: ");
		Registration.clickUsername(dr);
		String username = sc.next();
		Registration.sendKeysUsername(dr, username);
		
//Email		
		System.out.println("Enter email: ");
		Registration.clickEmail(dr);
		String email = sc.next();
		Registration.sendKeysEmail(dr, email);
		
//Password
		System.out.println("Enter password: ");
		Registration.clickPassword(dr);
		String password = sc.next();
		Registration.sendKeysPassword(dr, password);
		
//Registration button
		Registration.clickRegister(dr);
		
	}
	
//Automation user registration
	public static void fillFormAutomation(WebDriver dr,int i) throws Exception {
		String data;
		ExcelUtils.
		setExcelFile (Constant.Path_TestData+Constant.File_TestData,Constant.SHEET_NAME);
		
//First Name
		Registration.clickFirstName(dr);
		data=ExcelUtils.getCellData(i, 0);
		Registration.sendKeysFirstName(dr, data);
		
//Last Name
		Registration.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		Registration.sendKeysLastName(dr, data);
		
//Username		
		Registration.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		Registration.sendKeysUsername(dr, data);
		
//Email
		Registration.clickEmail(dr);
		data = ExcelUtils.getCellData(i, 3);
		Registration.sendKeysEmail(dr, data);
		
//Password		
		Registration.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		Registration.sendKeysPassword(dr, data);
		
//Click registration button		
		Registration.clickRegister(dr);
	}
	
//Register multiple users using data from excel file
	public static void testWithAllData(WebDriver dr) throws Exception {
		ExcelUtils.
		setExcelFile
		(Constant.Path_TestData+Constant.File_TestData,
				Constant.SHEET_NAME);
		for(int i=1;i<ExcelUtils.getWorkSheet().getLastRowNum()+1;i++) {
			fillFormAutomation(dr,i);
			Registration.navigateTo(dr);
		}
		
	}
	
}
