package Linga;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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
	static String checkNo1;

	   static ExtentReports rep = ExtentManager.getInstance();
	   static ExtentTest test = rep.startTest("Test Run");
	static ArrayList<String> placedMenu= new ArrayList<String>();
	static ArrayList<String> menuName= new ArrayList<String>();
	static ArrayList<String> item= new ArrayList<String>();
	static ArrayList<String> menuItem= new ArrayList<String>();
	static ArrayList<String> itemName= new ArrayList<String>();

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
			Thread.sleep(15000);
			driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
			driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(10000);

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
			//Place_Menu_SplitEvenly();
			//  Place_Menu_SeparateItem();
			//  Browser1_placeMenu_Browser2_opensameCheck_PlaceMenu_afterloop_Finish();
			//  Browser1_placeMenu_TaxExempt_Browser2_Placemenu_ServiceExempt();
			 // Browser1_placeMenu_Finish_Browser2_CheckInOpen_Browser1_CheckClose_Browser2_ClickDone();
			// Browser1_placeMenu_Finish_Browser2_CheckInOpen_Browser1_voidCheck_Browser2_ClickDone();
			//Browser1_placeMenu_PartialPay_Browser2_CheckInOpen_Complete_payment_Browser1_ClickDone();
			 // Browser1_PlaceMenu_Finish_Browser2_PlaceMenu_Finish();
			  Browser1_PlaceMenu_Finish_Browser2_syncCheck_PlaceMenu_Finish();
}
	private static void Browser1_PlaceMenu_Finish_Browser2_syncCheck_PlaceMenu_Finish() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(10000);

		for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
				  Thread.sleep(500);
				  }
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		for(int i = 0; i<10; i++) {
			if(i % 2 == 0)
				driver.switchTo().window(tabs.get(0));
			else
				driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
				 driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//linga-icon[@symbol=\"sync\"]")).click();
			        Thread.sleep(1000);
				 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				 try {
					 driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
					 driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
				 }catch(Exception e) {
				
				 }
				 try {
					 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 }catch(Exception e) {
				
				 }
				 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
				 placedMenu.add(menu1.getText());
				 js.executeScript("arguments[0].scrollIntoView();", menu1);
				 menu1.click();

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
			placedMenu.add(menu1.getText());
	        js1.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();

	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
	        placedMenu.add(menu1.getText());
	        js2.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();
	        Thread.sleep(500);

	        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	        driver.findElement(By.xpath(".//linga-icon[@symbol=\"sync\"]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		  	}
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
		
		  	driver.findElement(By.xpath(".//button/p[text()=\"T5 \"]")).click();
		  	try {
		  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		  	}catch(Exception e) {
				
			}
		  	Thread.sleep(1000);
		  	int item_count = driver.findElements(By.xpath(".//div[@class=\"orderlist-container  \"]")).size();
		  	System.out.println(item_count);
		  	if(item_count==placedMenu.size()) {
		  		System.out.println("Pass");

		  	}
		  	for(int i=1 ;i<=item_count ; i++)	{
		  		String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
		  		menuName.add(menuitemname);
		  	

		  		  }
		  	System.out.println(menuName);
		  	System.out.println(placedMenu);
		  	if(menuName==(placedMenu)) {
			  System.out.println("Pass");

		  }
		  placedMenu.clear();
		  menuName.clear();
		
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	private static void Browser1_PlaceMenu_Finish_Browser2_PlaceMenu_Finish() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(10000);

		for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
				  Thread.sleep(500);
				  }
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		for(int i = 0; i<100; i++) {
			if(i % 2 == 0)
				driver.switchTo().window(tabs.get(0));
			else
				driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
				 driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				 try {
					 driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
					 driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
				 }catch(Exception e) {
				
				 }
				 try {
					 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 }catch(Exception e) {
				
				 }
				 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
				 placedMenu.add(menu1.getText());
				 js.executeScript("arguments[0].scrollIntoView();", menu1);
				 menu1.click();

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
			placedMenu.add(menu1.getText());
	        js1.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();

	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
	        placedMenu.add(menu1.getText());
	        js2.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();
	        Thread.sleep(500);

	        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		  	}
		  
		  	driver.findElement(By.xpath(".//button/p[text()=\"T5 \"]")).click();
		  	try {
		  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		  	}catch(Exception e) {
				
			}
		  	Thread.sleep(1000);
		  	int item_count = driver.findElements(By.xpath(".//div[@class=\"orderlist-container  \"]")).size();
		  	System.out.println(item_count);
		  	if(item_count==placedMenu.size()) {
		  		System.out.println("Pass");

		  	}
		  	for(int i=1 ;i<=item_count ; i++)	{
		  		String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
		  		menuName.add(menuitemname);
		  		//  System.out.println(i);

		  		//  System.out.println(menuitemname);

		  		  }
		  	System.out.println(menuName);
		  	System.out.println(placedMenu);
		  	if(menuName==(placedMenu)) {
			  System.out.println("Pass");

		  }
		  placedMenu.clear();
		  menuName.clear();
		
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
	}

	private static void Browser1_placeMenu_PartialPay_Browser2_CheckInOpen_Complete_payment_Browser1_ClickDone() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(10000);

			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
				  Thread.sleep(500);
				  }
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(2000);
			for(int i=0 ; i<=10 ; i++) {

			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			menuItem.add(checkNo1);
			driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Rs.50.00\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Cash\")]")).click();
			
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Cash\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Submit\")]")).click();
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();

			 driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
			 driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
			 driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.switchTo().window(tabs.get(1));
			 Thread.sleep(15000);

				driver.findElement(By.xpath(".//button[@class=\"alert-button ion-focusable ion-activatable sc-ion-alert-ios\"]")).click();
				 Thread.sleep(3000);
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js14 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
			}
			placedMenu.removeAll(menuName);
			if(placedMenu.isEmpty()) {
				System.out.println("Menu Available");
					}else {
						System.out.println("Menu not Available");
					}
			placedMenu.clear();
			menuName.clear();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	private static void Browser1_placeMenu_Finish_Browser2_CheckInOpen_Browser1_voidCheck_Browser2_ClickDone() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(10000);

			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
				  Thread.sleep(500);
				  }
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(2000);
			for(int i=0 ; i<=10 ; i++) {

			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			

			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			menuItem.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			
			
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();

			 driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
			 driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
			 driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.switchTo().window(tabs.get(1));
			 Thread.sleep(15000);

				driver.findElement(By.xpath(".//button[@class=\"alert-button ion-focusable ion-activatable sc-ion-alert-ios\"]")).click();
				 Thread.sleep(3000);
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			for(int i=0; i<menuItem.size(); i++){
		  		driver.findElement(By.xpath(".//button[contains(text(),\"Void\")]")).click();
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(menuItem.get(i));
		  		Thread.sleep(8000);
		  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+menuItem.get(i)+"')]")).getText();
		  		voidCheck.add(closedcheckno);
		  	}
		  if(menuItem.equals(voidCheck)) {
			  System.out.println("All the checks available");
		  }	
		  placedMenu.clear();
			menuName.clear();
			
	}

	private static void Browser1_placeMenu_Finish_Browser2_CheckInOpen_Browser1_CheckClose_Browser2_ClickDone() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(10000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(10000);

			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
				  Thread.sleep(500);
				  }
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(2000);
			for(int i=0 ; i<=10 ; i++) {

			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			

			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			menuItem.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			
			
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();

			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.switchTo().window(tabs.get(1));
			 Thread.sleep(15000);

				driver.findElement(By.xpath(".//button[@class=\"alert-button ion-focusable ion-activatable sc-ion-alert-ios\"]")).click();
				 Thread.sleep(1500);
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			for(int i=0; i<menuItem.size(); i++){
		  		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(menuItem.get(i));
		  		Thread.sleep(8000);
		  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+menuItem.get(i)+"')]")).getText();
		  		closedCheck.add(closedcheckno);
		  	}
		  if(menuItem.equals(closedCheck)) {
			  System.out.println("All the checks available");
		  }			
		  placedMenu.clear();
			menuName.clear();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();


	}

	private static void Browser1_placeMenu_TaxExempt_Browser2_Placemenu_ServiceExempt() {
		
	}

	private static void Browser1_placeMenu_Browser2_opensameCheck_PlaceMenu_afterloop_Finish() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(10000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				  Thread.sleep(500);
				  }
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(2000);

			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			WebElement menu11 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js11.executeScript("arguments[0].scrollIntoView();", menu11);
			menu11.click();
			placedMenu.add(menu11.getText());
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			menu11 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
			js12.executeScript("arguments[0].scrollIntoView();", menu11);
			menu11.click();
			placedMenu.add(menu11.getText());
			JavascriptExecutor js21 = (JavascriptExecutor) driver;
			menu11 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
			js21.executeScript("arguments[0].scrollIntoView();", menu11);
			menu11.click();
			placedMenu.add(menu11.getText());
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();

			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
						
			for(int i=0 ; i<=30 ; i++) {
				driver.switchTo().window(tabs.get(0));

			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			driver.switchTo().window(tabs.get(1));
			try {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();

			}
			catch(Exception e) {
				
			}
			driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			
			JavascriptExecutor js22 = (JavascriptExecutor) driver;
			WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
			js22.executeScript("arguments[0].scrollIntoView();", menu2);
			menu2.click();
			placedMenu.add(menu2.getText());
			JavascriptExecutor js13 = (JavascriptExecutor) driver;
			menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Milk\"]"));
			js13.executeScript("arguments[0].scrollIntoView();", menu2);
			menu2.click();
			placedMenu.add(menu2.getText());
			
			JavascriptExecutor js14 = (JavascriptExecutor) driver;
			menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Buu Buu\"]"));
			js14.executeScript("arguments[0].scrollIntoView();", menu2);
			menu2.click();
			placedMenu.add(menu2.getText());
			
			}
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js14 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
			}
			System.out.println(placedMenu);
			System.out.println(menuName);

			placedMenu.removeAll(menuName);
			if(placedMenu.isEmpty()) {
				System.out.println("Menu Available");
					}else {
						System.out.println("Menu not Available");
					}
			placedMenu.clear();
			menuName.clear();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();


	}

	private static void Place_Menu_SeparateItem() throws InterruptedException {
		int count = 5;
		for(int i=0; i<count; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(2000);
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
			driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(CheckNo);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+CheckNo+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//p[contains(text(),\"Chai \")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Separate item\")]")).click();
			driver.findElement(By.xpath(".//input[contains(@class,\"mat-input-element mat-form\")]")).sendKeys(""+count);
			driver.findElement(By.xpath(".//span[contains(text(),\"Continue\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//p[contains(text(),\"Raggi Mall\")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Separate item\")]")).click();
			driver.findElement(By.xpath(".//input[contains(@class,\"mat-input-element mat-form\")]")).sendKeys(""+count);
			driver.findElement(By.xpath(".//span[contains(text(),\"Continue\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//p[contains(text(),\"Tacco Bell\")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Separate item\")]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//input[contains(@class,\"mat-input-element mat-form\")]")).sendKeys(""+count);
			driver.findElement(By.xpath(".//span[contains(text(),\"Continue\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		}
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

			driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
			 for(int i=0; i<activeCheck.size(); i++){
				item.addAll(placedMenu);
				placedMenu.clear();
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
			 System.out.println(item);
			 System.out.println(menuName);
			 for(int i=0;i<item.size();i++) {
		        	for(int j=0; j<menuName.size();j++) {
		        		if(item.get(i).equals(menuName.get(j))){
		        			menuItem.add(menuName.get(j));
		        			break;
		        		}
		        			
		        	}

		        }
//			 item.forEach(ite ->{
//				 itemName.forEach(itNam -> {
//					 if (ite == itNam) {
//		        			menuItem.add(ite);
//		        			return ;
//
//					 }
//				 });
//			 });
			 System.out.println(menuItem);

			if (item.equals(menuItem)) {
				 test.log(LogStatus.PASS, "Place_Menu_SeparateItem - Checks available");

				 System.out.println("All the menu available");
			 }
			 else {
				  test.log(LogStatus.FAIL, "Place_Menu_SeparateItem - Checks not available");
			 }

			 
//			 List<String> differences = itemName.stream()
//			            .filter(element -> !item.contains(element))
//			            .collect(Collectors.toList());
//			 System.out.println("NewOne"+differences);
//			 item.stream().filter((num) -> 
//				 itemName.stream().filter(val -> 
//					 num.stream().filter(num2 ->
//					 val.stream().filter(val1 -> {
//						if(num2 == val1) {
//					 }
//					 });
//				 )
//				 )
//				 
//			 );
//			 item.forEach(val -> {
//				 itemName.forEach(data -> {
//					 	System.out.println(data);
//					 	System.out.println(val);
//					 for(int i = 0 ; i< val.length() ; i++) {
//						 for (int j=0; j< data.length(); j++) {
//							 if(val.contains(data)) {
//								 menuItem.add(data);
//								 break;
//							 }
//						 }
//					 }
//					 
//				 });
//			 });
//			 	System.out.println(menuItem);

//			 for(int i=0;i<item.size();i++) {
//		        	for(int j=0; j<itemName.size();j++) {
//		   			// for(int k=0;k<item.get(i).length();k++) {
//				        	//for(int m=0; m<itemName.get(j).length();m++) {
//
//				               // System.out.println(item.get(i).length());
//		        		
//				   			 boolean val = item.get(i).contains(itemName.get(j));
//				               System.out.println(val);
////				               menuItem.add(val);
//				              //  int sana = item.get(i).indexOf(k);
//				              //  int saran = itemName.get(j).indexOf(m);
//				                //System.out.println(sana);
//				                //System.out.println(saran);
//
//				                
//		        		//if(sana.equals(saran){
//		        		//	menuItem.add(saran);
//		        			//break;
//		        		//}
//		        			
//		        	//}
//
//		        }}
			 

				 

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
			  test.log(LogStatus.PASS, "Place_Menu_Split_item_SeatWise - Checks available");

			 System.out.println("All the menu available");
		 }
		 else {
			  test.log(LogStatus.FAIL, "Place_Menu_Split_item_SeatWise - Checks not available");
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
