package com.guru.Pages;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataSupplier {
//	     // Actrual way to use xml sheets in projects this sheet is used for guru99 loginPage credentials
//	@DataProvider
//	public String[][] getData(){
//
//		File excelFile = new File("./src/main/java/com/guru/TestData/Guru99LoginData.xlsx");
//		FileInputStream fis =new FileInputStream(excelFile);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		
//		int noOfRows=sheet.getPhysicalNumberOfRows();
//		int noOfCellsInAnRow=sheet.getRow(0).getLastCellNum();
//		
//		String[][] data = new String[noOfRows-1][noOfCellsInAnRow];
//		for(int i =0;i<noOfRows-1;i++) {
//			for(int j=0;j<noOfCellsInAnRow;j++) {
//				DataFormatter df = new DataFormatter();
//				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
//			}
//		}
//		workbook.close();
//		fis.close();
//
//		return data;
	//}}    
	
	      // First Way to Access XML sheet simplifying below set of code 

//	public static void main(String args[]) throws Exception {  //working completed on Numeric Values
//		File excelFile = new File("./src/main/java/com/guru/TestData/Guru99LoginData.xlsx");
//		FileInputStream fis =new FileInputStream(excelFile);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("Sheet2");
//		
//	int rowCount=sheet.getPhysicalNumberOfRows();
//	for(int i=1;i<rowCount;i++) {
//		XSSFRow row = sheet.getRow(i);
//		
//	    String name = row.getCell(0).getStringCellValue();
//	    System.out.println(name);
//	    
//	    String gender = row.getCell(1).getStringCellValue();
//	    System.out.println(gender);
//	    
//	    long DOB= (int) row.getCell(2).getNumericCellValue();
//	    System.out.println(DOB);
//
//	    
//	    String address = row.getCell(3).getStringCellValue();
//	    System.out.println(address);
//
//	    
//	    String city = row.getCell(4).getStringCellValue();
//	    System.out.println(city);
//
//	    
//	    String state = row.getCell(5).getStringCellValue();
//	    System.out.println(state);
//
//	 
//	    long pincode= (int) row.getCell(2).getNumericCellValue();
//	    System.out.println(pincode);
//
//	    
//	    long mobileno=(long)row.getCell(7).getNumericCellValue();
//	    System.out.println(mobileno);
//
//	    String email = row.getCell(5).getStringCellValue();
//	    System.out.println(email);
//
//	    String password = row.getCell(5).getStringCellValue();
//	    System.out.println(password);
//	    System.out.println();
//	    
//	    workbook.close();
//	    fis.close();
//
//	}
//	}
//	}

	public static void main(String args[]) throws Exception {  //working completed on Numeric Values
		File excelFile = new File("./src/main/java/com/guru/TestData/Guru99LoginData.xlsx");
		FileInputStream fis =new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
	int rowCount=sheet.getPhysicalNumberOfRows();

	for(int i=1;i<rowCount;i++) {
		XSSFRow row = sheet.getRow(i);
		
		XSSFCell name=row.getCell(0);
		String first_N=name.getStringCellValue();
		System.out.println(first_N);
		
		XSSFCell gender=row.getCell(1);
		String gen=gender.getStringCellValue();
		System.out.println(gen);
		
		XSSFCell dateOB=row.getCell(2);
		long dob=(int)dateOB.getNumericCellValue();//need to typeCast long to int 
		System.out.println(dob);
		
		XSSFCell address=row.getCell(3);
		String addr=address.getStringCellValue();
		System.out.println(addr);
		
		XSSFCell city=row.getCell(4);
		String City_N=city.getStringCellValue();
		System.out.println(City_N);
		
		XSSFCell State=row.getCell(5);
		String State_N=State.getStringCellValue();
		System.out.println(State_N);
		
		XSSFCell Pincode=row.getCell(6);
		long pin=(int)Pincode.getNumericCellValue();//need to typeCast long to int 
		System.out.println(pin);
		
		XSSFCell M_no=row.getCell(7);
		long MobileNo=(long)M_no.getNumericCellValue();//need to typeCast long to long
		System.out.println(MobileNo);
		
		XSSFCell Email=row.getCell(8);
		String email=Email.getStringCellValue();
		System.out.println(email);
		
		XSSFCell Password=row.getCell(9);
		String pass=Password.getStringCellValue();
		System.out.println(pass);
         
		System.out.println();
	    
			
		
		workbook.close();
		fis.close();
	}
	}
}
		 // second Way to Access XML sheet



		
//		public static void main(String args[]) throws Exception {  //working completed on Numeric Values
//			File excelFile = new File("./src/main/java/com/guru/TestData/Guru99LoginData.xlsx");
//			FileInputStream fis =new FileInputStream(excelFile);
//			XSSFWorkbook workbook = new XSSFWorkbook(fis);
//			XSSFSheet sheet = workbook.getSheet("Sheet2");
		
//	    String name=currentRow.getCell(0).getStringCellValue();
//	    System.out.println(name);
//	    
//	    String Gender=currentRow.getCell(1).getStringCellValue();
//	    System.out.println(Gender);
//	    
//	    int DateOfBirth=(int)currentRow.getCell(2).getNumericCellValue();
//	    System.out.println(DateOfBirth);
//	    
//	    String Address=currentRow.getCell(3).getStringCellValue();
//	    System.out.println(Address);
//	    
//	    String City=currentRow.getCell(4).getStringCellValue();
//	    System.out.println(City);
//	    
//	    String State=currentRow.getCell(5).getStringCellValue();
//	    System.out.println(State);
//	    
//	    int Pin=(int)currentRow.getCell(6).getNumericCellValue();
//	    System.out.println(Pin);
//	    
//	    int MobileNumber=(int)currentRow.getCell(7).getNumericCellValue();
//	    System.out.println(MobileNumber);
//	    
//	    String Email=currentRow.getCell(8).getStringCellValue();
//	    System.out.println(Email);
//	    
//	    String Password=currentRow.getCell(9).getStringCellValue();
//	    System.out.println(Password);
	    	
//	    System.out.println();
//		workbook.close();
//		fis.close();
//	}}}      
           // retriving all values from sheet2 with less code but error occured while numeric values
//public static void main(String args[]) throws Exception {
//File excelFile = new File("./src/main/java/com/guru/TestData/Guru99LoginData.xlsx");
//FileInputStream fis =new FileInputStream(excelFile);
//XSSFWorkbook workbook = new XSSFWorkbook(fis);
//XSSFSheet sheet = workbook.getSheet("Sheet2");
//
//int noOfRows=sheet.getPhysicalNumberOfRows();
//int noOfCells=sheet.getRow(0).getLastCellNum();
//
//for(int i=1;i<noOfRows;i++) {
//
//for(int j=0;j<noOfCells;j++) {
//	DataFormatter df= new DataFormatter();
//	System.out.println(df.formatCellValue(sheet.getRow(1).getCell(0)).toString());
//}
//System.out.println();
//}
//workbook.close();
//fis.close();
//} }   //   retriving new customer details need to work on numerical values

