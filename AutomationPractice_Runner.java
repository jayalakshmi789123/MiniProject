package com.project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractice_Runner {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Driver\\chromedriver.exe.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//SIGN IN
		driver.findElement(By.xpath("//a[@class ='login']")).click();
		//ALREADY REGISTERED
		driver.findElement(By.id("email")).sendKeys("deshva_123@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("pranitha#56");
		driver.findElement(By.id("SubmitLogin")).click();
		//WOMEN
		driver.findElement(By.xpath("//a[text() = 'Women']")).click();
		WebElement tops = driver.findElement(By.xpath("(//a[contains(@title, 'Choose from t-shirts')])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(tops));
		tops.click();
		//CATALOG
		driver.findElement(By.id("layered_category_7")).click();
		driver.findElement(By.id("layered_id_attribute_group_3")).click();
		driver.findElement(By.id("layered_id_attribute_group_11")).click();
		driver.findElement(By.id("layered_id_feature_5")).click();
		driver.findElement(By.xpath("(//a[@title = 'Blouse'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		//PAYMENT PROCESS
		driver.findElement(By.xpath("//a[@title = 'Proceed to checkout']")).click();
		driver.findElement(By.xpath("//span[text() = 'Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//button[@type = 'submit'])[2]")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("(//button[@type = 'submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@title = 'Pay by bank wire']")).click();
		driver.findElement(By.xpath("//span[text() ='I confirm my order']")).click();
		driver.findElement(By.xpath("//a[@title = 'Back to orders']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000);");
		/*
		 * WebElement button =
		 * driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
		 * js.executeScript("arguments[0].scrollIntoView();", button);
		 */
		//ORDER HISTORY SCREENSHOT
		TakesScreenshot t = (TakesScreenshot)driver;
		File s1 = t.getScreenshotAs(OutputType.FILE);
		File s2 = new File("C:\\Users\\jayka\\eclipse-workspace1\\Selenium_Concepts\\Screenshot\\order.png");
		FileUtils.copyFile(s1, s2);
		//SIGN OUT
		//driver.findElement(By.xpath("//a[@title ='Log me out']")).click();
	}

}
