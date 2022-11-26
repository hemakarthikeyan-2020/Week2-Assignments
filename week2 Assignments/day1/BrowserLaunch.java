package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		//setup the chromebrowser driver
		
		WebDriverManager.chromedriver().setup();
		 
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//get the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HemaTech");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Conference");
		//driver.findElement(By.className("smallSubmit")).click();
		//String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		//if(text.equals("Hema")) {
			//System.out.println("Firstname is Correct");
		//}else {
			//System.out.println("Firstname is incorrect");
		//}
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hemalatha");
		driver.findElement(By.name("description")).sendKeys("Hello! We are Selenium November Batch");
		driver.findElement(By.name("departmentName")).sendKeys("SeleniumDepartment");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hema@testleaf.do");
		WebElement element1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(element1);
		dropdown1.selectByVisibleText("Alaska");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Title is: " +driver.getTitle());
		

	}

}
