package Tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVClass {

	static String path = System.getProperty("user.dir");
	static String CSV_PATH = path +"\\src\\test\\resources\\todotasksdatafile.csv";
	public static CSVReader csvReader;
	static String[] csvCell;
	
	public static String[] getcsvvalue() throws CsvValidationException, IOException {
	csvReader = new CSVReader(new FileReader(CSV_PATH));
	csvCell = csvReader.readNext();
	return csvCell;
	//String firstTask = csvCell[0];
	}
	
	public static void main (String args []) throws CsvValidationException, IOException {
		
		String[] str = CSVClass.getcsvvalue();
		//System.out.println (str);
	}
}
