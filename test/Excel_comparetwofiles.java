package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_comparetwofiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//First file
		FileInputStream fs1 = new FileInputStream("comparesheet1.xlsx");
		XSSFWorkbook xb1 = new XSSFWorkbook(fs1);
		XSSFSheet xs1 = xb1.getSheet("Sheet1");
		
		
		//secondfile
		FileInputStream fs2 = new FileInputStream("comparesheet2.xlsx");
		XSSFWorkbook xb2 = new XSSFWorkbook(fs2);
		XSSFSheet xs2 = xb2.getSheet("Sheet2");
		//find maximum length
		int no_row1=xs1.getPhysicalNumberOfRows();
		int no_row2=xs2.getPhysicalNumberOfRows();
		System.out.println(no_row1);
		System.out.println(no_row2);
		String s1="";
		String s2="";
		
		int rowlength = Math.max(no_row1, no_row2);
	
		
		for(int i=0;i<rowlength;i++)
		{
						
			XSSFRow row1=xs1.getRow(i);
			XSSFRow row2=xs2.getRow(i);
			int column1 = row1.getPhysicalNumberOfCells();
			int column2 = row2.getPhysicalNumberOfCells();
			int columnlength = Math.max(column1, column2);
			
			for(int j=0;j<column1;j++)
			{
				XSSFCell x11 = row1.getCell(j);
				 s1= x11.toString();
				
			  
				if(row2.toString()==null)
				{
				 
				
				 s2= null;
				 
				
				}
				else
				{
					XSSFCell x12 = row2.getCell(j);
					 s2= x12.toString();
					 
				}
				if((s1.equals(null))||(s2.equals(null)))
				{
					System.out.println("Values are not equal in the row "+i+" and in the column "+j);
					continue;
				}
				if(s1.equals(s2)==true)
				{
					//System.out.println(s1+" "+s2);
					//System.out.println("Row match completed for "+i+" "+j);
					continue;
				}
						
				if(s1.equals(s2)==false)
				{
					System.out.println("Values are not equal in the row "+(i+1)+" and in the column "+(j+1));
				}
			}
			System.out.println();
			
		}
	}

}
