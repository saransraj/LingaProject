package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pinpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.get("http://web.lingapos.com");
Thread.sleep(5000);
String name = driver.getTitle();
System.out.println("Title = " +name);
String page =driver.getCurrentUrl();
System.out.println("URL= " +page);
Thread.sleep(6000);
//WebElement plugin;
//plugin=driver.findElement(By.xpath(".//*[@class=\"mat-button mat-button-base\"]"));
//plugin.click();
//driver.findElement(By.xpath(".//*[@class=\"mat-button mat-button-base\"]")).click();
//Thread.sleep(3000);
//WebElement id;
//id=driver.findElement(By.id("mat-input-0"));
//id.click();
driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
//id.sendKeys("Chotu@mail.com");
//WebElement password;
//password=driver.findElement(By.id("mat-input-1"));
//password.click();
//password.sendKeys("chotu1");
driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
//WebElement login;
//login=driver.findElement(By.xpath(".//*[text()=\"Login\"]"));
//login.click();
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
Thread.sleep(500);
WebElement pops=driver.findElement(By.xpath(".//*[text()=\"Signed In Successfully\"]"));
//pops.click();
String message= pops.getText();
System.out.println(message);
//System.out.println("Successfully Login");
Thread.sleep(3000);
//WebElement sync=driver.findElement(By.xpath("(.//*[@title=\"Sync\"])[2]"));
//sync.click();
driver.findElement(By.xpath("(.//*[@title=\"Sync\"])[2]")).click();
Thread.sleep(2000);
WebElement msg=driver.findElement(By.xpath(".//*[text()=\"Synced successfully\"]"));
//msg.click();
String text= msg.getText();
System.out.println(text);
driver.findElement(By.xpath(".//*[@title=\"Devices\"]")).click();
WebElement device=driver.findElement(By.xpath(".//*[text()=\"Connected Devices\"]"));
String txt=device.getText();
System.out.println(txt);
driver.findElement(By.xpath(".//*[text()=\"Close\"]")).click();
//Clockin
driver.findElement(By.xpath(".//*[@title=\"Clock In\"]")).click();
for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
	  Thread.sleep(2000);
	  }
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
WebElement clockin = driver.findElement(By.xpath(".//*[text()=\"Clocked IN successfully\"]"));
String a=clockin.getText();
//System.out.println(a);


//Select role clock-in
driver.findElement(By.xpath(".//*[@title=\"Clock In\"]")).click();
driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
driver.findElement(By.xpath("(.//*[text()=\"2\"])[2]")).click();
driver.findElement(By.xpath("(.//*[text()=\"3\"])[2]")).click();
driver.findElement(By.xpath("(.//*[text()=\"4\"])[2]")).click();
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[text()=\"Admin\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Ok\"]")).click();
WebElement multiclockin = driver.findElement(By.xpath(".//*[text()=\"Clocked IN successfully\"]"));
String multicin=multiclockin.getText();
//System.out.println("Multirole=" +multicin);
//Already Clock in
driver.findElement(By.xpath(".//*[@title=\"Clock In\"]")).click();
for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
	  Thread.sleep(2000);
	  }
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
WebElement alreadycin = driver.findElement(By.xpath(".//*[text()=\"You Already Clocked In\"]"));
String alrdycin=alreadycin.getText();
//System.out.println("already clocked in="+alrdycin);
//Invalid pin-clock in
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@title=\"Clock In\"]")).click();
driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
WebElement invalidcin = driver.findElement(By.xpath(".//*[text()=\"Enter valid pin\"]"));
String invldcin=invalidcin.getText();
//System.out.println("invalid pin in clock in=" +invldcin);
driver.findElement(By.xpath(".//*[@symbol=\"close-button\"]")).click();
Thread.sleep(5000);
if(a.equals("Clocked IN successfully") && multicin.equals("Clocked IN successfully") && alrdycin.equals("You Already Clocked In") && invldcin.equals("Enter valid pin")) {
	System.out.println("Clock In validation successful");
		}
	else 
	{
		System.out.println("Clock In Validation fails");}
	

