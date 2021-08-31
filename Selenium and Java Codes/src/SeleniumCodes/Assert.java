package SeleniumCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import junit.framework.Assert;

public class Assert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
        System.out.println(driver.getTitle());
		//Assert.assertEquals("Login|Salesforce", driver.getTitle());
	}

}
