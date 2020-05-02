package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main (String [] args) throws IOException{
        //I have placed an excel file 'Test.xlsx' in my D Driver 
FileInputStream fis = new FileInputStream("DataFile.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(0);
        
        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);
       System.out.println(cell);
System.out.println(sheet.getRow(0).getCell(1));
System.out.println(sheet.getRow(1).getCell(1));



} 
}
