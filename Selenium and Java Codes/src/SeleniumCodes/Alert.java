package SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[4]/form[1]/input[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		String alerttxt;
		alerttxt=driver.switchTo().alert().getText();
		System.out.println(alerttxt);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("End of code");
		driver.close();
	}

}
