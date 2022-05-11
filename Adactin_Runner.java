package com.project;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Adactin_Runner {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Driver\\chromedriver.exe.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		//USER LOGIN
		WebElement usern = driver.findElement(By.id("username"));
		usern.sendKeys("jayalak1234");
		WebElement passw = driver.findElement(By.id("password"));
		passw.sendKeys("kannan#123");
		//SCREENSHOT SCREEN1
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Screenshot\\Screen1.png");
		FileUtils.copyFile(src1, des1);
		Thread.sleep(2000);
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		//SEARCH HOTEL
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("London");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(1);
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByValue("Super Deluxe");
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		Select s3= new Select(roomNo);
		s3.selectByIndex(2);
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.sendKeys("21/02/2022");
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.sendKeys("22/02/2022");
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultRoom);
		s4.selectByIndex(2);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(childRoom);
		s5.selectByIndex(1);
		//SCREENSHOT SCREEN2
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File src2 = ts2.getScreenshotAs(OutputType.FILE);
		File des2 = new File("C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Screenshot\\Screen2.png");
		FileUtils.copyFile(src2, des2);
		Thread.sleep(2000);
		WebElement button1 = driver.findElement(By.id("Submit"));
		button1.click();
		//SELECT HOTEL
		driver.findElement(By.id("radiobutton_0")).click();
		//SCREENSHOT SCREEN3
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File src3 = ts3.getScreenshotAs(OutputType.FILE);
		File des3 = new File("C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Screenshot\\Screen3.png");
		FileUtils.copyFile(src3, des3);
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		//BOOK A HOTEL
		driver.findElement(By.id("first_name")).sendKeys("jayalakshmi");
		driver.findElement(By.id("last_name")).sendKeys("jayakannan");
		driver.findElement(By.id("address")).sendKeys("No:56 North Street, Coimbatore");
		driver.findElement(By.id("cc_num")).sendKeys("0016001800780015");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ccType);
		s6.selectByValue("VISA");
		WebElement ccMonth = driver.findElement(By.id("cc_exp_month"));
		Select s7= new Select(ccMonth);
		s7.selectByVisibleText("March");
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(ccYear);
		s8.selectByIndex(5);
		driver.findElement(By.id("cc_cvv")).sendKeys("043");
		//SCREENSHOT SCREEN4
		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File src4 = ts4.getScreenshotAs(OutputType.FILE);
		File des4 = new File("C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts1\\Screenshot\\Screen4.png");
		FileUtils.copyFile(src4, des4);
		Thread.sleep(2000);
		driver.findElement(By.id("book_now")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement button2 = driver.findElement(By.xpath("(//input[@type ='button'])[3]"));
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(button2));
		//BOOKING CONFIRMATION-SCREENSHOT SCREEN5
		TakesScreenshot ts5 = (TakesScreenshot) driver;
		File src5 = ts5.getScreenshotAs(OutputType.FILE);
		File des5 = new File("C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Screenshot\\Screen5.png");
		FileUtils.copyFile(src5, des5);
		button2.click();
		//SCREENSHOT SCREEN6
		TakesScreenshot ts6 = (TakesScreenshot) driver;
		File src6 = ts6.getScreenshotAs(OutputType.FILE);
		File des6 = new File("C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Screenshot\\Screen6.png");
		FileUtils.copyFile(src6, des6);
		}
}
