package maventrail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class firstproject {

	@Test
	public void excel() throws IOException {

		// C:\Users\elcot\eclipse-workspace\maventrail\workbook\NewTeat.xlsx
		File file = new File("C:\\Users\\elcot\\eclipse-workspace\\maventrail\\workbook\\NewTeat.xlsx");

		FileInputStream instream = new FileInputStream(file);
		Workbook Workbook = new XSSFWorkbook(instream);
		Sheet sheet = Workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

	}

}
