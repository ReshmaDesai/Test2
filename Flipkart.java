package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
	
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Mobiles & Tablets']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("img[alt='Fashion']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("img[alt='Grocery']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("img[alt='Electronics']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("img[alt='TVs & Appliances']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("img[alt='Beauty']")).click();
		Thread.sleep(2000);	
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("img[alt='Home & Furniture']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("img[alt='Flights']")).click();
		Thread.sleep(2000);	
		driver.navigate().back();
		Thread.sleep(2000);	
}
}