package class19;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//print row 2
public class Task1 {
    public static void main(String[] args) throws IOException {

        //Location of the file
        String path = "Files/Book1.xlsx";
        // Navigating to the file
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet1.getRow(1);
        //Cell cell = row.getCell(0);
       // Cell cell1 = row.getCell(1);
        //Cell cell2 = row.getCell(2);
        //Cell cell3 = row.getCell(3);

        //System.out.println(cell);
       // System.out.println(cell1);
       // System.out.println(cell2);
        //System.out.println(cell3);



       // for(int i=0; i<4; i++){
           // Cell cell = row.getCell(i);
           // System.out.println(cell);

        for (int i = 0; i < 4; i++) {
            Row row1 = sheet1.getRow(i);
            for (int j = 0; j < 4; j++) {
                Cell cell = row1.getCell(j);
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

