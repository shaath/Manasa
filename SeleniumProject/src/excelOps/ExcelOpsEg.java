package excelOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import orgHRMFunctional.OrgHRMLib;

public class ExcelOpsEg {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String xlpath="F:\\ManasaRecordings\\Workspace\\SeleniumProject\\src\\testdata\\Emp_TestData.xlsx";
		String xlout="F:\\ManasaRecordings\\Workspace\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);

		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
//		XSSFRow r=ws.getRow(2);
//		XSSFCell c=r.getCell(1);
		
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
//		System.out.println(rc);estng
		
//		System.out.println(ws.getRow(1).getLastCellNum());
		om.OrgLaunch("http://orangehrm.qedgetech.com");
		om.OrgLogin("Admin", "Admin");
		for (int i =1; i <= rc; i++)
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			
			XSSFCell c3=r.createCell(3);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String eid=c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+eid);
			
			String res=om.OrgEmpReg(f, l, eid);
					
			c3.setCellValue(res);
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		
		om.OrgLogout();
		om.OrgClose();
		
	}

}
