import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel {
public static void exGo() throws IOException{
        String path = "C:\\Users\\ItsFi\\Neads\\Test.xlsx"; //Адресс файла
        XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(path)); //передача в конструктор
        XSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");//Выбор первого листа файла
        XSSFRow row = myExcelSheet.getRow(0); //Нумерация строк с 0

        if(row.getCell(1).getCellType() == CellType.NUMERIC) { //Проверка на тип ячейки == ячейка с числом
                Number number = row.getCell(1).getNumericCellValue();  //Если в ячейке число - запись данных ячейки в number
                System.out.println("Number :" + number); // Слить все номера
        }

        myExcelBook.close();
}
}
//