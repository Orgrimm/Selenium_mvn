package borshe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Borshe {

	public static void main(String[] args) {

		Driver.Setup();

		WebDriver d = new ChromeDriver();
		d.get("https://www.porsche.com/usa/modelstart/");
		d.findElement(By.xpath("//span[contains(text(),'718')]")).click();
		WebElement priceText = d
				.findElement(By.xpath("//div[@class='m-14-model-price']" + "[contains(text(),'From $ 56,900.00*')]"));
		System.out.println(priceText.getText());
		String textPrice = priceText.getText();
		d.findElement(By.xpath("//*[@id=\"m982120\"]/div[2]/div/a")).click();
		WebElement basePrice = d.findElement(By.xpath("//*[@id=\"s_price\"]/div[1]/div[1]/div[2]"));
		String BaseTextprice = basePrice.getText();
		
		String equipmentPrice = d.findElement(By.xpath("//div[@class='wrpVis']//div[2]/div[2]")).getText();
		System.out.println(equipmentPrice);
		int eqPriceInt = StringToIntConvert.StringToInt(equipmentPrice);
		if(eqPriceInt == 0) {
			System.out.println("Equipment price is :"+eqPriceInt);
		}else
			System.out.println("Equipment price is different");
		
		
	}
}
