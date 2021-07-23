package Linga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DineIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://pre-webpos.lingapos.com");
		Thread.sleep(10000);
		//driver.findElement(By.xpath(".//*[@class=\"mat-button mat-button-base\"]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("palace@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("palace1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(5000);

		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  Thread.sleep(1000);
			  }
		  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		  Thread.sleep(2000);
		  
		  
		  for (int j = 0; j < 500; j++){
			 // Thread.sleep(10000);

			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

		  driver.findElement(By.xpath(".//*[@class=\"mat-focus-indicator mat-menu-trigger order-header-menu ion-float-right mat-button mat-button-base\"]")).click();
		  driver.findElement(By.xpath(".//*[contains(@class,'mat-focus-indicator order-header-menuItem-item mat-menu-item ng-tns')][1]")).click();
		  Thread.sleep(1000);

		  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
		  Thread.sleep(500);

		 driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
			//Thread.sleep(5000);

		 
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement menu = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
	        js.executeScript("arguments[0].scrollIntoView();", menu);
	        menu.click();

				//driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();
				//driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();
				  Thread.sleep(500);

				//driver.findElement(By.xpath(".//*[text()=\"Order\"]")).click();
				//driver.findElement(By.xpath(".//*[text()=\"Print\"]")).click();

				 // Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  Thread.sleep(500);
		  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		  Thread.sleep(1000);

		  }
		  /*for (int j = 0; j < 100; j++){
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

		driver.findElement(By.xpath(".//*[@class=\"mat-focus-indicator mat-menu-trigger order-header-menu ion-float-right mat-button mat-button-base\"]")).click();
		driver.findElement(By.xpath(".//*[contains(@class,'mat-focus-indicator order-header-menuItem-item mat-menu-item ng-tns')][4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[text()= \"Chai\"]")).click();

		driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();
		driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();

		  Thread.sleep(1000);
		  //driver.findElement(By.xpath(".//*[text()=\"Order\"]")).click();
			//driver.findElement(By.xpath(".//*[text()=\"Print\"]")).click();

			 // Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		  Thread.sleep(2000);
		  }


		  for (int j = 0; j < 1; j++){
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

		  driver.findElement(By.xpath(".//*[@class=\"mat-focus-indicator mat-menu-trigger order-header-menu ion-float-right mat-button mat-button-base\"]")).click();
		  driver.findElement(By.xpath(".//*[contains(@class,'mat-focus-indicator order-header-menuItem-item mat-menu-item ng-tns')][1]")).click();
		  Thread.sleep(2000);

		  //driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
		  //Thread.sleep(2000);

		  driver.findElement(By.xpath(".//*[text()=\"T21 \"]")).click();

		 // for (int i = 0; i < 10; i++){
				driver.findElement(By.xpath(".//*[text()= \"Chai\"]")).click();

				driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();

				  Thread.sleep(1000);
				 // }
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		  Thread.sleep(2000);
		  }
		  for (int j = 0; j < 1; j++){
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

		  driver.findElement(By.xpath(".//*[@class=\"mat-focus-indicator mat-menu-trigger order-header-menu ion-float-right mat-button mat-button-base\"]")).click();
		  driver.findElement(By.xpath(".//*[contains(@class,'mat-focus-indicator order-header-menuItem-item mat-menu-item ng-tns')][1]")).click();
		  Thread.sleep(2000);

		  //driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
		  //Thread.sleep(2000);

		  driver.findElement(By.xpath(".//*[text()=\"T20 \"]")).click();

		 // for (int i = 0; i < 10; i++){
				driver.findElement(By.xpath(".//*[text()= \"Chai\"]")).click();

				driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();

				  Thread.sleep(1000);
				 // }
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		  Thread.sleep(2000);
		  }*/

	}

}
