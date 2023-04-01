package test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fs = new FileOutputStream("result.xlsx");
		XSSFWorkbook	wb = new XSSFWorkbook();
		XSSFSheet xs =wb.createSheet("result");
		XSSFRow	xr = xs.createRow(0);
		XSSFCell c =xr.createCell(0);
		c.setCellValue("Hello world");
		wb.write(fs);
		wb.close();

	}

}
