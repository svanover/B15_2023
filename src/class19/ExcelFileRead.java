package class19;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelFileRead {
    public static void main(String[] args) throws FileNotFoundException {

        //Location of the file
        String path ="Files/Book1.xlsx";
        // Navigating to the file
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();

        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet1.getRow(0);
        Cell cell = row.getCell(2);
        System.out.println(cell);

    }

}
