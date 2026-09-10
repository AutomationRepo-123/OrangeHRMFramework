package practice.testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Contact {

	@Test(dataProvider = "getData")
	public void createContact(String firstname, String lastname) {

		System.out.println("firstname :" + firstname + ", lastname: " + lastname);
	}

	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/DataProvider.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		
		Object[][] objarr = new Object[rowcount][2];
		for(int i=0;i<rowcount;i++)
		{
			objarr[i][0] = sh.getRow(i+1).getCell(0).getStringCellValue();
			objarr[i][1] = sh.getRow(i+1).getCell(1).getStringCellValue();

		}
		return objarr;

	}
}
