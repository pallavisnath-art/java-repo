package ExcelRead;

public class excel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.io.FileInputStream;
		import java.io.IOException;

		import org.apache.poi.xssf.usermodel.*;

		public class ExcelRead {

		    static FileInputStream f;
		    static XSSFWorkbook w;
		    static XSSFSheet s;

		    public static String getStringData(int row, int col) throws IOException {
		        f = new FileInputStream("C:\\Users\\palla\\OneDrive\\Desktop\\detail of salary.xlsx");
		        w = new XSSFWorkbook(f);
		        s = w.getSheet("Sheet1");

		        XSSFRow r = s.getRow(row);
		        XSSFCell c = r.getCell(col);

/		        return c.getStringCellValue();
		    }

		    public static String getIntegerData(int row, int col) throws IOException {
		        f = new FileInputStream("C:\\Users\\palla\\OneDrive\\Desktop\\detail of salary.xlsx");
		        w = new XSSFWorkbook(f);
		        s = w.getSheet("Sheet1");

		        XSSFRow r = s.getRow(row);
		        XSSFCell c = r.getCell(col);

		        int value = (int) c.getNumericCellValue();  
		        return String.valueOf(value);
	}

}
