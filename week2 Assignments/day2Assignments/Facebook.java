package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		//set the chrome driver
		WebDriverManager.chromedriver().setup();
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the Facebook url
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click CreateNewAccount button
		driver.findElement(By.xpath("//div[@class = '_6ltg']/a")).click();
		driver.findElement(By.xpath("//div[@class = '_5dbb']/input")).sendKeys("Hema");
		driver.findElement(By.xpath("//div[@class = 'uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input")).sendKeys("Ramakrishnan");
		driver.findElement(By.xpath("//div[@class = 'uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input")).sendKeys("9345099175");
		driver.findElement(By.xpath("//input[@id = 'password_step_input']")).sendKeys("Hemaramit@95");
		WebElement day = driver.findElement(By.id("day"));
		Select d1 = new Select(day);
		d1.selectByValue("8");
		WebElement month = driver.findElement(By.id("month"));
		Select d2 = new Select(month);
		d2.selectByVisibleText("Dec");
		WebElement year = driver.findElement(By.id("year"));
		Select d3 = new Select(year);
		d3.selectByValue("1995");
		driver.findElement(By.xpath("//span[@class = '_5k_2 _5dba']/label")).click();
		
		
		
		
		
		

	}

}
