package Tests;

import org.testng.annotations.DataProvider;

public class DataProviderSet {
	
	@DataProvider(name ="set1")
	public Object[] dataSet(){
		
		Object[] data = new Object[5];
		data[0]= "task1";
		data[1]= "task2";
		data[2]= "task3";
		data[3]= "task4";
		data[4]= "task5";
		return data;
	}

}
