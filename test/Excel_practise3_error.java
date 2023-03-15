package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_practise3_error {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int rowlength=0;
		int column=0;
		FileInputStream fs1 = new FileInputStream("practice3.xlsx");
		XSSFWorkbook xb1 = new XSSFWorkbook(fs1);
		XSSFSheet xs1 = xb1.getSheet("Sheet1");
	
	 rowlength = xs1.getPhysicalNumberOfRows();
	 
	 for (int i=0;i<rowlength;i++)
	 {
		 XSSFRow row = xs1.getRow(i);
		 column = row.getPhysicalNumberOfCells();
		 for(int j=0;j<column;j++)
		 {
			 XSSFCell cell =row.getCell(j);
			String s = cell.getStringCellValue();
			if(s.equals("error"))
			{
				continue;
			}
			else
			{
				System.out.println(s + "  "+i+" "+"  "+j);
			}
		 }
		 
	 }
		

	}

}
