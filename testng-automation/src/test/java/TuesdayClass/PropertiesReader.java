package TuesdayClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) throws IOException {

		// 1.path

		String path = "C:\\Users\\Thrall\\eclipse-workspace\\testng-automation\\Configuration.properties";

		// 2.file

		try {

			FileInputStream file = new FileInputStream(path);
			Properties pr = new Properties();
			pr.load(file);
			String url = pr.getProperty("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
			System.out.println(url);

		} catch (FileNotFoundException e) {

			System.out.println("File is not found!");
			e.printStackTrace();
		}
		// fileReader

	}
}
