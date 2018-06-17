package com.indeed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndeedJobSearch {

	public static void main(String[] args) throws InterruptedException {
		// Set up chrome driver path
		WebDriverManager.chromedriver().setup();
		// invoke Selenium webdriver
		WebDriver driver = new ChromeDriver();
		// fullscreen
		driver.manage().window().maximize();
		// set universal wait time in case web page is slow
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * Step.1 Launch browser and navigate to https://indeed.com Expected: indeed
		 * home page should be displayed
		 */

		String url = "https://indeed.com";
		driver.get(url);

		String keyword = "Selenium";
		driver.findElement(By.xpath("//*[@id=\"text-input-what\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"text-input-what\"]")).sendKeys(keyword);

		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		String location = "Indiana";

		driver.findElement(By.xpath("//*[@id=\"text-input-where\"]")).clear();

		driver.findElement(By.xpath("//*[@id=\"text-input-where\"]")).sendKeys(location);

		driver.findElement(By.xpath("//*[@id=\"whatWhere\"]/form/div[3]/button")).click();

	}

}
