package Linga;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Check_Menu_Missing_Method {

		static WebDriver driver;
		static ArrayList<String> menuName= new ArrayList<String>();
		static ArrayList<String> placedMenu= new ArrayList<String>();
		static ArrayList<String> menuCheck= new ArrayList<String>();

		static ArrayList<String> activeCheck= new ArrayList<String>();
		static ArrayList<String> closedCheck= new ArrayList<String>();
		static ArrayList<String> voidCheck= new ArrayList<String>();
		static ArrayList<String> afterActiveCheck= new ArrayList<String>();
		static ArrayList<String> afterClosedCheck= new ArrayList<String>();
		static ArrayList<String> afterVoidCheck= new ArrayList<String>();
		static ArrayList<String> voidMenu= new ArrayList<String>();
		static ArrayList<String> TransferFrom= new ArrayList<String>();
		static ArrayList<String> TransferTo= new ArrayList<String>();


		 static JSONObject jsonObject = new JSONObject();
		 static String checkNo1;



		 public static void main(String[] args) throws Throwable  {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Utility.getProperty("Staging_Url"));
			Thread.sleep(20000);
			driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
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
		

			  // closeTheDay();
			  // Menumiss2G();
			  // Place_menuitem_Finish_loop();
			  // activeAndClosed();
			  // Categorymenucheck();
			  // Active_Closed_Void();
			  // Acticecheck();
			  // allDoubleClick();
			  // transfersingle_multiitem();
			  // transferallitem();
			  // Merge();
			  // multipleTab();
			  // CheckReopen();
			  // seatwiseitemcheck ();
			  // breadscrum_modifier();
			  // Place_menu_finish_check_open_void_2_menu_finish_check_open_check_menu ();
			  // Place_menu_finish_check_open_void_2_menu_closesale_check_Reopen_check_menu ();
			  // Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu ();
			  // check_Open_Place_item_Finish_Loop();
			  // Browser1_Place_menu_Browser2_Change_service_type_Place_menu_item();
			  // Transfer_Check_one_by_one();
			  // Merge_Check_one_by_one();
			  // menuVoidLoop();
			  // Place_menu_completepayment_closeCheck_Reopen_Check_placeMenu_closeSale();
			 //  Browser1_Place_menu__attachCustomer1_Browser2_Change_service_type_Place_menu_item_attachCustomer2();
			  // Place_Menu_Do_Payment_VoidPaymnet_DoAnotherPaymnet();
			  // Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment_SideCC_payment();
			  // Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment_HA_payment();
			  // Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment();
			  // Place_menu_Do_Payment_Finish_CheckOpen_Place_menu_item_Delete_payment();
			  //  Browser1_Place_menu_Browser2_addSeat_Place_menu_item();
			  // Browser1_Place_menu_activeCheck_Browser2_Place_menu_item_close_Check();
			  // Place_menu_Do_hold_Loop();
			  // Browser1_Place_menu_hold_Browser2_menu_sendToKitchen();
			  // Browser1_Place_menu_activeCheck_Browser2_Place_menu_item_void_check();
			  // Browser1_CreateChecks_TransferAllItem_FromOneTable_To_AnotherTable_Browser2_TransferAllItem_FromOneTable_To_AnotherTable();	
			  // Browser1_CreateChecks_Merge_Two_Checks_Browser2_Merge_Two_Checks();
			  // Transfer_server_In_Loop();
			  // Transfer_Table_In_Loop();
			  // Browser1_Create_100Checks_Browser2_Close_100Check();
			  // Browser1_Create_100holdChecks_Browser2_send_100Check_ToKitchen();
			   Browser1_Create_100Checks_Browser2_void_100Check();
			  // Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale();
		 }
		 
		 private static void Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
				Thread.sleep(30000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);
				
				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
					Thread.sleep(500);
				}
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(2000);
				
				for (int j = 0; j < 50; j++){
					driver.switchTo().window(tabs.get(0));
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					
					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					Thread.sleep(500);
					
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
							Thread.sleep(2000);
							driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(j));
							Thread.sleep(1000);
							driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(j)+"')]")).click();
							driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
							Thread.sleep(5000);
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
				  		driver.findElement(By.xpath(".//button[contains(text(),\"Void\"])")).click();
				  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(i));
				  		Thread.sleep(5000);
				  		String Voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(i)+"')]")).getText();
				  		voidCheck.add(Voidcheckno);
				  	}
				  if(closedCheck.equals(voidCheck)) {
					  System.out.println("All the checks available");
				  }



		}

		private static void Browser1_Create_100Checks_Browser2_void_100Check() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/");
				Thread.sleep(30000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);
				
				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
					Thread.sleep(500);
				}
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(2000);
				
					for (int k = 0; k < 200; k++){
						driver.switchTo().window(tabs.get(1));

						driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
						
						driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
						Thread.sleep(500);
						driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
						Thread.sleep(1000);
						
						driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
						Thread.sleep(500);
						
						driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
						driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
						JavascriptExecutor js = (JavascriptExecutor) driver;
				        WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
				        js.executeScript("arguments[0].scrollIntoView();", menu1);
				        menu1.click();
				        menuName.add(menu1.getText());
				        
				        JavascriptExecutor js1 = (JavascriptExecutor) driver;
				        WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
				        js1.executeScript("arguments[0].scrollIntoView();", menu2);
				        menu2.click();
				        menuName.add(menu2.getText());

				        JavascriptExecutor js2 = (JavascriptExecutor) driver;
				        WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
				        js2.executeScript("arguments[0].scrollIntoView();", menu3);
				        menu3.click();
				        menuName.add(menu3.getText());
				        String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				        activeCheck.add(itemcheckno1);

				        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
						
						driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
						Thread.sleep(1000);
					}
					driver.switchTo().window(tabs.get(0));
					for(int m=0;m<activeCheck.size();m++) {
						driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
						
						driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
						Thread.sleep(500);
						driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
						Thread.sleep(1000);
						
						driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
						
							driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
							Thread.sleep(1000);
							driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
							driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
							try {
								driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
							}catch(Exception e) {
								
							}
							
							driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
						driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
						driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
						driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
						Thread.sleep(1000);
					}
										
					driver.switchTo().window(tabs.get(0));

					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			
				  
				  	for(int i=0; i<activeCheck.size(); i++){
				  		driver.findElement(By.xpath(".//button[contains(text(),\"Void\"])")).click();
				  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				  		Thread.sleep(8000);
				  		String Voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				  		voidCheck.add(Voidcheckno);
				  	}
				  if(activeCheck.equals(voidCheck)) {
					  System.out.println("All the checks available");
				  }

			 
		}

		private static void Browser1_Create_100holdChecks_Browser2_send_100Check_ToKitchen() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
				Thread.sleep(30000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);
				
				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
					Thread.sleep(500);
				}
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(2000);
				
				//for (int j = 0; j < 50; j++){
					driver.switchTo().window(tabs.get(0));
					for (int k = 0; k < 100; k++){
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					
					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					Thread.sleep(500);
					
					driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
					JavascriptExecutor js = (JavascriptExecutor) driver;
					WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
					js.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText());
					driver.findElement(By.xpath(".//div[contains(@class,\"orderlist-container  highlight\")]/div/div[text()=\"Chai\"]")).click();
					driver.findElement(By.xpath(".//button/label[text()=\"Hold\"]")).click();
					driver.findElement(By.xpath(".//span[text()=\"Done\"]")).click();

			        String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			        activeCheck.add(itemcheckno1);

			        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					Thread.sleep(1000);
					}
					driver.switchTo().window(tabs.get(1));
					for(int m=0;m<activeCheck.size();m++) {
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					
					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath(".//button[text()=\"Hold\"]")).click();
					
						driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
						Thread.sleep(1000);
						driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
						driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
						driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
						driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
						 Thread.sleep(1000);
					}
					
					
				//}
					driver.switchTo().window(tabs.get(0));

					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			
				  
				  	for(int i=0; i<activeCheck.size(); i++){
				  		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				  		Thread.sleep(8000);
				  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				  		closedCheck.add(closedcheckno);
				  	}
				  if(activeCheck.equals(closedCheck)) {
					  System.out.println("All the checks available");
				  }

		}

		private static void Browser1_Create_100Checks_Browser2_Close_100Check() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/login");
				Thread.sleep(30000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);
				
				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
					Thread.sleep(500);
				}
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(2000);
				
					for (int k = 0; k < 100; k++){
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					
					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					Thread.sleep(500);
					
					driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
					JavascriptExecutor js = (JavascriptExecutor) driver;
			        WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			        js.executeScript("arguments[0].scrollIntoView();", menu1);
			        menu1.click();
			        menuName.add(menu1.getText());
			        
			        JavascriptExecutor js1 = (JavascriptExecutor) driver;
			        WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			        js1.executeScript("arguments[0].scrollIntoView();", menu2);
			        menu2.click();
			        menuName.add(menu2.getText());

			        JavascriptExecutor js2 = (JavascriptExecutor) driver;
			        WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			        js2.executeScript("arguments[0].scrollIntoView();", menu3);
			        menu3.click();
			        menuName.add(menu3.getText());
			        String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			        activeCheck.add(itemcheckno1);

			        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					Thread.sleep(1000);
					}
					driver.switchTo().window(tabs.get(0));
					for(int m=0;m<activeCheck.size();m++) {
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					
					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
					
						driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
						Thread.sleep(1000);
						driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
						driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
						try {
							driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
						}catch(Exception e) {
							
						}
						driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
						driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
						driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
						 Thread.sleep(1000);
					}
					
					
				
					driver.switchTo().window(tabs.get(1));

					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			
				  
				  	for(int i=0; i<activeCheck.size(); i++){
				  		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				  		Thread.sleep(8000);
				  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				  		closedCheck.add(closedcheckno);
				  	}
				  if(activeCheck.equals(closedCheck)) {
					  System.out.println("All the checks available");
				  }
		
		}

		private static void Transfer_Table_In_Loop() throws InterruptedException {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
			  int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span")).size();
			 
			  for(int j=1; j<size; j++) {
				  try{
				  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
				  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
				  }
				  catch(Exception e) {
					  
				  }
			  driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom\")]/ul/div/div/div/span)"+"["+j+"]")).click();
				 
			  driver.findElement(By.xpath(".//div/p[contains(.,'"+checkNo1+"')]")).click();
			  driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span)"+"["+j+"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			  }	
			  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
			 
			  String tableNo = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom\")]/ul/div/div/div/span)"+"["+size+"]")).getText();
			  driver.findElement(By.xpath(".//button[@class=\"cancel\"]")).click();
			  driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
			  Thread.sleep(500);

			  driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			  Thread.sleep(500);

			  String tableName = driver.findElement(By.xpath("(.//tr/td)[1]")).getText();
			  if(tableNo.contains(tableName)) {
					 System.out.println("Check available in :" +tableName);
			  }
			 
		}

		private static void Transfer_server_In_Loop() throws InterruptedException {
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			 
			 driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			 checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		 
			 int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span")).size();
			 for(int j=1; j<=size; j++) {
				 String FromUserName = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom\")]/ul/div/div/div/span)"+"["+j+"]")).getText();
				 TransferFrom.add(FromUserName);
				 	}
			 System.out.println(TransferFrom);
				

				 
			 String conts = "Shivam 1";
			 int count = 1;
			 for(int k =1; k<TransferFrom.size(); k++) {
				 try {
					 driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
					 	}catch(Exception e) {
						 
					 }
					 
					 int index = TransferFrom.indexOf(conts);
					 System.out.println("index"+index);

					 index ++;
					 TransferTo.clear();
					 driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span)"+"["+index+"]")).click();
					 int size1 = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span")).size();
					 for(int s=1; s<=size1; s++) {
						 String ToUserName = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span)"+"["+s+"]")).getText();
						 TransferTo.add(ToUserName);
					 }				 	
					 System.out.println(TransferTo);	
					 driver.findElement(By.xpath(".//div/p[contains(.,'"+checkNo1+"')]")).click();
						for(int m=1; m<= TransferTo.size();m++) {

						WebElement text = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span)"+"["+count+"]"));
						text.click();
						 if(k >= 2) {
							 count ++;
						 }
						conts = text.getText();
						 driver.findElement(By.xpath(".//*[text()=\"Yes\"]")).click();
						  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
						  Thread.sleep(1000);
						  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
					 
						break;
						}
				 }
		}
		

		private static void Browser1_CreateChecks_Merge_Two_Checks_Browser2_Merge_Two_Checks() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
			 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			 driver.switchTo().window(tabs.get(1));

			 driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
			 Thread.sleep(30000);
			 driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			 driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			 Thread.sleep(6000);
			 
			 for (int i = 0; i < 4; i++){
				 driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
				 Thread.sleep(500);
				}
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(2000);
				
				driver.switchTo().window(tabs.get(0));

			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			 for(int i=1; i<= 40; i++ ) {
				 String tableName= "T";
				 String fullTableName =  tableName.concat(String.valueOf(i));
				 activeCheck.add(fullTableName);
				 driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
				 driver.findElement(By.xpath(".//*[contains(text(),'"+fullTableName+"')]")).click();
				 driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				 driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				 Thread.sleep(1000);
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
				 String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			 }
			  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			 for(int j=1; j<activeCheck.size(); j++) {
				 if(j%2==0) {
						driver.switchTo().window(tabs.get(0));
				 }
				 else {
						driver.switchTo().window(tabs.get(1));
				 }
				 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
				 driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();

				 driver.findElement(By.xpath(".//div[text()=\"Merge\"]")).click();
				 driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
				 driver.findElement(By.xpath(".//button/p[contains(.,\"T1 \")]")).click();
				 driver.findElement(By.xpath(".//button/p[text()='"+activeCheck.get(j)+" ']")).click();
				 driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
				 driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
				 Thread.sleep(4000);
				 driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
				 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				}	
			 	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
				driver.findElement(By.xpath(".//button/p[contains(.,\"T1 \")]")).click();
				int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				for(int i=1 ;i<=item_count2 ; i++)	{
					JavascriptExecutor js2 = (JavascriptExecutor) driver;
					WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
					js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
					menuName.add(menuitemname.getText());
				}
						
				placedMenu.removeAll(menuName);   
				if (placedMenu.isEmpty()) {
					System.out.println("Merge one by one - Menu items available - Pass");
				  }
				  	else {
				  		System.out.println("Check one by one - fail");
				  	}
				  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();


			 
		}

		private static void Browser1_CreateChecks_TransferAllItem_FromOneTable_To_AnotherTable_Browser2_TransferAllItem_FromOneTable_To_AnotherTable() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
				Thread.sleep(30000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);
				
				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
					Thread.sleep(500);
				}
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(2000);
				
				driver.switchTo().window(tabs.get(0));

				for (int j = 0; j < 10; j++){
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();

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
				String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				activeCheck.add(itemcheckno1);
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

				}

				int checkSizeTotal = (activeCheck.size()-1);
					for(int j=0; j<checkSizeTotal; j++) {
						if((j%2==0)) {
						driver.switchTo().window(tabs.get(0));
						}else {
						driver.switchTo().window(tabs.get(1));
						}
						driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
						driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
						Thread.sleep(500);
						driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
						
					driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//div/span[contains(.,'"+activeCheck.get(j)+"')]")).click();
					int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
					for(int i=1 ;i<=checkSize ; i++)	{
					driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + i + "]")).click();
					}
					j++;
					driver.findElement(By.xpath("(.//div/span[contains(.,'"+activeCheck.get(j)+"')])[2]")).click();
					driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
					Thread.sleep(500);
				  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
					j--;
				}
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
					driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
					String lastCheckNo = activeCheck.get(activeCheck.size()-1);
					driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(lastCheckNo);
					Thread.sleep(3000);
					driver.findElement(By.xpath(".//tr/td[contains(.,'"+lastCheckNo+"')]")).click();
					driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
					int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
					for(int i=1 ;i<=item_count2 ; i++)	{
						JavascriptExecutor js2 = (JavascriptExecutor) driver;
						WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
						js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
						menuName.add(menuitemname.getText());
					}
					
					 for(int i=0;i<placedMenu.size();i++) {
				        	for(int j=0; j<menuName.size();j++) {
				        		if(placedMenu.get(i).equals(menuName.get(j))){
				        			menuCheck.add(menuName.get(j));
				        			break;
				        		}
				        			
				        	}

				        }
					if (placedMenu.equals(menuCheck)) {
						System.out.println("Transfer item one by one - Menu items available - Pass");
					  }
					  	else {
					  		System.out.println("Transfer item one by one - fail");
					  	}
					  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
					  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			 
		}

		private static void Browser1_Place_menu_activeCheck_Browser2_Place_menu_item_void_check() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
				Thread.sleep(30000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);
				
				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
					Thread.sleep(500);
				}
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(2000);
				
				for (int j = 0; j < 200; j++){
					driver.switchTo().window(tabs.get(0));
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					
					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					Thread.sleep(500);
					
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();

					driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					Thread.sleep(500);

					driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
					JavascriptExecutor js = (JavascriptExecutor) driver;
					WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
					js.executeScript("arguments[0].scrollIntoView();", menu1);
					menu1.click();
					Thread.sleep(1000);

					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					Thread.sleep(1000);

					driver.switchTo().window(tabs.get(1));
					
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					
					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
					Thread.sleep(500);
					
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					voidCheck.add(checkNo11);
					
					driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
					driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
					driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				}
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					  System.out.println(voidCheck);
					  System.out.println(afterVoidCheck);

				  
				  	for(int i=0; i<voidCheck.size(); i++){
				  		driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
				  		Thread.sleep(3000);
				  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(voidCheck.get(i));
				  		Thread.sleep(5000);
				  		String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+voidCheck.get(i)+"')]")).getText();
				  		afterVoidCheck.add(voidcheckno);
				  	}
				  if(voidCheck.equals(afterVoidCheck)) {
					  System.out.println("All the checks available");
				  }


			 
		}

		private static void Browser1_Place_menu_hold_Browser2_menu_sendToKitchen() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
				Thread.sleep(30000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);

				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
					  Thread.sleep(500);
					  }
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(2000);

				for(int i = 0; i<200; i++) {
					driver.switchTo().window(tabs.get(0));
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
					Thread.sleep(1000);

					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					Thread.sleep(1000);
					try {
						driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
						driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
					}catch (Exception e) {
					}
					/*	try
					{
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

						} catch (Exception e) {
					// Code for Handling exception
					}*/
					driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
					JavascriptExecutor js = (JavascriptExecutor) driver;
					WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
					js.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText());
					driver.findElement(By.xpath(".//div[contains(@class,\"orderlist-container  highlight\")]/div/div[text()=\"Chai\"]")).click();
					driver.findElement(By.xpath(".//button/label[text()=\"Hold\"]")).click();
					driver.findElement(By.xpath(".//span[text()=\"Done\"]")).click();

				  
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					driver.switchTo().window(tabs.get(1));
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
					Thread.sleep(1000);

					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

				  	}
				  	driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				  	try
					{
				  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
					} catch (Exception e) {
					// Code for Handling exception
					}
				 
				  	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  	for(int i=1 ;i<=item_count ; i++)	{
				  		JavascriptExecutor js = (JavascriptExecutor) driver;
				  		WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
				  		js.executeScript("arguments[0].scrollIntoView();", menu3);
				  		menuName.add(menu3.getText());
				  	}
				  	if(menuName.equals(placedMenu)) {
				  		System.out.println("Check Open and Finish - Menu items available - Pass");
					  	}
				  	else {
				  		System.out.println("Check Open and Finish - menu Not available - fail");
				  	}
				  	placedMenu.clear();
				  	menuName.clear();	  
				  	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  	driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				  	Thread.sleep(1000);

		 			}

		private static void Place_menu_Do_hold_Loop() throws InterruptedException {
			 	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);
				for(int i = 0; i<200; i++) {
					driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				/*	try
					{
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

					} catch (Exception e) {
					// Code for Handling exception
					}*/
					driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
					JavascriptExecutor js = (JavascriptExecutor) driver;
					WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
					js.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText());
					driver.findElement(By.xpath(".//div[contains(@class,\"orderlist-container  highlight\")]/div/div[text()=\"Chai\"]")).click();
					driver.findElement(By.xpath(".//button/label[text()=\"Hold\"]")).click();
					driver.findElement(By.xpath(".//span[text()=\"Done\"]")).click();

				  
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  	}
				  	driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				  	try
				  	{
				  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
					} catch (Exception e) {
					// Code for Handling exception
					}
				 
				  	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  	for(int i=1 ;i<=item_count ; i++)	{
				  		JavascriptExecutor js = (JavascriptExecutor) driver;
				  		WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
				  		js.executeScript("arguments[0].scrollIntoView();", menu3);
				  		menuName.add(menu3.getText());
				  	}
				  	if(menuName.equals(placedMenu)) {
				  		System.out.println("Check Open and Finish - Menu items available - Pass");
				  	}
				  	else {
				  		System.out.println("Check Open and Finish - menu Not available - fail");
				  	}
				  	placedMenu.clear();
				  	menuName.clear();	  
				  	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  	driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				  	Thread.sleep(1000);
					}

		private static void Browser1_Place_menu_activeCheck_Browser2_Place_menu_item_close_Check() throws InterruptedException {
			// TODO Auto-generated method stub
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
			Thread.sleep(30000);
			driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);
			
			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
				Thread.sleep(500);
			}
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(2000);
			
			for (int j = 0; j < 50; j++){
				driver.switchTo().window(tabs.get(0));
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				
				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
				js.executeScript("arguments[0].scrollIntoView();", menu1);
				menu1.click();
				String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				menuName.add(checkNo11);
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
				placedMenu.add(checkNo12);
				driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				 Thread.sleep(1000);
			}
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		
			  
			  	for(int i=0; i<placedMenu.size(); i++){
			  		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(placedMenu.get(i));
			  		Thread.sleep(8000);
			  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+placedMenu.get(i)+"')]")).getText();
			  		closedCheck.add(closedcheckno);
			  	}
			  if(placedMenu.equals(closedCheck)) {
				  System.out.println("All the checks available");
			  }

		}

		private static void Browser1_Place_menu_Browser2_addSeat_Place_menu_item() throws InterruptedException {
			// TODO Auto-generated method stub
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
			Thread.sleep(30000);
			driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);

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
				try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				}catch (Exception e) {
				}
				driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();

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
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				
				driver.switchTo().window(tabs.get(1));
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();

				driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
				
				JavascriptExecutor js12 = (JavascriptExecutor) driver;
				WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
				js12.executeScript("arguments[0].scrollIntoView();", menu2);
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
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
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

		private static void Place_Menu_Do_Payment_VoidPaymnet_DoAnotherPaymnet() throws InterruptedException {
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				/*	try
					{
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

					} catch (Exception e) {
					// Code for Handling exception
					}*/
					driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
				  js.executeScript("arguments[0].scrollIntoView();", menu3);
				  menu3.click();
				  placedMenu.add(menu3.getText());
				  driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();

					for(int i = 0; i<10; i++) {

				  driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Cash\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Gift Card\")]")).click();
				  driver.findElement(By.xpath(".//input[@id=\"cardInput\"]")).sendKeys("1234");
				  driver.findElement(By.xpath("(.//span[text()=\"Process\"])[1]")).click();
				  Thread.sleep(5000);
				  driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Side CC\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Others\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
				  driver.findElement(By.xpath(".//button[text()=\"HA Payment\"]")).click();
				  driver.findElement(By.xpath(".//input[@id=\"cardInput\"]")).sendKeys("1234");
				  driver.findElement(By.xpath("(.//span[text()=\"Process\"])[1]")).click();
				  Thread.sleep(5000);
				  driver.findElement(By.xpath(".//ion-col[contains(text(),\"Others\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
				  Thread.sleep(500);

				  driver.findElement(By.xpath(".//ion-col[contains(text(),\"Cash\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
				  Thread.sleep(500);

				  driver.findElement(By.xpath(".//ion-col[contains(text(),\"Side CC\")]")).click();

				  driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
				  Thread.sleep(1000);

				  driver.findElement(By.xpath(".//ion-col[contains(text(),\"HA Payment\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
				  Thread.sleep(1000);

				  driver.findElement(By.xpath(".//ion-col[contains(text(),\"Gift Card\")]")).click();
				  driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
				  Thread.sleep(1500);

					}
				  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  
				  driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				  try
					{
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

					} catch (Exception e) {
					// Code for Handling exception
					}
				 
				  int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  for(int i=1 ;i<=item_count ; i++)	{
					  JavascriptExecutor js1 = (JavascriptExecutor) driver;
					  WebElement menu31 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
					  js1.executeScript("arguments[0].scrollIntoView();", menu31);
					  menuName.add(menu3.getText());
					  		  }
				  if(menuName.equals(placedMenu)) {
					  System.out.println("Check Open and Finish - Menu items available - Pass");
					  }
				  else {
						 System.out.println("Check Open and Finish - menu Not available - fail");
					 }
				  placedMenu.clear();
				  menuName.clear();	  
				  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				  Thread.sleep(1000);

		}

		private static void Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment_SideCC_payment() throws InterruptedException {
			 ((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/login");
			Thread.sleep(30000);
			driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

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
			driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			}catch (Exception e) {
				}
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
			driver.findElement(By.xpath(".//div[text()=\"Side CC\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
			js12.executeScript("arguments[0].scrollIntoView();", menu2);
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
			driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Side CC\")]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(5000);
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

		private static void Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment_HA_payment() throws InterruptedException {
				((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/login");
			Thread.sleep(30000);
			driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

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
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			}catch (Exception e) {
				}
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
			driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Rs.50.00\"]")).click();

			driver.findElement(By.xpath(".//button[text()=\"HA Payment\"]")).click();
			driver.findElement(By.xpath(".//input[@id=\"cardInput\"]")).sendKeys("1234");
			driver.findElement(By.xpath("(.//span[text()=\"Process\"])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(6000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
			js12.executeScript("arguments[0].scrollIntoView();", menu2);
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
			driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"HA Payment\")]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(5000);
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
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();	}

		 
			private static void Browser1_Place_menu__attachCustomer1_Browser2_Change_service_type_Place_menu_item_attachCustomer2() throws InterruptedException {
				((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
				Thread.sleep(30000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(6000);

				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
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
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				
				for(int i=0 ; i<=10 ; i++) {
					try {
						driver.switchTo().window(tabs.get(0));
						driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
						driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
						driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
						driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
						Thread.sleep(10000);
						driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
						driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
						
						driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
						driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
						driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
						Thread.sleep(500);
						driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
					}catch (Exception e) {
						}
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
				driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
				driver.findElement(By.xpath(".//div[contains(text(),\"Chotu Bhai 8883441421\")]")).click();

				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				
				driver.switchTo().window(tabs.get(1));
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"TOGO\"]")).click();

				driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
				
				JavascriptExecutor js12 = (JavascriptExecutor) driver;
				WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
				js12.executeScript("arguments[0].scrollIntoView();", menu2);
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
				driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
				driver.findElement(By.xpath(".//div[contains(text(),\"Chinnu Saran 98745632103\")]")).click();

				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
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

		private static void Place_menu_completepayment_closeCheck_Reopen_Check_placeMenu_closeSale() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
			Thread.sleep(2000);
			for(int i=1; i<=3;i++) {

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
			String checkreopen = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();

			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();

			driver.findElement(By.xpath(".//*[text()= \"Closed\"]")).click();
			Thread.sleep(8000);

			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkreopen);
			Thread.sleep(2000);

			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkreopen+"')]")).click();		
			driver.findElement(By.xpath(".//*[text()= \" Re-open Check \"]")).click();
			Thread.sleep(5000);
			
			
			//String checkreopen1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			}
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
				menuName.add(menuitemname);
			}
			if(placedMenu.equals(menuName)) {
				System.out.println("CheckReopen_Menu_Available_Or_Not - pass");
			}else {
				System.out.println("CheckReopen_Menu_Available_Or_Not - Fail");
			}
			placedMenu.clear();
			menuName.clear();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			
		}

		private static void Place_menu_Do_Payment_Finish_CheckOpen_Place_menu_item_Delete_payment() throws InterruptedException {
			for(int i=0 ; i<=10 ; i++) {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
				try {
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				}catch (Exception e) {
					}
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
				driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
				
				JavascriptExecutor js12 = (JavascriptExecutor) driver;
				WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
				js12.executeScript("arguments[0].scrollIntoView();", menu2);
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
				driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
				driver.findElement(By.xpath(".//ion-col[contains(text(),\"Others\")]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				}
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(3000);
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

		private static void menuVoidLoop() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			

			driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();

			for(int i=0;i<=3;i++) {
			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			try {
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			  
			for(int j=1 ;j<item_count ; j++)	{
				 int val;

				  try {
					  val = driver.findElements(By.xpath(".//div[@class=\"p-col-1 icon-img\"]/div")).size();
				  }catch(Exception e) {
					  val=0;
				  }
				  System.out.println(val);

				  int count = 0;
				  if(val > 0) {
					  String voidx;
					  try {
						  voidx = driver.findElement(By.xpath("(.//div[@class=\"void-item-symbol\"])"+"["+j+"]")).getText();
					  } catch(Exception e) {
						 voidx = "crt";
					 }
					  System.out.println(voidx);

					  if(voidx!="X") {
						  System.out.print("cameinside");
						  JavascriptExecutor js4 = (JavascriptExecutor) driver;
						  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
						  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
						  menuitemname.click();
						  voidMenu.add(menuitemname.getText());
						  placedMenu.removeAll(voidMenu);
						  driver.findElement(By.xpath("(.//button[@class=\"menu-option-content-button\"])[3]")).click();
						  driver.findElement(By.xpath(".//div/textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");
						  driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
						Thread.sleep(500);
						  count++;
					} else {
						 System.out.println(j);
						continue;
					}
				  } else {
					  System.out.print("Camefor");

					  JavascriptExecutor js4 = (JavascriptExecutor) driver;
					  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
					  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
					  menuitemname.click();
					  voidMenu.add(menuitemname.getText());
					  placedMenu.removeAll(voidMenu);
					  driver.findElement(By.xpath("(.//button[@class=\"menu-option-content-button\"])[3]")).click();
					  driver.findElement(By.xpath(".//div/textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");
					  driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
					Thread.sleep(500);
					  count++;
				  }
				  
				  
			  }

			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();

			}



			
		}

		private static void Merge_Check_one_by_one() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			for(int i=1; i<= 3; i++ ) {
				String tableName= "T";
				String fullTableName =  tableName.concat(String.valueOf(i));
				activeCheck.add(fullTableName);

			driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
			driver.findElement(By.xpath(".//*[contains(text(),'"+fullTableName+"')]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			Thread.sleep(1000);
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
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				}
			for(int j=1; j<activeCheck.size(); j++) {
				driver.findElement(By.xpath(".//div[text()=\"Merge\"]")).click();
				driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
				driver.findElement(By.xpath(".//button/p[contains(.,\"T1 \")]")).click();
				
				driver.findElement(By.xpath(".//button/p[text()='"+activeCheck.get(j)+" ']")).click();
				driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
				driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();

			}
			driver.findElement(By.xpath(".//button/p[contains(.,\"T1 \")]")).click();

			int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int i=1 ;i<=item_count2 ; i++)	{
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
				js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
			}
					
			placedMenu.removeAll(menuName);   
			if (placedMenu.isEmpty()) {
				System.out.println("Merge one by one - Menu items available - Pass");
			  }
			  	else {
			  		System.out.println("Check one by one - fail");
			  	}
			  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			
			
		}

		private static void Transfer_Check_one_by_one() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			for(int i=1; i<= 3; i++ ) {
				String tableName= "T";
				String fullTableName =  tableName.concat(String.valueOf(i));
			driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
			driver.findElement(By.xpath(".//*[contains(text(),'"+fullTableName+"')]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			Thread.sleep(1000);
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
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(itemcheckno1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			
			}
			int checkSizeTotal = (activeCheck.size()-1);
				for(int j=0; j<checkSizeTotal; j++) {
				driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//div/span[contains(.,'"+activeCheck.get(j)+"')]")).click();
				int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
				for(int i=1 ;i<=checkSize ; i++)	{
				driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + i + "]")).click();
				}
				j++;
				driver.findElement(By.xpath("(.//div/span[contains(.,'"+activeCheck.get(j)+"')])[2]")).click();
				driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
				Thread.sleep(500);
				j--;
			}

				driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
				driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
				String lastCheckNo = activeCheck.get(activeCheck.size()-1);
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(lastCheckNo);
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+lastCheckNo+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				for(int i=1 ;i<=item_count2 ; i++)	{
					JavascriptExecutor js2 = (JavascriptExecutor) driver;
					WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
					js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
					menuName.add(menuitemname.getText());
				}
				placedMenu.removeAll(menuName);   
				if (placedMenu.isEmpty()) {
					System.out.println("Transfer item one by one - Menu items available - Pass");
				  }
				  	else {
				  		System.out.println("Transfer item one by one - fail");
				  	}
				  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

					}

			private static void Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment() throws InterruptedException {
				((JavascriptExecutor) driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));

				driver.get("https://pre-webpos.lingapos.com/#/auth/login");
			Thread.sleep(30000);
			driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

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
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			}catch (Exception e) {
				}
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
			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
			js12.executeScript("arguments[0].scrollIntoView();", menu2);
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
			driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Others\")]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(5000);
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

		private static void Browser1_Place_menu_Browser2_Change_service_type_Place_menu_item() throws InterruptedException {
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
			Thread.sleep(30000);
			driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
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
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			
			for(int i=0 ; i<=10 ; i++) {
				try {
					driver.switchTo().window(tabs.get(0));
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
					driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
					Thread.sleep(10000);
					driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
					driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
					
					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
				}catch (Exception e) {
					}
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
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"TOGO\"]")).click();

			driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
			js12.executeScript("arguments[0].scrollIntoView();", menu2);
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
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
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

		private static void check_Open_Place_item_Finish_Loop() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			for(int i = 0; i<200; i++) {
				driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
			/*	try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}*/
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
			  js.executeScript("arguments[0].scrollIntoView();", menu3);
			  menu3.click();
			  placedMenu.add(menu3.getText());
				Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  }
			  driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
			  try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
			 
			  int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			  for(int i=1 ;i<=item_count ; i++)	{
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
				  js.executeScript("arguments[0].scrollIntoView();", menu3);
				  menuName.add(menu3.getText());
				  		  }
			  if(menuName.equals(placedMenu)) {
				  System.out.println("Check Open and Finish - Menu items available - Pass");
				  }
			  else {
					 System.out.println("Check Open and Finish - menu Not available - fail");
				 }
			  placedMenu.clear();
			  menuName.clear();	  
			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			  Thread.sleep(1000);

			
		}

		private static void Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T11 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			// Code for Handling exception
			}
			try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			}catch (Exception e) {
				driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
				}
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
		 
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Re-open Check \"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			driver.findElement(By.xpath("(.//ion-col[@class=\"md hydrated\"])[5]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			  for(int j=1 ;j<item_count ; j++)	{
				  JavascriptExecutor js4 = (JavascriptExecutor) driver;
				  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
				  menuitemname.click();
				  voidMenu.add(menuitemname.getText());
			  }
			  placedMenu.removeAll(voidMenu);
			driver.findElement(By.xpath("(.//button[@class=\"menu-option-content-button\"])[3]")).click();
			driver.findElement(By.xpath(".//div/textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");

			driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Re-open Check \"]")).click();
			Thread.sleep(5000);
			int item_count1 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count1 ; j++)	{
				JavascriptExecutor js4 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
			  }
			 menuName.removeAll(placedMenu);
			  
			  System.out.println(voidMenu);
			  System.out.println(menuName);

			  if(voidMenu.equals(menuName)) {
				  System.out.println("Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu - Pass");
			  	}
			  else {
				 System.out.println("Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu - fail");
			  }
			placedMenu.clear();
			menuName.clear();
			voidMenu.clear();
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();

			
		}

		private static void Place_menu_finish_check_open_void_2_menu_closesale_check_Reopen_check_menu() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T10 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			// Code for Handling exception
			}
			try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			}catch (Exception e) {
				driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
				}
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
		 
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T10 \"]")).click();
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			  for(int j=1 ;j<item_count ; j++)	{
				  JavascriptExecutor js4 = (JavascriptExecutor) driver;
				  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
				  menuitemname.click();
				  voidMenu.add(menuitemname.getText());
			  }
			  placedMenu.removeAll(voidMenu);
			
			driver.findElement(By.xpath("(.//button[@class=\"menu-option-content-button\"])[3]")).click();
			driver.findElement(By.xpath(".//div/textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");

			driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Re-open Check \"]")).click();
			Thread.sleep(5000);
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			// Code for Handling exception
			}
			int item_count1 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count1 ; j++)	{
				JavascriptExecutor js4 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
			  }
				menuName.removeAll(placedMenu);
			  
			  System.out.println(voidMenu);
			  System.out.println(menuName);

			  if(voidMenu.equals(menuName)) {
				  System.out.println("Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu - Pass");
			  	}
			  else {
				 System.out.println("Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu - fail");
			  }
			placedMenu.clear();
			menuName.clear();
			voidMenu.clear();
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
			
		}

		private static void Place_menu_finish_check_open_void_2_menu_finish_check_open_check_menu() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			// Code for Handling exception
			}
			try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			}catch (Exception e) {
				driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
				}
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
		 
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			// Code for Handling exception
			}
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			  for(int j=1 ;j<item_count ; j++)	{
				  JavascriptExecutor js4 = (JavascriptExecutor) driver;
				  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
				  menuitemname.click();
				  voidMenu.add(menuitemname.getText());
			  }
			  placedMenu.removeAll(voidMenu);
			driver.findElement(By.xpath("(.//button[@class=\"menu-option-content-button\"])[3]")).click();
			driver.findElement(By.xpath(".//div/textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");

			driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			// Code for Handling exception
			}
			int item_count1 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			  for(int j=1 ;j<=item_count1 ; j++)	{
				  JavascriptExecutor js4 = (JavascriptExecutor) driver;
				  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
				  menuName.add(menuitemname.getText());
			  }
			  menuName.removeAll(placedMenu);
			  
			  System.out.println(voidMenu);
			  System.out.println(menuName);

			  if(voidMenu.equals(menuName)) {
				  System.out.println("Place_menu_finish_check_open_void_2_menu_finish_check_open_check_menu - Pass");
			  	}
			  else {
				 System.out.println("Place_menu_finish_check_open_void_2_menu_finish_check_open_check_menu - fail");
			  }
			placedMenu.clear();
			menuName.clear();
			voidMenu.clear();
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
		
			}

		private static void breadscrum_modifier() throws Throwable {
			for (int j = 0; j < 100; j++){
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				placedMenu.clear();

				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				try {
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				}catch (Exception e) {
					}
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				WebElement menu1 = driver.findElement(By.xpath(".//button[contains(@class,\"subCategoryBtn \")]/div[text()=\"Breadscrum Menu\"]"));
				menu1.click();
				driver.findElement(By.xpath(".//button[text()=\" LARGE \"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" OLIVES \"]")).click();
				driver.findElement(By.xpath("(.//button[text()=\"Extra\"])[1]")).click();
				driver.findElement(By.xpath(".//p[text()=\"Nuts\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Almond \"]")).click();
				driver.findElement(By.xpath("(.//button[text()=\"add\"])[1]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Done \"]")).click();
				
				checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}

				menu1 = driver.findElement(By.xpath(".//button/div[text()=\"Convensional Menu\"]"));
				menu1.click();
				driver.findElement(By.xpath("(.//button[text()=\" CHEESE \"])[1]")).click();
				driver.findElement(By.xpath("(.//button[text()=\" Add \"])[1]")).click();
				driver.findElement(By.xpath("(.//button[text()=\" CHEESE \"])[2]")).click();
				driver.findElement(By.xpath("(.//button[text()=\" Add \"])[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(.//button[@class=\"mod-done-button\"])[1]")).click();
				int item_count1 = driver.findElements(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])")).size();
			  	for(int k=1 ;k<=item_count1 ; k++)	{
			  		JavascriptExecutor js = (JavascriptExecutor) driver;
			  		WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + k + "]"));
			  		js.executeScript("arguments[0].scrollIntoView();", menuitemname);
			  		placedMenu.add(menuitemname.getText());
			  	}
			  	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				Thread.sleep(1000);
				}
			  	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			  	driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			  	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			  	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			  	driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			  	try
				{
			  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				} catch (Exception e) {
				// Code for Handling exception
				}
			  	int item_count = driver.findElements(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])")).size();
			  	for(int j=1 ;j<=item_count ; j++)	{
			  		JavascriptExecutor js = (JavascriptExecutor) driver;
			  		WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
			  		js.executeScript("arguments[0].scrollIntoView();", menuitemname);
			  		menuName.add(menuitemname.getText());
			  	}
			  	System.out.println(placedMenu);
			  	System.out.println(menuName);
			  	if(placedMenu.equals(menuName)) {
			  		System.out.println("Breadscrum modifier & Conversional - item Available - Pass");
			  		}
			  	else {
			  		System.out.println("Breadscrum modifier & Conversional - menu not available - fail");
			  	}
			  	placedMenu.clear();
			  	menuName.clear();
			  	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  	driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
		}
			private static void seatwiseitemcheck() throws InterruptedException {
			for (int j = 0; j < 20; j++){
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				try {
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				}catch (Exception e) {
					driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
					}
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
			 
				checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			  
				JavascriptExecutor js3 = (JavascriptExecutor) driver;
				WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
				js3.executeScript("arguments[0].scrollIntoView();", menu2);
				menu2.click();
				placedMenu.add(menu2.getText());
			  			        
				JavascriptExecutor js4 = (JavascriptExecutor) driver;
				menu2 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
				js4.executeScript("arguments[0].scrollIntoView();", menu2);
				menu2.click();
				placedMenu.add(menu2.getText());

				JavascriptExecutor js5 = (JavascriptExecutor) driver;
				menu2 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
				js5.executeScript("arguments[0].scrollIntoView();", menu2);
				menu2.click();
				placedMenu.add(menu2.getText());
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

				JavascriptExecutor js6 = (JavascriptExecutor) driver;
				WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
				js6.executeScript("arguments[0].scrollIntoView();", menu3);
				menu3.click();
				placedMenu.add(menu3.getText());
		        
				JavascriptExecutor js7 = (JavascriptExecutor) driver;
				menu3 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
				js7.executeScript("arguments[0].scrollIntoView();", menu3);
				menu3.click();
				placedMenu.add(menu3.getText());
		        
				JavascriptExecutor js8 = (JavascriptExecutor) driver;
				menu3 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
				js8.executeScript("arguments[0].scrollIntoView();", menu3);
				menu3.click();
				placedMenu.add(menu3.getText()); 
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				Thread.sleep(1000);
				}
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			  driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			  driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			  driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			  try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
			  int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			  for(int j=1 ;j<=item_count ; j++)	{
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				  js.executeScript("arguments[0].scrollIntoView();", menuitemname);
				  menuName.add(menuitemname.getText());
			  }
			  System.out.println(placedMenu);
			  System.out.println(menuName);

			  if(placedMenu.equals(menuName)) {
				  System.out.println("Create multiple seat with different category - item Available - Pass");
			  	}
			  else {
				 System.out.println("Create multiple seat with different category - menu not available - fail");
			  }
			placedMenu.clear();
			menuName.clear();
			activeCheck.clear();
			afterActiveCheck.clear();
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
		
		}

		private static void CheckReopen() throws InterruptedException {
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
			String checkreopen = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();

			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();

			driver.findElement(By.xpath(".//*[text()= \"Closed\"]")).click();
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkreopen+"')]")).click();		
			driver.findElement(By.xpath(".//*[text()= \" Re-open Check \"]")).click();
			Thread.sleep(1000);
			String checkreopen1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();

			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
				menuName.add(menuitemname);
			}
			if(placedMenu.equals(menuName)) {
				System.out.println("Menu Available");
			}else {
				System.out.println("Menu not Available");
			}
			placedMenu.clear();
			menuName.clear();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

				}

		private static void multipleTab() throws InterruptedException {
			
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			driver.get("https://staging-webpos-india.lingapos.com/#/auth/login");
			Thread.sleep(30000);
			driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
			driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

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
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			}catch (Exception e) {
				}
			
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
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
			js12.executeScript("arguments[0].scrollIntoView();", menu2);
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
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js14 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
			}
			if(placedMenu.equals(menuName)) {
				System.out.println("Menu Available");
					}else {
						System.out.println("Menu not Available");
					}
			placedMenu.clear();
			menuName.clear();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
									
		}

		private static void Merge() throws InterruptedException {
			for(int k=0; k<=10 ; k++) {

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
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Laddu\"]")).click();
			
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			WebElement menu = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
			js3.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());
			
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			menu = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
			js4.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());
			
			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			menu = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
			js5.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();
			
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
			js6.executeScript("arguments[0].scrollIntoView();", menu3);
			menu3.click();
			placedMenu.add(menu3.getText());
				
			JavascriptExecutor js7 = (JavascriptExecutor) driver;
			menu3 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
			js7.executeScript("arguments[0].scrollIntoView();", menu3);
			menu3.click();
			placedMenu.add(menu3.getText());
			
			JavascriptExecutor js8 = (JavascriptExecutor) driver;
			menu3 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
			js8.executeScript("arguments[0].scrollIntoView();", menu3);
			menu3.click();
			placedMenu.add(menu3.getText());
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();

			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				
				driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
			}
			driver.findElement(By.xpath(".//ion-toolbar[contains(@class,\"toolbar-title-default\")]/button")).click();
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			int item_count2 = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
			for(int j=1 ;j<=item_count2 ; j++)	{
				driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				} catch (Exception e) {
				// Code for Handling exception
				}
			}
			driver.findElement(By.xpath(".//ion-toolbar[contains(@class,\"toolbar-title-default\")]/button")).click();

			driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
			int item_count3 = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
			for(int j=1 ;j<=item_count3 ; j++)	{
				driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
			}
			driver.findElement(By.xpath(".//ion-toolbar[contains(@class,\"toolbar-title-default\")]/button")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			// Code for Handling exception
			}
			int item_count4 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int i=1 ;i<=item_count4 ; i++)	{
				JavascriptExecutor js4 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
				js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
				  		  }
			placedMenu.removeAll(menuName);
		

			if(placedMenu.isEmpty()) {
				System.out.println("Merge - Menu items available - Pass");
			}
			else {
				System.out.println("Merge - menu available - fail");
			}
			placedMenu.clear();
			menuName.clear();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				
		}

		private static void transferallitem() throws InterruptedException {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
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
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Laddu\"]")).click();

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			WebElement menu = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
			js3.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());
		        
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			menu = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
			js4.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			menu = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
			js5.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());
			String itemcheckno2 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			
			  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//div/span[contains(.,'"+itemcheckno1+"')]")).click();
			  int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
				 for(int i=1 ;i<=checkSize ; i++)	{
				driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + i + "]")).click();
				  		  }
			  driver.findElement(By.xpath("(.//div/span[contains(.,'"+itemcheckno2+"')])[2]")).click();
			  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//button/p[text()=\"T8 \"]")).click();
			  int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				 for(int i=1 ;i<=item_count2 ; i++)	{
					  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
				  menuName.add(menuitemname);
				  		  }
				 placedMenu.removeAll(menuName);   
				  if (placedMenu.isEmpty()) {
					  System.out.println("Transferallitem - Menu items available - Pass");
				  }
				  else {
						 System.out.println("Transferallitem - fail");
					 }
				  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();


		}

		private static void transfersingle_multiitem() throws InterruptedException {
			// TODO Auto-generated method stub
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
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
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Laddu\"]")).click();

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			WebElement menu = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
			js3.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());
		        
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			menu = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
			js4.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			menu = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
			js5.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());
			String itemcheckno2 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			
			  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//div/span[contains(.,'"+itemcheckno1+"')]")).click();
			  driver.findElement(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]/p[text()=\"Chai \"]")).click();
			  driver.findElement(By.xpath("(.//div/span[contains(.,'"+itemcheckno2+"')])[2]")).click();
			  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			  driver.findElement(By.xpath(".//button/p[text()=\"T7 \"]")).click();
			  int item_count1 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				 for(int i=1 ;i<=item_count1 ; i++)	{
					  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
				  menuName.add(menuitemname);
				  		  }
				 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
					Thread.sleep(500);
				 
			  driver.findElement(By.xpath(".//button/p[text()=\"T8 \"]")).click();
			  int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				 for(int i=1 ;i<=item_count2 ; i++)	{
					  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
				  menuName.add(menuitemname);
				  		  }
				 placedMenu.removeAll(menuName);   
				  if (placedMenu.isEmpty()) {
					  System.out.println("Transfersingleitem - Menu items available - Pass");
				  }
				  else {
						 System.out.println("Transfersingleitem - fail");
					 }
					 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
					 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		}

		private static void allDoubleClick() throws InterruptedException {
			// TODO Auto-generated method stub
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);

			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Laddu\"]")).click();

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			WebElement menu = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
			js3.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());
		        
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			menu = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
			js4.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			menu = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
			js5.executeScript("arguments[0].scrollIntoView();", menu);
			menu.click();
			placedMenu.add(menu.getText());

			String checkNo3 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			Actions action = new Actions(driver);
			action.doubleClick(driver.findElement(By.xpath(".//button[text()=\"All\"]"))).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			String checkNo4 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			if(checkNo3.equals(checkNo4)) {
				System.out.println("Double click the All button - check available - Pass");
					}
			 int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			 for(int i=1 ;i<=item_count ; i++)	{
				  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
			  menuName.add(menuitemname);

			  		  }
			  if(menuName.equals(placedMenu)) {
				  System.out.println("Double click the all button - Menu items available - Pass");
			  }
			  else {
					 System.out.println("Double click the all button - menu available - fail");
				 }
				}

		private static void closeTheDay() throws InterruptedException {
			// TODO Auto-generated method stub
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//linga-icon[@symbol=\"operations\"][1]")).click();
			  driver.findElement(By.xpath(".//label[text()=\"Close Day\"]")).click();
			  driver.findElement(By.xpath(".//button/span[text()=\"Close All Cashiers\"]")).click();
			  try
			  {
				  driver.findElement(By.xpath(".//button/span[text()=\"Cash\"]")).click();
				  Thread.sleep(1000);
			  } catch (Exception e) {
				  Thread.sleep(100);
			  }
			  driver.findElement(By.xpath(".//linga-icon[@symbol=\"menu-icon\"]")).click();
			  driver.findElement(By.xpath(".//label[text()=\"POS\"]")).click();
			  
		}

		private static void Acticecheck() throws InterruptedException, JSONException {
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

		  driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		  Thread.sleep(500);
		  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
		  Thread.sleep(1000);

		  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
		  Thread.sleep(500);

		 driver.findElement(By.xpath(".//*[text()=\"T13 \"]")).click();
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
		 String number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		 JSONObject jsonObject = new JSONObject();
		 jsonObject.put("CheckNo", number);
		 jsonObject.put("Menu", placedMenu);
		 System.out.println(jsonObject);
		 menuName.add(jsonObject.toString());
		 System.out.println(menuName);
		 


		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  Thread.sleep(500);
			
		}

		private static void Active_Closed_Void() throws InterruptedException {
			for (int j = 0; j < 50; j++){
				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

			  driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			  Thread.sleep(500);

			 driver.findElement(By.xpath(".//*[text()=\"T11 \"]")).click();
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
			 String number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 activeCheck.add(number);
			 
			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T12 \"]")).click();
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
			  String number1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  closedCheck.add(number1);
			  driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
				 
				 driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
				 driver.findElement(By.xpath(".//*[text()=\"T13 \"]")).click();
				 driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				 driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				 driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
				 
				 JavascriptExecutor js12 = (JavascriptExecutor) driver;
				 WebElement menu11 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
				 js12.executeScript("arguments[0].scrollIntoView();", menu11);
				 menu11.click();
				 
				 JavascriptExecutor js13 = (JavascriptExecutor) driver;
				 WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
				 js13.executeScript("arguments[0].scrollIntoView();", menu12);
				 menu12.click();
				 
				 JavascriptExecutor js14 = (JavascriptExecutor) driver;
				 WebElement menu13 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
				 js14.executeScript("arguments[0].scrollIntoView();", menu13);
				 menu13.click();
				 String number3 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				 voidCheck.add(number3);
				 driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
				 driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
				 driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");
				 driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
				 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				 Thread.sleep(1000);
				}	
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			  for(int i=0; i<activeCheck.size(); i++){
				  driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				  driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
				  driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				  int item_count = driver.findElements(By.xpath(".//div[@class=\"orderlist-container  \"]")).size();
					 for(int j=1 ;j<=item_count ; j++)	{
						  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
					  menuName.add(menuitemname);
					  		  }
					
				  String activecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				  afterActiveCheck.add(activecheckno);//(Closedcheck array used for active checks in active check status screen)
				  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();

				 			  }
			  
			  for(int i=0; i<closedCheck.size(); i++){
				  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(i));
				  String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(i)+"')]")).getText();
				  afterClosedCheck.add(closedcheckno);
				  
				 			  }
			  for(int i=0; i<voidCheck.size(); i++){
				  driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(voidCheck.get(i));
				  String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+voidCheck.get(i)+"')]")).getText();
				  afterVoidCheck.add(voidcheckno);
				  
				 			  }
			  if(afterActiveCheck.equals(activeCheck)&& (afterClosedCheck.equals(closedCheck))&&(afterVoidCheck.equals(voidCheck))) {
				  System.out.println("Create active check_closedcheck_VoidCheck - Check Available - Pass");
			  }
			if(placedMenu.equals(menuName)) {
				  System.out.println("Create active check_closedcheck_VoidCheck - item Available - Pass");
			  }
				
		}

		private static void Categorymenucheck() throws InterruptedException, JSONException {
			for (int j = 0; j < 2; j++){
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			  Thread.sleep(500);

			 driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
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
			 
			 String number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 jsonObject.put("CheckNo", number);
			 jsonObject.put("Menu", placedMenu);
			 menuName.add(jsonObject.toString());
			 placedMenu.clear();

			 
			 	 
			 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			  
			  JavascriptExecutor js3 = (JavascriptExecutor) driver;
			  WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
			  js3.executeScript("arguments[0].scrollIntoView();", menu2);
			  menu2.click();
			  placedMenu.add(menu2.getText());
			  			        
			  JavascriptExecutor js4 = (JavascriptExecutor) driver;
			  menu2 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
			  js4.executeScript("arguments[0].scrollIntoView();", menu2);
			  menu2.click();
			  placedMenu.add(menu2.getText());

			  JavascriptExecutor js5 = (JavascriptExecutor) driver;
			  menu2 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
			  js5.executeScript("arguments[0].scrollIntoView();", menu2);
			  menu2.click();
			  placedMenu.add(menu2.getText());

			  number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  jsonObject.put("CheckNo", number);
				 jsonObject.put("Menu", placedMenu);
				 menuName.add(jsonObject.toString());
				 placedMenu.clear();

			  
			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T10 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

			  JavascriptExecutor js6 = (JavascriptExecutor) driver;
			  WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
			  js6.executeScript("arguments[0].scrollIntoView();", menu3);
			  menu3.click();
			  placedMenu.add(menu3.getText());
		        
			  JavascriptExecutor js7 = (JavascriptExecutor) driver;
			  menu3 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
			  js7.executeScript("arguments[0].scrollIntoView();", menu3);
			  menu3.click();
			  placedMenu.add(menu3.getText());
		        
			  JavascriptExecutor js8 = (JavascriptExecutor) driver;
			  menu3 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
			  js8.executeScript("arguments[0].scrollIntoView();", menu3);
			  menu3.click();
			  placedMenu.add(menu3.getText());
		  
			  number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  jsonObject.put("CheckNo", number);
				 jsonObject.put("Menu", placedMenu);
				 menuName.add(jsonObject.toString());
				 placedMenu.clear();
		        
			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			  Thread.sleep(1000);

		}
			 //System.out.println(menuName);
			 System.out.println(menuName.get(0));
			 String val = menuName.get(0);
			// val.substring("CheckNo");
		}
			/*for (int j = 0; j < 2; j++){
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			  Thread.sleep(500);

			 driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
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
			 
			 String number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 activeCheck.add(number);
			 	 
			 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			  
			  JavascriptExecutor js3 = (JavascriptExecutor) driver;
			  WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
			  js3.executeScript("arguments[0].scrollIntoView();", menu2);
			  menu2.click();
			  placedMenu.add(menu2.getText());
			  			        
			  JavascriptExecutor js4 = (JavascriptExecutor) driver;
			  menu2 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
			  js4.executeScript("arguments[0].scrollIntoView();", menu2);
			  menu2.click();
			  placedMenu.add(menu2.getText());

			  JavascriptExecutor js5 = (JavascriptExecutor) driver;
			  menu2 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
			  js5.executeScript("arguments[0].scrollIntoView();", menu2);
			  menu2.click();
			  placedMenu.add(menu2.getText());

			  number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  activeCheck.add(number);
			  
			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T10 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

			  JavascriptExecutor js6 = (JavascriptExecutor) driver;
			  WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
			  js6.executeScript("arguments[0].scrollIntoView();", menu3);
			  menu3.click();
			  placedMenu.add(menu3.getText());
		        
			  JavascriptExecutor js7 = (JavascriptExecutor) driver;
			  menu3 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
			  js7.executeScript("arguments[0].scrollIntoView();", menu3);
			  menu3.click();
			  placedMenu.add(menu3.getText());
		        
			  JavascriptExecutor js8 = (JavascriptExecutor) driver;
			  menu3 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
			  js8.executeScript("arguments[0].scrollIntoView();", menu3);
			  menu3.click();
			  placedMenu.add(menu3.getText());
		  
			  number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		      activeCheck.add(number);
		        
			  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			  Thread.sleep(1000);

		}
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

			for(int i=0; i<activeCheck.size(); i++){
				  driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				  driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
				  driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				  int item_count = driver.findElements(By.xpath(".//div[@class=\"orderlist-container  \"]")).size();
					 for(int j=1 ;j<=item_count ; j++)	{
						  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
					  menuName.add(menuitemname);
					  		  }
					
				  String activecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				  closedCheck.add(activecheckno);//(Closedcheck array used for active checks in active check status screen)
				  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();

				 			  }
			if(closedCheck.equals(activeCheck)) {
				  System.out.println("Create multiple checks with different category - Check Available - Pass");
			  }
			if(placedMenu.equals(menuName)) {
				  System.out.println("Create multiple checks with different category - item Available - Pass");
			  }
					 			}*/
		


		private static void activeAndClosed() throws InterruptedException {
			// TODO Auto-generated method stub
				for (int j = 0; j < 50; j++){
					  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

					  driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					  Thread.sleep(500);
					  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					  Thread.sleep(1000);

					  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					  Thread.sleep(500);

					  driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					  driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
					  JavascriptExecutor js = (JavascriptExecutor) driver;
					  WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
					  js.executeScript("arguments[0].scrollIntoView();", menu1);
					  menu1.click();
					  String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					  menuName.add(checkNo11);
					  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					  
					  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					  Thread.sleep(1000);
					  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

					  driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					  Thread.sleep(500);
					  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					  Thread.sleep(1000);

					  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					  Thread.sleep(500);
					  driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					  driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
					  driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

					  JavascriptExecutor js6 = (JavascriptExecutor) driver;
					  WebElement menu7 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
					  js6.executeScript("arguments[0].scrollIntoView();", menu7);
					  menu7.click();
					  String checkNo12 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					  placedMenu.add(checkNo12);
					  driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
					  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
					  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					  Thread.sleep(1000);
				}
				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				  for(int i=0; i<menuName.size(); i++){
					  driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
					  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(menuName.get(i));
					  String activecheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+menuName.get(i)+"')]")).getText();
					  activeCheck.add(activecheckno);
					  
					 			  }
				  
				  for(int i=0; i<placedMenu.size(); i++){
					  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
					  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(placedMenu.get(i));
					  Thread.sleep(8000);
					  String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+placedMenu.get(i)+"')]")).getText();
					  closedCheck.add(closedcheckno);
				  }
				  if(menuName.equals(activeCheck)&& placedMenu.equals(closedCheck)) {
					  System.out.println("All the checks available");
				  }



		}


		private static void Place_menuitem_Finish_loop() throws InterruptedException {
			// TODO Auto-generated method stub
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			for(int i = 0; i<200; i++) {
				driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				try {
			  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			  	}catch(Exception e) {
					
				}
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
		        js.executeScript("arguments[0].scrollIntoView();", menu1);
		        menu1.click();
				placedMenu.add(menu1.getText());

		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
		        js1.executeScript("arguments[0].scrollIntoView();", menu1);
		        menu1.click();
				placedMenu.add(menu1.getText());

		        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
		        js2.executeScript("arguments[0].scrollIntoView();", menu1);
		        menu1.click();
		        placedMenu.add(menu1.getText());
		        Thread.sleep(500);

		        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
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

		private static void Menumiss2G() throws InterruptedException {
			// TODO Auto-generated method stub
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
			 js.executeScript("arguments[0].scrollIntoView();", menu1);
			 menu1.click();
			 placedMenu.add(menu1.getText());
			 
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
			 js1.executeScript("arguments[0].scrollIntoView();", menu2);
			 menu2.click();
			 placedMenu.add(menu2.getText());
			 
			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
			 js2.executeScript("arguments[0].scrollIntoView();", menu3);
			 menu3.click();
			 placedMenu.add(menu3.getText());
			 
			 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			 //Thread.sleep(1000);
			 driver.findElement(By.xpath(".//button/p[text()=\"T6 \"]")).click();
			 //Thread.sleep(1000);
			 JavascriptExecutor js4 = (JavascriptExecutor) driver;
			 WebElement menu4 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
			 js.executeScript("arguments[0].scrollIntoView();", menu4);
			 menu4.click();
			 placedMenu.add(menu4.getText());
			 
			 JavascriptExecutor js5 = (JavascriptExecutor) driver;
			 WebElement menu5 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
			 js1.executeScript("arguments[0].scrollIntoView();", menu5);
			 menu5.click();
			 placedMenu.add(menu5.getText());
			 
			 JavascriptExecutor js6 = (JavascriptExecutor) driver;
			 WebElement menu6 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
			 js2.executeScript("arguments[0].scrollIntoView();", menu6);
			 menu6.click();
			 placedMenu.add(menu6.getText());
			 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			 driver.findElement(By.xpath(".//button/linga-icon[@symbol=\"sync\"]")).click();
			 Thread.sleep(200);
			 driver.findElement(By.xpath(".//button[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button/p[text()=\"T6 \"]")).click();
			// Thread.sleep(1000);
			 int item_count = driver.findElements(By.xpath(".//div[@class=\"orderlist-container  \"]")).size();
			 for(int j=1 ;j<=item_count ; j++)	{
				 String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
				 menuName.add(menuitemname);
				 
			 }
			 if(menuName.equals(placedMenu)) {
				 System.out.println("Placemenu_Finish_Placemenu_finish_syncCheck_opencheck - menu available - pass");
				 
			 }
			 else {
				 System.out.println("Placemenu_Finish_Placemenu_finish_syncCheck_Opencheck - menu available - fail");
				 
			 }
			 placedMenu.clear();
			 menuName.clear();
			 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			 		 
		}	

	}



