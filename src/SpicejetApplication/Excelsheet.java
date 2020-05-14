package SpicejetApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {

	public ArrayList<String> getData(String GivenData) throws IOException {
		FileInputStream file = new FileInputStream("C://Users//chinni//Desktop//login_details.xlsx");
		XSSFWorkbook excel = new XSSFWorkbook(file);
		int sheet_count = excel.getNumberOfSheets();
		int column=0,k=0;
		ArrayList<String> arraylist=new ArrayList<String>();
		for (int i = 0; i < sheet_count; i++) {
			
			if (excel.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet = excel.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				Row first = row.next();
				Iterator<Cell> c = first.cellIterator();
				
				while (c.hasNext()) {
					Cell cell = c.next();
					if (cell.getStringCellValue().equalsIgnoreCase("username")) {
						column=k;
						System.out.println(column);

					}
					k++;

				}
				
				
				while(row.hasNext()) {
					Row rw=row.next();
			//	if(rw.getCell(column).getStringCellValue().equalsIgnoreCase(GivenData)) {
					
					Iterator<Cell> cell=rw.cellIterator();
					while(cell.hasNext()) {
						
					Cell sh=cell.next();
					if(sh.getCellType()==CellType.STRING) {
						arraylist.add(sh.getStringCellValue());
					}
					
					else{
						arraylist.add(NumberToTextConverter.toText(sh.getNumericCellValue()));
					}
						
						
					}
				}
				}
				
				

			}
		
			
			
		
		return arraylist;
	
		

	}

	

	public static void main(String[] args) throws IOException {
		
		}
		// TODO Auto-generated method stub

		

}
