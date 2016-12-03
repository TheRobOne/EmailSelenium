package Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

	
	public static ArrayList<String[]> csvReader(String csvFile){
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		ArrayList<String[]> list = new ArrayList<String[]>();
		
		try{
			br = new BufferedReader(new FileReader(csvFile));
			while((line = br.readLine()) != null){
				String[] text = line.split(csvSplitBy);
				
				list.add(text);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(br != null) {
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}
	
}
