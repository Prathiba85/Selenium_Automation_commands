package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fs = new FileOutputStream("excelpractice.xlsx");
		
		XSSFWorkbook xb = new XSSFWorkbook();
		XSSFSheet xs =xb.createSheet("excel_Practice");
		XSSFRow r =xs.createRow(1);
		XSSFCell xc = r.createCell(1);
		xc.setCellValue("test");
		xb.write(fs);
		xb.close();
		System.out.println("file created successfully");
		
		FileInputStream fs1 = new FileInputStream("excelpractice.xlsx");
		
		XSSFWorkbook xb1 = new XSSFWorkbook(fs1);
		XSSFSheet xs1=xb1.getSheet("excel_Practice");
		XSSFRow r1 =xs1.getRow(1);
		XSSFCell xc1 = r1.getCell(1);
		System.out.println(xc1.getStringCellValue());

	}

}
