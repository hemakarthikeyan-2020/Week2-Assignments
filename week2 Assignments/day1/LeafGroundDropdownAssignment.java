package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdownAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Get the url
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01q202c2h22u3kfhtmsm5afnw1420934.node0");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		Select testleaf = new Select(element);
		testleaf.selectByVisibleText("Selenium");
		//Get the Selected option  
		WebElement option = testleaf.getFirstSelectedOption();
		String selectedoption = option.getText();
		System.out.println("The Selected Element is: " +selectedoption);
		//WebElement countrydropdown = driver.findElement(By.xpath("//div[@class = 'ui-helper-hidden-accessible']/label"));
		//Select dd = new Select(countrydropdown);
		//dd.selectByIndex(2);
		//WebElement city = driver.findElement(By.id("j_idt87:city_label"));
		//Select dd = new Select (city);
		//dd.selectByVisibleText("Select City");
		
		WebElement course = driver.findElement(By.xpath("//div[@id = 'j_idt87:auto-complete']"));
		Select dd = new Select(course);
		dd.deselectByVisibleText("Appium");
		
		
		
	    
	
		
		

	}

}
