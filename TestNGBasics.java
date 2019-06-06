package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	WebDriver fb;
	//Pre condition annotations--start with @before
	@BeforeSuite
	public void setUp() {
		System.out.println("system property for chrome");
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
	
	@BeforeClass	
	public void LaunchBrowser(){
		
		//System.out.println("@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.");
		System.out.println("Launch chrome browser");
		fb= new ChromeDriver();
		fb.manage().window().maximize();
		//Alert alt=fb.switchTo().alert();
		
	}
	@BeforeMethod
	public void enterurl() throws Throwable {
		//System.out.println("@BeforeMethod: The annotated method will be run before each test method.");
		System.out.println("enter url:");
		
		 fb.get("https://accounts.google.com");
		 System.out.println(fb.getCurrentUrl());
//		 fb.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("shivdarshanmasal");
//			fb.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]")).click();
//			Thread.sleep(2000);
//			fb.findElement(By.xpath("//input[@jsname=\"YPqjbf\" and @type=\"password\"]")).sendKeys("Shiv%2019"); 
//			fb.findElement(By.xpath("//span[text()='Next']")).click();
		 TakesScreenshot tk=(TakesScreenshot) fb;
		 File src=tk.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./Screen_shot/Gmail_Login.png");
		 FileHandler.copy(src,dest);
	}
	@Test
	public void googleTitletest() {
		System.out.println("google title test:");
		String s="Sign in-Google accounts";
		String r=fb.getTitle();
		System.out.println(s.compareTo(r));
	}
	
	
	@Test(priority = 1,invocationCount = 1)
	public void login() throws Throwable{
		System.out.println("login in app");
		
		fb.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("shivdarshanmasal");
	    fb.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]")).click();
	    Thread.sleep(2000);
	    TakesScreenshot tke=(TakesScreenshot) fb;
		 File src_email=tke.getScreenshotAs(OutputType.FILE);
		 File dest_email=new File("./Screen_shot/Gmail_Login_mail.png");
		 FileHandler.copy(src_email,dest_email);
		fb.findElement(By.xpath("//input[@jsname=\"YPqjbf\" and @type=\"password\"]")).sendKeys("Shiv%2019"); 
		fb.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		TakesScreenshot tkp=(TakesScreenshot) fb;
		 File src_pass=tkp.getScreenshotAs(OutputType.FILE);
		 File dest_pass=new File("./Screen_shot/Gmail_Login_pas.png");
		 FileHandler.copy(src_pass,dest_pass);
//		fb.findElement(By.xpath("//div[@class=\"TnvOCe k6Zj8d\" and@data-sendmethod=\"SMS\" ]")).click();
//		Thread.sleep(10000);
//		fb.findElement(By.xpath("//input[@type=\"tel\" ]")).sendKeys("963295");
//		Thread.sleep(1000);
//		fb.findElement(By.xpath("//span[contains(.,'Next')]")).click();
//		fb.findElement(By.xpath("//div[@jsname=\"UjXomb\"]")).click();
//		Thread.sleep(1000);
		//TakesScreenshot tk=(TakesScreenshot) fb;
		// File src_email=tk.getScreenshotAs(OutputType.FILE);
		// File dest_email=new File("./Screen_shot/Gmail_Login.png");
		// FileHandler.copy(src_email,dest_email);
	}
	//Test cases--start with @Test
	
	//Post condition annotations--start with @before
	/*@AfterMethod*/
	 @Test
	public void logout() throws IOException, Throwable {
		//System.out.println("@AfterMethod: The annotated method will be run after each test method.");
		 fb.fb.findElement(By.xpath("//span[@class='gb_xa gbii']")).click();
		
		fb.findElement(By.xpath("//a[@id=\"gb_71\"]")).click();////a[@id="gb_71"]
		//fb.findElement(By.xpath("//a[@id=\"gb_71\"]")).click()
		System.out.println("logout from app");
		Thread.sleep(3000);
		TakesScreenshot tkl=(TakesScreenshot) fb;
		 File src_lo=tkl.getScreenshotAs(OutputType.FILE);
		 File dest_lo=new File("./Screen_shot/Gmail_Logout.png");
		 FileHandler.copy(src_lo,dest_lo);
		
	}
	
	@Test
	public void deleteallcokies() {
		fb.manage().deleteAllCookies();
		System.out.println("Delete all cokies");
	}
	
	@AfterClass
	public void closeBrowser() {
		fb.close();
		System.out.println("close browser");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("quite sucessfully");
		
		System.out.println(" ");
		fb.quit();
	}
}
  