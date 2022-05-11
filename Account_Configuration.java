package com.project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account_Configuration {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Driver\\chromedriver.exe.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class = 'login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("deshva_123@gmail.com");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Jayalakshmi");
		driver.findElement(By.id("customer_lastname")).sendKeys("jayakannan");
		driver.findElement(By.id("passwd")).sendKeys("pranitha#56");
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("13");
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByIndex(8);
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1988");
		driver.findElement(By.name("address11")).sendKeys("No.25, North Street");
		driver.findElement(By.name("address2")).sendKeys("Mettupalayam");
		driver.findElement(By.name("city")).sendKeys("Los Angeles");
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(state);
		s3.selectByIndex(6);
		driver.findElement(By.id("postcode")).sendKeys("63250");
		driver.findElement(By.id("phone_mobile")).sendKeys("8056667845");
		driver.findElement(By.id("alias")).sendKeys("No.55, North Madurai");
		driver.findElement(By.xpath("(//button)[2]")).click();
			
	}

}
