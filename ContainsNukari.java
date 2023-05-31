package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  ContainsNukari {
	public static void main(String[] args) 
	{
	
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]")).sendKeys("ABC");
	}
}
