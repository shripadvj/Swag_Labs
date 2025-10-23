package Assignment.Saucelabs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File {
	
public String ExcelData(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("./Data/TestData.xlsx");
	 Workbook w = WorkbookFactory.create(file);
	Cell data = w.getSheet(Sheet).getRow(row).getCell(cell);
	
	DataFormatter format = new DataFormatter();//To convert the string format
	String value= format.formatCellValue(data);//conversion
	return value;//return value
	 
}
}