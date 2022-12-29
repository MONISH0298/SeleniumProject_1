package adactinProject;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinProject {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		

		driver.findElement(By.id("username")).sendKeys("dinesh0017");
		driver.findElement(By.id("password")).sendKeys("9080132507");
		driver.findElement(By.id("login")).click();

		WebElement location = driver.findElement(By.id("location"));
		Select s1= new Select(location);
		s1.selectByValue("London");

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2= new Select(hotels);
		s2.selectByIndex(1);

		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s3 = new Select(roomType);
		s3.selectByVisibleText("Deluxe");
		
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select s4= new Select(roomNos);
		s4.selectByIndex(2);

		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("06/11/2022");

		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("09/11/2022");
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s5= new Select(adultRoom);
		s5.selectByIndex(2);
		
		WebElement childrenRoom = driver.findElement(By.id("child_room"));
		Select s6 = new Select(childrenRoom);
		s6.selectByIndex(0);
		
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")).click();
		driver.findElement(By.name("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Monishkumar");
		driver.findElement(By.id("last_name")).sendKeys("R A");
		driver.findElement(By.id("address")).sendKeys("No1,Amman illam,8th street,Rajendra Nagar,Gingee");
		
		driver.findElement(By.id("cc_num")).sendKeys("1234567899541236");
		WebElement creditType = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(creditType);
		s7.selectByIndex(1);
		
		WebElement expiryDate = driver.findElement(By.id("cc_exp_month"));
		Select s8= new Select(expiryDate);
		s8.selectByIndex(3);
		
		WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));
		Select s9= new Select(expiryYear);
		s9.selectByIndex(5);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		Thread.sleep(3000);
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		File location1= new File("D:\\Booking1.png");
		org.openqa.selenium.io.FileHandler.copy(sourceFile, location1);



	}	
}