//Clock out
driver.findElement(By.xpath(".//*[@title=\"Clock Out\"]")).click();
for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
	  Thread.sleep(2000);
	  }
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
WebElement clockout = driver.findElement(By.xpath(".//*[text()=\"Clocked OUT successfully\"]"));
String b=clockout.getText();
//System.out.println(b);
//Multiple role-clock out
driver.findElement(By.xpath(".//*[@title=\"Clock Out\"]")).click();
driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
driver.findElement(By.xpath("(.//*[text()=\"2\"])[2]")).click();
driver.findElement(By.xpath("(.//*[text()=\"3\"])[2]")).click();
driver.findElement(By.xpath("(.//*[text()=\"4\"])[2]")).click();
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
WebElement multipleclockout = driver.findElement(By.xpath(".//*[text()=\"Clocked OUT successfully\"]"));
String multicout=multipleclockout.getText();
//System.out.println("Multirole=" +multicout);
//you already clocked out
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@title=\"Clock Out\"]")).click();
for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
	  Thread.sleep(2000);
	  }
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
WebElement alreadycout = driver.findElement(By.xpath(".//*[text()=\"You Already Clocked Out\"]"));
String alrdycout=alreadycout.getText();
//System.out.println("Already clock out=" +alrdycout);
//Invalid pin-clock out
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@title=\"Clock Out\"]")).click();
driver.findElement(By.xpath("(.//*[text()=\"2\"])[2]")).click();
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
WebElement invalidcout = driver.findElement(By.xpath(".//*[text()=\"Enter valid pin\"]"));
String invldcout=invalidcout.getText();
//System.out.println("Invalid pin in clock out=" +invldcout);
driver.findElement(By.xpath(".//*[@symbol=\"close-button\"]")).click();
Thread.sleep(3000);
if(b.equals("Clocked OUT successfully") && multicout.equals("Clocked OUT successfully") && alrdycout.equals("You Already Clocked Out") && invldcout.equals("Enter valid pin")) {
	System.out.println("Clock Out Validation successful");
		}
	else 
	{
		System.out.println("Clock Out Validation fails");}
	


Thread.sleep(3000);
//sync with BO
driver.findElement(By.xpath(".//*[@title=\"Back Office\"]")).click();
Thread.sleep(3000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(5000);
String bo =driver.getCurrentUrl();
System.out.println("Back Office URL= " +bo);
driver.close();
driver.switchTo().window(tabs2.get(0));
//Operation
driver.findElement(By.xpath(".//*[@title=\"Operation\"]")).click();
for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
	  Thread.sleep(2000);
	  }
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Sync Back Office\"]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath(".//*[@classname=\"logoff\"]")).click();
//operation invalid pin
driver.findElement(By.xpath(".//*[@title=\"Operation\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
WebElement invalidoperation = driver.findElement(By.xpath(".//*[text()=\"Enter valid pin\"]"));
String invldopr=invalidoperation.getText();
//System.out.println("Opeartion invalid pin =" +invldopr);
driver.findElement(By.xpath(".//*[@symbol=\"close-button\"]")).click();
Thread.sleep(3000);
if(invldopr.equals("Enter valid pin")) {
	System.out.println("Operation pin validation successful");
		}
	else 
	{
		System.out.println("Operation pin validation fails");}


//Sync-Checks
driver.findElement(By.xpath(".//*[@title=\"Sync Checks\"]")).click();
Thread.sleep(3000);
//Signout
driver.findElement(By.xpath(".//*[@title=\"Sign Out\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Yes\"]")).click();
for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath("(.//*[text()=\"1\"])[2]")).click();
	  Thread.sleep(2000);
	  }
driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
Thread.sleep(5000);
driver.findElement(By.id("mat-input-4")).sendKeys("shivam@mail.com");
driver.findElement(By.id("mat-input-5")).sendKeys("shivam1");
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
//Pin validation
//Invalid pin
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
WebElement invalidlogin = driver.findElement(By.xpath(".//*[text()=\"Enter valid pin\"]"));
String invldlogin=invalidlogin.getText();
//System.out.println("Invalid login=" +invldlogin);

//Access denied
driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"3\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"4\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Cashier\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Ok\"]")).click();
Thread.sleep(500);
WebElement Access = driver.findElement(By.xpath(".//*[text()=\"Access denied\"]"));
String denied=Access.getText();
//System.out.println("Restricted user=" +denied);
//Clear
for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
	  Thread.sleep(2000);
	  }
driver.findElement(By.xpath(".//*[text()=\"Clear\"]")).click();

//Clockin required
for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
	  Thread.sleep(2000);
	  }
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
WebElement clkin = driver.findElement(By.xpath(".//*[text()=\"Clock in is required to log in\"]"));
String required=clkin.getText();
//System.out.println("Clock in required user=" +required);

//login
driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"3\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"4\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Admin\"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Ok\"]")).click();

if(invldlogin.equals("Enter valid pin") && denied.equals("Access denied") && required.equals("Clock in is required to log in")) {
	System.out.println("Pin validation successful");
		}
	else 
	{
		System.out.println("Pin validation fails");}


	}

}

