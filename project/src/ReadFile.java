
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class ReadFile {
	
	
	public void readFileExcel(String filename) throws Exception{
		//int exam = 0;
		ArrayList<String> exam = new ArrayList<>();
		
		String f = filename;
		Workbook workbook = Workbook.getWorkbook(new File(f));
		Sheet w  = workbook.getSheet(0);
		Cell cell = null;
		
		for(int i = 0;i<w.getColumns();i++){

				cell = w.getCell(i,0);
				System.out.print(cell.getContents()); 
				exam.add(cell.getContents());
				
				//exam++;
				
				cell = w.getCell(i,4);
				System.out.println(" : " + cell.getContents());

				/*cell = w.getCell(1,i);
				System.out.println("ID : " + cell.getContents());

				cell = w.getCell(1,i);
				System.out.println("ID : " + cell.getContents());

				cell = w.getCell(1,i);
				System.out.println("ID : " + cell.getContents());

				cell = w.getCell(1,i);
				System.out.println("ID : " + cell.getContents());*/

		}
		//System.out.println(exam-1);
		workbook.close();
		
	}
	
	/*public void writerFile() throws IOException{
		File f = new File("C:\\Users\\USER\\workspace\\CS284_Project\\test.txt");
		FileWriter w = new FileWriter(f);
		PrintWriter writer = new PrintWriter(w);
		
		writer.write();
	}*/
	
	public static void main(String[] args) throws Exception{
		ReadFile read = new ReadFile();
		read.readFileExcel("id_email_example_.xls");

	}

}
