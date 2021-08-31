package SeleniumCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LatestNewsrediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		WebElement footer=driver.findElement(By.xpath("//body/div[@id='red_container_main']/div[31]"));
		List<WebElement> allrow=footer.findElements(By.tagName("h2"));
		for(WebElement ele:allrow)
		{
			System.out.println(" "+ele.getText());
		}
	}

}
