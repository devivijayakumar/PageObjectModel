package utilitypackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlDemo {
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	
	XSSFRow row;
	XSSFCell cell;
	public void getXldata(String sheetname)
	{
		String destination="C:\\Users\\lenovo\\Desktop\\DEVI\\sel.xlsx"; 
		try
		{
			File src= new File(destination);
			FileInputStream fi= new FileInputStream(src);
			workbook= new XSSFWorkbook(fi);
			sheet= workbook.getSheet(sheetname);
			row= sheet.getRow(0);
			cell= row.getCell(0);
			String data= cell.getStringCellValue();
			System.out.println(data);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[]args)
	{
		XlDemo xldemo= new XlDemo();
		xldemo.getXldata("data1");
	}
	

}
