package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;

public class Saran {
	static WebDriver driver;
	   static ExtentReports rep = ExtentManager.getInstance();
	   static ExtentTest test = rep.startTest("Test Run");
	static ArrayList<String> placedMenu= new ArrayList<String>();
	static ArrayList<String> menuName= new ArrayList<String>();
	static ArrayList<String> item= new ArrayList<String>();
	static ArrayList<String> menuItem= new ArrayList<String>();

	static ArrayList<String> activeCheck= new ArrayList<String>();

	static ArrayList<String> closedCheck= new ArrayList<String>();
	static ArrayList<String> voidCheck= new ArrayList<String>();
	public void flushTest() throws Exception
	{
		Thread.sleep(2000);
		rep.endTest(test);
		rep.flush();
	}

	public static void main(String[] args) throws Throwable  {
			System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Utility.getProperty("Production_URL"));
			Thread.sleep(30000);
			driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
			driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(8000);

			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				  Thread.sleep(500);
				  }
			  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//linga-icon[@symbol=\"operations\"][1]")).click();
			  driver.findElement(By.xpath(".//label[text()=\"Close Day\"]")).click();
			  driver.findElement(By.xpath(".//button/span[text()=\"Close All Cashiers\"]")).click();
			  try
			  {
				  driver.findElement(By.xpath(".//button/span[text()=\"Cash\"]")).click();
				  Thread.sleep(8000);
			  } catch (Exception e) {
				  Thread.sleep(5000);
			  }
			  driver.findElement(By.xpath(".//linga-icon[@symbol=\"menu-icon\"]")).click();
			  driver.findElement(By.xpath(".//label[text()=\"POS\"]")).click();
		
			// Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale();
			// Place_Menu_Split_item_SeatWise();
			// Place_Menu_Split_item_Groupseat();
			Place_Menu_SplitEvenly();
			  Place_Menu_SeparateItem();
}
	private static void Place_Menu_SeparateItem() throws InterruptedException {
		for(int i=0; i<=2; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			String CheckNo = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(CheckNo);
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1500);
			
		}
	}

	private static void Place_Menu_SplitEvenly() throws InterruptedException {
		for(int i=0; i<=2; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			String CheckNo = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(CheckNo);
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Split Evenly\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		}
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

			driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
			 for(int i=0; i<activeCheck.size(); i++){
				 item.add(placedMenu.toString());
	
			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			
			 int item_count1 = driver.findElements(By.xpath(".//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button")).size();
			 for(int k=1 ;k<=item_count1 ; k++)	{
				 driver.findElement(By.xpath("(.//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button)"+"["+k+"]")).click();

			 int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			 for(int j=1 ;j<=item_count ; j++)	{
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				 js.executeScript("arguments[0].scrollIntoView();", menu3);
				 menuName.add(menu3.getText());
			  }	
			 }
			 menuItem.add(menuName.toString());
			 menuName.clear();
			  driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			 }
			 System.out.println(item);
			 System.out.println(menuItem);


			 if(item.equals(menuItem)) {
				  test.log(LogStatus.PASS, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks available");

				 System.out.println("All the menu available");
			 }
			 else {
				  test.log(LogStatus.FAIL, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks not available");
			 }



			}

	

	private static void Place_Menu_Split_item_Groupseat() throws InterruptedException {
		for(int i=0; i<=2; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			String CheckNo = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(CheckNo);
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//p[contains(text(),\"Raggi Mall\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 2\")]")).click();
			driver.findElement(By.xpath(".//p[contains(text(),\"Tacco Bell\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 3\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			}
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

			 for(int i=0; i<activeCheck.size(); i++){
				 driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 1\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 2\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 3\")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Group Seats\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			
			driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();

			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				js.executeScript("arguments[0].scrollIntoView();", menu3);
				menuName.add(menu3.getText());
			
			}
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			 }

			 if(placedMenu.equals(menuName)) {
				//  test.log(LogStatus.PASS, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks available");

				 System.out.println("All the menu available");
			 }
			 else {
				//  test.log(LogStatus.FAIL, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks not available");
			 }

		
	}

	private static void Place_Menu_Split_item_SeatWise() throws InterruptedException {
		for(int i=0; i<=2; i++) {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		String CheckNo = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(CheckNo);
		driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
		driver.findElement(By.xpath(".//p[contains(text(),\"Raggi Mall\")]")).click();
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 2\")]")).click();
		driver.findElement(By.xpath(".//p[contains(text(),\"Tacco Bell\")]")).click();
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 3\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
		 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

		}
		
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

		driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
		 for(int i=0; i<activeCheck.size(); i++){

		driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
		driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
		driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
		
		 int item_count1 = driver.findElements(By.xpath(".//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button")).size();
		 for(int k=1 ;k<=item_count1 ; k++)	{
				driver.findElement(By.xpath("(.//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button)"+"["+k+"]")).click();

		 int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		  for(int j=1 ;j<=item_count ; j++)	{
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
			  js.executeScript("arguments[0].scrollIntoView();", menu3);
			  menuName.add(menu3.getText());
		  }
		 }
		  driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
		 }

		 if(placedMenu.equals(menuName)) {
			  test.log(LogStatus.PASS, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks available");

			 System.out.println("All the menu available");
		 }
		 else {
			  test.log(LogStatus.FAIL, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks not available");
		 }


		
		
	}

	private static void Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale() throws Exception {
		 ((JavascriptExecutor) driver).executeScript("window.open()");
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));

		 driver.get(Utility.getProperty("Pre_Prod_Url"));
		 Thread.sleep(30000);
		 driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		 driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		 Thread.sleep(6000);
			
		 for (int i = 0; i < 4; i++){
			 driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			 Thread.sleep(500);
		 }
		 driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		 Thread.sleep(2000);
			
		 for (int j = 0; j < 3; j++){
			 driver.switchTo().window(tabs.get(0));
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				
			 driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			 js.executeScript("arguments[0].scrollIntoView();", menu1);
			 menu1.click();
			 
			 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			 
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 driver.switchTo().window(tabs.get(1));
			 
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();
			 
			 JavascriptExecutor js6 = (JavascriptExecutor) driver;
			 WebElement menu7 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
			 js6.executeScript("arguments[0].scrollIntoView();", menu7);
			 menu7.click();
			 String checkNo12 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 closedCheck.add(checkNo12);
			 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.switchTo().window(tabs.get(0));
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(j));
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(j)+"')]")).click();
			 driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
			 Thread.sleep(4000);
			 driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
			 driver.findElement(By.xpath(".//ion-row[@class=\"ng-star-inserted md hydrated\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			 driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
			 driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
			 driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 
			}
		 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		 
		 
		 for(int i=0; i<closedCheck.size(); i++){
			 driver.findElement(By.xpath(".//button[contains(text(),\"Void\")]")).click();
			 driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(i));
			  		Thread.sleep(5000);
			  		String Voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(i)+"')]")).getText();
			  		voidCheck.add(Voidcheckno);
			  	}
		 if(closedCheck.equals(voidCheck)) {
			//  test.log(LogStatus.PASS, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks available");

			 System.out.println("All the checks available");
		 }
		 else {
			//  test.log(LogStatus.FAIL, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks not available");
		 }

	}

}
