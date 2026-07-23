package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_Data {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	//File-->Workbook-->Sheets-->Rows-->Cells

		public String[] read_excel() throws IOException {
			
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
			
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			XSSFSheet sheet=workbook.getSheet("Sheet1");  //workbook.getSheetAt(0);
			
			int totalrows=sheet.getLastRowNum();
			int totalcells=sheet.getRow(0).getLastCellNum();
			
			System.out.println("Number of rows:"+totalrows); //5
			System.out.println("Number of cells:"+totalcells);  //4
			String[] value = new String[totalcells];
			
			for(int r=0;r<=totalrows;r++)
			{
				XSSFRow currentRow=sheet.getRow(r);
						
				for(int c=0;c<totalcells;c++)
				{
					//XSSFCell cell=currentRow.getCell(c);
					//String value=cell.toString();
					value[c]=currentRow.getCell(c).toString();
					
				}
				System.out.println();
			}
			workbook.close();
			file.close();
			return value;
			
		}
		
	
			
			public static void setCellData(int rownum,int colnum,String data) throws IOException
			{
				fi=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\datastore.xlsx");
				wb=new XSSFWorkbook(fi);
				ws=wb.getSheetAt(0);
				row=ws.createRow(rownum);
				cell=row.createCell(colnum);
				cell.setCellValue(data);
				fo=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\datastore.xlsx");
				wb.write(fo);		
				wb.close();
				fi.close();
				fo.close();
						
			}

		}





