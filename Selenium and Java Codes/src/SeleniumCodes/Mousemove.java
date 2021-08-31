package SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemove {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[1]"));
		act.moveToElement(move).build().perform();
		Thread.sleep(2000);
		WebElement txtbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		act.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		Thread.sleep(2000);
		act.moveToElement(txtbox).doubleClick().build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
