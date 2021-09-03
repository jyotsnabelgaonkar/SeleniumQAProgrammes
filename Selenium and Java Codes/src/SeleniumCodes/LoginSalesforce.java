package SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesforce {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Jyo");
	Thread.sleep(2000);
	
	driver.findElement(By.name("UserLastName")).sendKeys("Belgaonkar");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("jyo@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Zensar");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("0123456789");
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Contact")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("rights")).click();
	Thread.sleep(3000);
	
	
	driver.close();
}
}