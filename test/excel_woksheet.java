package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_woksheet {
	public static void main(String[] args) throws IOException
	{
		int r=0;
		//Need to make connection with excel file
		String str ="";
		FileInputStream fs = new FileInputStream("testdata.xlsx");
		
		File obj =new File("testdata.xlsx");

		if (obj.exists())
		{
			System.out.println(obj.getName());
			System.out.println(obj.getAbsolutePath());
		}
		
		
		
		//Create workbook class object
		//Xlsx - Class name will start from XSSF and in case of HSSF
		
		XSSFWorkbook  wk = new XSSFWorkbook(fs);
		XSSFSheet s1=wk.getSheet("Sheet1");
		XSSFRow r1 = s1.getRow(0);
		XSSFCell c1=r1.getCell(1);
		String S = c1.getStringCellValue();
		System.out.println(S);
		//Find number of rows
		System.out.println(s1.getPhysicalNumberOfRows());
		
		//get last row num - Note : the row is 10 but the index is 9.
		
		System.out.println("index of last row"+s1.getLastRowNum());
		
		//Count the number of cell
		System.out.println("number of cells"+r1.getPhysicalNumberOfCells());
		
		//Read all data of the sheet.
		
		r=s1.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++)
		{
			XSSFRow r11 = s1.getRow(i);
			int row = r11.getPhysicalNumberOfCells();
			for (int j =0; j< row;j++)
			{
				XSSFCell x11=r11.getCell(j);
				System.out.print(x11.getStringCellValue()+" ");
			}
			System.out.println();
		}
		
	}

}
