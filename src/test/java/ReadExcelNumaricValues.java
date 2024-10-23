import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelNumaricValues {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 //step 1:convert physical file into java readable object
		 FileInputStream fis =new FileInputStream("./src/test/resources/SeleniumExcel.xlsx");
		 
		 //step2: open workbook
		 Workbook wb= WorkbookFactory.create(fis);
		 
		 //step3 :get Control to particular sheet
		 Sheet sheet =wb.getSheet("Sheet1");
		 
		 //step 4 :get control to over row
		 Row row1= sheet.getRow(0);
		 Row row2 = sheet.getRow(2);
		 
		 //step 5 :get control over to cell
		 Cell cell1 = row1.getCell(1);
		 Cell cell2 = row2.getCell(1);
		 
		 //step 6: fetch the data 
		 System.out.println(cell1.getStringCellValue());
		 System.out.println(cell2.getNumericCellValue());
		 
		 //step 7: close the work book
		 wb.close();


	}

}