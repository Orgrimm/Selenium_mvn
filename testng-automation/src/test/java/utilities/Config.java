package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	private static Properties pr;

	static {

		String path = "C:\\Users\\Thrall\\eclipse-workspace\\testng-automation\\Configuration.properties";

		// 2.file

		try {

			FileInputStream file = new FileInputStream(path);
			pr = new Properties();
			pr.load(file);
			file.close();
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static String getValue(String key) {
		
		return pr.getProperty(key);
	}
}
