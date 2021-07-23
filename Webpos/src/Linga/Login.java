package Linga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Login {
	public static WebDriver driver;
	@BeforeClass
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.get("http://web.lingapos.com/");
Thread.sleep(3000);
driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
Thread.sleep(5000);
//login
driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"3\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"4\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Admin\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Ok\"]")).click();
		
	}
	@AfterClass
	public void closeApplication()
	{
	  driver.quit();
	  //Reporter.log("=====Browser Session End=====", true);
	}
	}


