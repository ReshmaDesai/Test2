
package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode {
	public static void main(String[] args)  {
	
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("name")).sendKeys("Reshma");
        driver.findElement(By.id("email")).sendKeys("reshmadesai1309@gmail.com");
        driver.findElement(By.name("password")).sendKeys("reshma130"); 
        driver.findElement(By.id("agree")).click();
        driver.findElement(By.cssSelector("button[class='button is-primary']")).click();
        
        
		
		
		
		
	}
}
