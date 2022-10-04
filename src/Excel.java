import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class Excel {
public static void exGo() throws IOException{
        String path = "C:\\Users\\ItsFi\\Neads\\Test.xlsx"; //Адресс файла
        XSSFWorkbook excelBook = new XSSFWorkbook(new FileInputStream(path)); //передача в конструктор
        Sheet excelSheet = excelBook.getSheet("Sheet1");
        int i = 1;
        Row row = excelSheet.getRow(i);
        Cell cell = row.getCell(5);

        if (cell.getNumericCellValue() > 0) {
                row = excelSheet.getRow(i+1);
                //Iterator rowIter = excelSheet.rowIterator();
                //while (rowIter.hasNext()) {
                        if (row.getCell(5).getCellType() == CellType.NUMERIC) { //Проверка на тип ячейки == ячейка с числом
                                Number number = row.getCell(5).getNumericCellValue();  //Если в ячейке число - запись данных ячейки в number
                                System.out.println("Number :" + number); // Слить все номера
                        }


        }
        excelBook.close();
}
}
//