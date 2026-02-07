package org.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Flib  implements FrameWorkConstants {
	

	public static String getPropertyValue(String key) {
		File file = new File(PROPERTIES_PATH_MAIN);
		FileInputStream fis = null;
		try 
		{
	    fis = new FileInputStream(file);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try
		{
			prop.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();		
	    }
		String value = prop.getProperty(key);
		return value;
		
	}
	
	public static String getWorkbookCellValue(String sheetName,int rowIndex, int cellIndex)
	{
		File file = new File(EXCEL_PATH_MAIN);
		FileInputStream fis = null;
		Workbook wb= null;
		try {
			fis=new FileInputStream(file);
			wb=WorkbookFactory.create(fis);
			}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
		String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
		return value;
		
	}
	
	public static String getNumericCellValueMethod(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(EXCEL_PATH_MAIN);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		double data = cell.getNumericCellValue();
		
		int data1=(int) data;
		String value = String.valueOf(data1);
		return value;		
		
	}
	//for using random class for generating random number of any combination
	public static int generateRandomNo()
	{
		Random random = new Random();
		int rn= random.nextInt(1000,9999);
		return rn;
	}
}
