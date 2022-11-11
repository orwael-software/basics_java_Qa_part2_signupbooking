package basics_java_Qa_part2_signupbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_java_Qa_part2_signupbooking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("Amman Rotana");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[1]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[1]/td[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
		
	}

}
