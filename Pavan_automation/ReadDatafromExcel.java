package Pavan_automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadDatafromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//All the packages of excel are available in user model package
		
		
		//Location C:\Users\sanpr\exlipsefolder 2\Selenium_Training\pavan.xlsx
		FileInputStream fs = new FileInputStream("exceldatapractice_1.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		//You can provide sheet name or sheet index
		//XSSFSheet xs =wb.getSheet(0);
		XSSFSheet xs = wb.getSheet("Sheet1");
		//count number of row
		int row_count = xs.getLastRowNum();
		int column_count = xs.getRow(1).getLastCellNum();
		for(int i=0;i<row_count;i++)
		{
			XSSFRow current_row = xs.getRow(i);
			for (int j=0;j<column_count;j++)
			{
				String value = current_row.getCell(j).toString();//read the value from a cell
				System.out.print(value+ "           ");
			}
			System.out.println();
		}
		
	}

}
