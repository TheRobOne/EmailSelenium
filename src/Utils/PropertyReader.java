package Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	private static Properties textProperties;
	
	/**
	 * return value of property by given property name
	 * @param propertyKey
	 * @return
	 */
	public static String getProperty(String propertyKey){
		
		if(textProperties == null){
			textProperties = new Properties();
			
			try{
				InputStream inputStream = PropertyReader.class.getResourceAsStream("config.properties");
				textProperties.load(inputStream);
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return textProperties.getProperty(propertyKey);
	}
}
