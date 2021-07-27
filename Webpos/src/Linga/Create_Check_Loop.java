package Linga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Check_Loop {
			static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//WebDriver driver;
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://web.lingapos.com");
			Thread.sleep(10000);
			//driver.findElement(By.xpath(".//*[@class=\"mat-button mat-button-base\"]")).click();
			driver.findElement(By.id("mat-input-0")).sendKeys("sana@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("sana72726");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				  Thread.sleep(500);
				  }
			  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			  Thread.sleep(2000);
			  
			  dineservice1();
			  //delivery1();
			//  qsr1();
			 //ActiveCheck();
			  
		}
			  private static void ActiveCheck() {
			// TODO Auto-generated method stub
				  String activecheckno = " 25-006";

				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activecheckno);
				  driver.findElement(By.xpath(".//tr/td[contains(.,'"+activecheckno+"')]")).click();
				  //driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				  String activechecks = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				  System.out.println(activechecks);

				if(activecheckno.equals(activechecks)) {
					  System.out.println("QSR_Order_DinIN_T1_Activecheck - Pass");
				  }else {
					  System.out.println("Case 1- Fail");
				  }
				
			
		}
			public static void dineservice1() throws InterruptedException
			  {
			  for (int j = 0; j < 4; j++){
				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

			  driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			  Thread.sleep(1000);

			 // driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			  Thread.sleep(500);

			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		        js.executeScript("arguments[0].scrollIntoView();", menu1);
		        menu1.click();
		        
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		        js1.executeScript("arguments[0].scrollIntoView();", menu2);
		        menu2.click();
		        
		        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		        WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		        js2.executeScript("arguments[0].scrollIntoView();", menu3);
		        menu3.click();
				  Thread.sleep(1000);

					
			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();

		        JavascriptExecutor js3 = (JavascriptExecutor) driver;
		        WebElement menu4 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
		        js3.executeScript("arguments[0].scrollIntoView();", menu4);
		        menu4.click();
		        
		        JavascriptExecutor js4 = (JavascriptExecutor) driver;
		        WebElement menu5 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
		        js4.executeScript("arguments[0].scrollIntoView();", menu5);
		        menu5.click();
		        
		        JavascriptExecutor js5 = (JavascriptExecutor) driver;
		        WebElement menu6 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
		        js5.executeScript("arguments[0].scrollIntoView();", menu6);
		        menu6.click();
				  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

		        JavascriptExecutor js6 = (JavascriptExecutor) driver;
		        WebElement menu7 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
		        js6.executeScript("arguments[0].scrollIntoView();", menu7);
		        menu7.click();
		        
		        JavascriptExecutor js7 = (JavascriptExecutor) driver;
		        WebElement menu8 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
		        js7.executeScript("arguments[0].scrollIntoView();", menu8);
		        menu8.click();
		        
		        JavascriptExecutor js8 = (JavascriptExecutor) driver;
		        WebElement menu9 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
		        js8.executeScript("arguments[0].scrollIntoView();", menu9);
		        menu9.click();
				  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			  Thread.sleep(1000);
			  }
			  }
			  
			  //Delivery check
			  public static void delivery1() throws InterruptedException {
				  
			  for (int j = 0; j < 100; j++){
				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  Thread.sleep(1000);

			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DELIVERY\"]")).click();
		
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[contains(@class,\"mat-input-element mat-form-field-autofill-control mat-a\")]")).click();
			driver.findElement(By.xpath(".//span[text()=\" chinnu saran 562656565 \"]")).click();
			Thread.sleep(5000);
			
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			} catch (Exception e) {
			// Code for Handling exception
			}
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\"Save\"]")).click();
			Thread.sleep(5000);
			

			driver.findElement(By.xpath(".//*[text()= \"Chai\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Boo Boo\"]")).click();

			//driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();
			//driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();

			  Thread.sleep(1000);
			  //driver.findElement(By.xpath(".//*[text()=\"Order\"]")).click();
				//driver.findElement(By.xpath(".//*[text()=\"Print\"]")).click();

				 // Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			  Thread.sleep(2000);
			  }
			  }


			 /* for (int j = 0; j < 1; j++){
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
			  public static void qsr1() throws InterruptedException
			  {
			  for (int j = 0; j < 200; j++){

					  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();			 
			        JavascriptExecutor js = (JavascriptExecutor) driver;
			        WebElement menu = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			        js.executeScript("arguments[0].scrollIntoView();", menu);
			        menu.click();

						driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]")).click();
						driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
						driver.findElement(By.xpath(".//button[text()=\"Cash\"]")).click();
						//Thread.sleep(500);
						driver.findElement(By.xpath(".//div//ion-col[@class=\"success md hydrated\"]")).click();
						driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
						Thread.sleep(2500);
						driver.findElement(By.xpath(".//button[text()=\"Side CC\"]")).click();
						//Thread.sleep(500);

						driver.findElement(By.xpath(".//*[text()=\"Submit\"]")).click();
				  }
			  }


		

	}


