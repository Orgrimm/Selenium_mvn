package porsche;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import borshe.Driver;
public class Porsche {

	public Porsche() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws InterruptedException {
		
		Driver.Setup();
		
		//System.setProperty("webdriver.chrome.driver", "/mvn-batch8-automation/src/test/resources/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.porsche.com/usa/modelstart/");
		driver.findElement(By.linkText("718")).click(); 
		String price = driver.findElement(By.xpath("//*[@id=\"m982120\"]/div[1]/div[2]/div[2]")).getText();
		price = getNumbers(price);
		price = price.substring(0, 5);

		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		
		// Perform the click operation that opens new window
		driver.findElement(By.linkText("Build & Price")).click(); 
		// Switch to new window opened
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		// Perform the actions on new window
		String priceBase = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[1]/div[2]")).getText();
		
		//6
		priceBase = getNumbers(priceBase);
		verify(price, priceBase);
		
		String priceForEquipment = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[2]/div[2]")).getText();
		
		//7
		priceForEquipment = getNumbers(priceForEquipment);
		verify(priceForEquipment, "0");
		
		//8
		String priceDelivery = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[3]/div[2]")).getText();
		String priceTotal = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[4]/div[2]")).getText();
		priceDelivery = "" + Integer.parseInt(getNumbers(priceDelivery));
		priceTotal = "" + Integer.parseInt(getNumbers(priceTotal));
		verify(sumStrings(priceDelivery, priceBase), priceTotal);
		
		//9-color
		driver.findElement(By.xpath("//*[@id=\"s_exterieur_x_FJ5\"]/span")).click(); 
		
		//10
		String priceMiami = driver.findElement(By.xpath("//*[@id=\"s_exterieur_x_IAF\"]/div[2]/div[1]/div/div[2]")).getText();
		priceForEquipment = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[2]/div[2]")).getText();
		priceMiami = getNumbers(priceMiami);
		priceForEquipment = getNumbers(priceForEquipment);
		verify(priceMiami, priceForEquipment);
		
		//11
		priceDelivery = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[3]/div[2]")).getText();
		priceTotal = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[4]/div[2]")).getText();
		priceDelivery = "" + Integer.parseInt(getNumbers(priceDelivery));
		priceTotal = "" + Integer.parseInt(getNumbers(priceTotal));
		verify(sumStrings(sumStrings(priceBase, priceForEquipment), priceDelivery), priceTotal);
		
		//12-wheels
		//driver.findElement(By.xpath("//*[@id=\"s_exterieur_x_M433\"]/span/span")).click();
		List<WebElement> wheels = driver.findElements(By.xpath("//div[@id='ARA']//li"));
        wheels.get(3).click();
		
        //13
        priceForEquipment = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[2]/div[2]")).getText();
        String priceWheels = driver.findElement(By.xpath("//*[@id=\"s_exterieur_x_IRA\"]/div[2]/div[1]/div/div[2]")).getText();
		priceWheels = getNumbers(priceWheels);
		priceForEquipment = getNumbers(priceForEquipment);
		verify(sumStrings(priceMiami, priceWheels), priceForEquipment);
		
		//14
		priceDelivery = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[3]/div[2]")).getText();
		priceTotal = driver.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[4]/div[2]")).getText();
		priceDelivery = "" + Integer.parseInt(getNumbers(priceDelivery));
		priceTotal = "" + Integer.parseInt(getNumbers(priceTotal));
		verify(sumStrings(sumStrings(priceBase, priceForEquipment), priceDelivery), priceTotal);
		
        //15-seat
//		driver.findElement(By.xpath("//*[@id=\"seats_73\"]/div[2]")).click();
//		List<WebElement> seats = driver.findElements(By.xpath("//div[@id='ARA']//li"));
//        wheels.get(7).click();
        
		//interior carbon
//		driver.findElement(By.xpath("//*[@id=\"IIC_subHdl\"]")).click();
		//interior carbon trim
//		driver.findElement(By.xpath("//*[@id=\"vs_table_IIC_x_PEKH_x_c04_PEKH_x_shorttext\"]")).click();
		
		//driver.findElement(By.xpath("")).click();

		// Close the new window, if that window no more required
		//driver.close();
		// Switch back to original browser (first window)
		//driver.switchTo().window(winHandleBefore);
		// Continue with original browser (first window)
	}
	
	public static boolean verify(String first, String second){
		int firstNum = Integer.parseInt(first);
		int secondNum = Integer.parseInt(second);
		if(firstNum == secondNum) {
			System.out.println("Verified!");
			return true;
		}
		System.out.println("Not Verified!");
		return false;
	}
	
	public static String getNumbers(String str) {
		return str.replaceAll("\\D+","");
	}
	
	public static String sumStrings(String first, String second){
		int firstNum = Integer.parseInt(first);
		int secondNum = Integer.parseInt(second);
		return String.valueOf(firstNum + secondNum);
	}
}