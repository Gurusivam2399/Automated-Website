package readProperties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		/*
		 * Properties properties = new Properties(); properties.load(new
		 * FileInputStream("./GscodeEng.properties")); String property =
		 * properties.getProperty("welcome"); System.out.println(property);
		 */
		
		System.getProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Properties properties = new Properties(); 
		properties.load(new java.io.FileInputStream("./Locators.properties"));
		
		driver.get("https://letcode.in/signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("email")).sendKeys(properties.getProperty("email"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("pass"));
		driver.findElement(By.xpath("(//button[@class='button is-primary'])[1]")).click();


		
	}

}
