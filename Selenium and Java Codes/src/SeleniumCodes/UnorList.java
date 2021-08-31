package SeleniumCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		WebElement fte= driver.findElement(By.xpath("//ul[@id='menu-footer-menu']"));
		List<WebElement> all_elements =fte.findElements(By.tagName("a"));

		for(WebElement element:all_elements)
			System.out.println(element.getText());
		driver.close();
	}

}
