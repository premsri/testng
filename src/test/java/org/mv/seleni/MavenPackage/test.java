package org.mv.seleni.MavenPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test {

	public static String getDataExcel(int row, Object cell) throws Throwable {
		List<LinkedHashMap<String, String>> mapdatalist = new ArrayList<LinkedHashMap<String, String>>();
		File loc = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPackage\\excel\\TestNg.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Test");
		Row headerrow = sheet.getRow(1);
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			LinkedHashMap<String, String> mapdata = new LinkedHashMap<String, String>();
			Row currentrow = sheet.getRow(i);
			Cell cell1 = currentrow.getCell(5);
			if (cell1 == null) {
				continue;
			}
			if (cell1 != null) {

				int cellType = cell1.getCellType();
				if (cellType == 0) {
					String key = headerrow.getCell(5).getStringCellValue();
					double d = cell1.getNumericCellValue();
					long l = (long) d;
					String string = String.valueOf(l);
					mapdata.put(key, string);

				} else {
					String key = headerrow.getCell(5).getStringCellValue();
					String string = cell1.getStringCellValue();
					mapdata.put(key, string);

				}
			}mapdatalist.add(mapdata);
		}
		return mapdatalist.get(row).get(cell);
	}

	public static void main(String[] args) throws Throwable {
		
String dataExcel = getDataExcel(1, "Input");
System.out.println(dataExcel);

		
	}

}
