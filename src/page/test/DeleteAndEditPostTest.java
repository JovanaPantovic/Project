package page.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.DeleteAndEditPost;
import utility.Constant;
import utility.ExcelUtils;

public class DeleteAndEditPostTest {
	
// Method to edit post manual by user
		public static void editPostManual(WebDriver dr, int n) throws Exception {

				Scanner sc = new Scanner(System.in);
			
// Edit Post Button
				DeleteAndEditPost.clickEdit(dr, n);
				Thread.sleep(3000);

// Title
				System.out.println("Enter new post title:");
				DeleteAndEditPost.clickEditTitle(dr);
				String naziv = sc.nextLine();
				DeleteAndEditPost.sendKeysEditTitle(dr, naziv);

// Location
				System.out.println("Enter new Location: ");
				DeleteAndEditPost.clickEditLocation(dr);
				String lokacija = sc.nextLine();
				DeleteAndEditPost.sendKeysEditLocation(dr, lokacija);

// Transport
				System.out.println("Choose transport: Walk, Car, Motorbike, Bicycle, Bus");
				String transport = sc.nextLine();
				DeleteAndEditPost.selectTransport(dr, transport);

// Description
				System.out.println("Enter new Post Description: ");
				DeleteAndEditPost.clickEditDescription(dr);
				String opis = sc.nextLine();
				DeleteAndEditPost.sendKeysEditDescription(dr, opis);

// Submit
				DeleteAndEditPost.clickEditPostButton(dr);

			}

// Editing post using data from Excel file
			public static void editPostExcell(WebDriver dr, int i, String str, int n) throws Exception {

				String data;

// Setting Excel file
				ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData,Constant.SHEET_NAME_2);

// Edit Post Button
				DeleteAndEditPost.clickEdit(dr, n);

// Title
				DeleteAndEditPost.clickEditTitle(dr);
				data = ExcelUtils.getCellData(i, 1);
				DeleteAndEditPost.sendKeysEditTitle(dr, data);

// Location
				DeleteAndEditPost.clickEditLocation(dr);
				data = ExcelUtils.getCellData(i, 2);
				DeleteAndEditPost.sendKeysEditLocation(dr, data);

// Transport
				DeleteAndEditPost.selectTransport(dr, str);

// Description
				DeleteAndEditPost.clickEditDescription(dr);
				data = ExcelUtils.getCellData(i, 0);
				DeleteAndEditPost.sendKeysEditDescription(dr, str);

// Submit
				DeleteAndEditPost.clickEditPostButton(dr);
				
			}

// Method to delete single post
			public static void deletePost(WebDriver dr, int i) throws Exception {
				DeleteAndEditPost.clickMore(dr, i);
				DeleteAndEditPost.clickDelete(dr, i);
				
			}


}
