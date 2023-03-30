package Crm.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();
       System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver.exe");
       driver.manage().window().maximize();
       driver.get("https://crm2_0uat.neogrowth.in/index.php");
       driver.findElement(By.id("username")).sendKeys("vinay.gaonkar");
       driver.findElement(By.id("password")).sendKeys("Goa@12345");
       driver.findElement(By.xpath("//button[text()=' Login ']")).click();
       Thread.sleep(3000);
       Actions a = new Actions(driver);
       WebElement hj = driver.findElement(By.xpath("//a[text()='All']"));
       Thread.sleep(2000);
       a.moveToElement(hj).perform();
       Thread.sleep(4000);
       driver.findElement(By.id("moduleTab_9_Cases")).click();
	}

}
