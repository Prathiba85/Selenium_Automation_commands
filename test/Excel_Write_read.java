package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fs = new FileOutputStream("excercise1.xlsx");
		XSSFWorkbook xs = new XSSFWorkbook();
		XSSFSheet s = xs.createSheet("excercise1");
		int row =3;
		int column = 5;
		for (int i=0;i<row;i++)
		{
			XSSFRow r=s.createRow(i);
			for (int j=0;j<column;j++)
			{
				
				XSSFCell c = r.createCell(j);
				c.setCellValue("epic_username");
			}
		
			
		}
		xs.write(fs);
		xs.close();
		System.out.println("File datas are added successfully");
		
		FileInputStream fsi = new FileInputStream("excercise1.xlsx");
		XSSFWorkbook xb1 = new XSSFWorkbook(fsi);
		XSSFSheet xs1 = xb1.getSheet("excercise1");
		row=xs1.getPhysicalNumberOfRows();
		for(int i=0;i<row;i++)
		{
			int column1 = xs1.getPhysicalNumberOfRows();
			XSSFRow row1=xs1.getRow(i);
			
			for(int j=0;j<column1;j++)
			{
				XSSFCell x11 = row1.getCell(j);
				System.out.print(x11.getStringCellValue()+ "  ");
			}
			System.out.println();
			
		}
		

	}

}
