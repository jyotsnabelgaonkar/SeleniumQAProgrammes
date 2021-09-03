package SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAmazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		//driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8766830803");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();	
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("infotechnology");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		/*
		
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
		*/
	}
	
}
