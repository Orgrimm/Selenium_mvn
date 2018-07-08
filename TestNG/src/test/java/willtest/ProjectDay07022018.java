package willtest;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.Ordering;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectDay07022018 {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();	
	

	@Test
	public void sortRank() {

		List<String> rank = new ArrayList();
		for (int i = 1; i < 12; i++) {
			rank.add(driver.findElement(By.xpath(
					"(//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tr//td[1])[" + i + "]"))
					.getText());
			System.out.println(rank.size());
			rank.remove(10);
			boolean isSorted = Ordering.natural().isOrdered(rank);
			assertTrue(isSorted);

		}
		System.out.println(rank.size());
	}

}
