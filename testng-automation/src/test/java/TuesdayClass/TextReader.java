package TuesdayClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\Thrall\\eclipse-workspace\\testng-automation\\src\\test\\java\\utilities\\testData";

		File file = new File(path);

		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader read = new BufferedReader(fileReader);
			
			
			
			String line1 = read.readLine();
			
			String line2 = read.readLine();
			
			String line3 = read.readLine();
			
			System.out.println("this is the first line" + line1);
			System.out.println("this is the second line" + line2);
			System.out.println("this is the second line" + line3);


		} catch (IOException e) {
			System.out.println(path + " not found!");
			e.printStackTrace();
		}

	}
}
