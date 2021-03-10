package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	public  static Object[][] readdata(String sheetname) throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Users\\Venkat\\Documents\\Bonito\\src\\utility\\Information.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(ip);
		
		XSSFSheet sh=wb.getSheet(sheetname);
		
		//we need to take data from excel and populate it into 2d object array
		
		int totalRows=sh.getPhysicalNumberOfRows();
		int totalColumns=sh.getRow(0).getPhysicalNumberOfCells();
		
		Object arr[][]=new Object[totalRows-1][totalColumns];
		
		for(int i=1;i<totalRows;i++) //rows
		{
			for(int j=0;j<totalColumns;j++) //columns
			{
				arr[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();		
			}
		}	
		
		return arr;
	}

}
