package SeleniumCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		System.out.println("no of rows:"+allrows.size());
		int i=0;
		for(WebElement element: allrows) 
		{
			List<WebElement> eachcoloumn = element.findElements(By.tagName("td"));
			i++;
			System.out.println("no of coloumn in "+i+"row are:"+eachcoloumn.size());
			for(WebElement coloumn:eachcoloumn) 
			{
				System.out.print("|"+coloumn.getText());
				
			}
			System.out.println("");
		}
		
	}

}
