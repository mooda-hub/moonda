package excel;

import java.io.File;

public class test {
	public static void main(String[] args) {
		File f=new File("excel.xis");
		Workbook wb = Workbook.getworkbook(f);
		Sheet sh = wb.getSheet(0);
		Cell c = sh.getCell(0,0);
		String Com = cell.getContents();
		System.out.println(com);
	}
}
 