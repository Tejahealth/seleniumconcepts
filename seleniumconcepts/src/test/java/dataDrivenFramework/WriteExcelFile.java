package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main (String [] args) throws IOException{
		 //create an object of Workbook and pass the FileInputStream object into it to create a pipeline between the sheet and eclipse.
		 FileInputStream fis = new FileInputStream("DataFile.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		 XSSFSheet sheet = workbook.getSheet("TestData");
		 //XSSFSheet sheet = workbook.getSheetAt(0);
		 
		 Row row = sheet.createRow(2);
		 Cell cell = row.createCell(2);
		 
		 cell.setCellType(cell.CELL_TYPE_STRING);
		 cell.setCellValue("SoftwareTestingMaterial.com");
		 FileOutputStream fos = new FileOutputStream("DataFile.xlsx");
		 workbook.write(fos);
		 fos.close();
		 System.out.println("END OF WRITING DATA IN EXCEL");
		 }
}
