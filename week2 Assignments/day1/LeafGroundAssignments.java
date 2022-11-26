package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignments {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//get the url
		driver.get("https://leafground.com/input.xhtml");
		
		//maximize the window
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("Babu Manickam");
		
		//Append a text
	    driver.findElement(By.xpath("//input[@id = 'j_idt88:j_idt91']")).sendKeys("TamilNadu");
	    //TextBox is Enabled or Disabled
	    boolean text = driver.findElement(By.xpath("//div[@class = 'grid formgrid']/div")).isEnabled();
	    System.out.println(text);
	    
	    //Clear the Text
	    driver.findElement(By.xpath("//input[@id = 'j_idt88:j_idt95']")).clear();
	    //Retrieve the Typed text
	    String textget = driver.findElement(By.xpath("//input[@id = 'j_idt88:j_idt97']")).getAttribute("value");
	    System.out.println(textget);
	    WebElement tab = driver.findElement(By.xpath("//input[@id = 'j_idt88:j_idt99']"));
	    tab.sendKeys(Keys.TAB);
	    driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am Hema. Learning Selenium in TestLeaf. I have 5 years Experience in IT Industry");
	    driver.findElement(By.xpath("//input[@id = 'j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//input[@id = 'j_idt106:float-input']")).click();
	   // driver.findElement(By.xpath("//div[@id = 'j_idt106:auto-complete']/ul class")).sendKeys("Hema");
	    driver.findElement(By.xpath("//span[@id = 'j_idt106:j_idt116']/button")).click();
	    driver.findElement(By.className("ui-datepicker-title")).click();
	    WebElement spinfield = driver.findElement(By.xpath("//input[@id = 'j_idt106:j_idt118_input']"));
	    spinfield.sendKeys("5");
	    
	    
	    
	    //driver.close();
	    
	    
	    
	    
		
				

	}

}
