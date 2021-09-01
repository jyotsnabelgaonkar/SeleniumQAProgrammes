package SeleniumCodes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	static WebDriver driver;
	 
	 public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","D:\\Java jars TQ\\Chromedriver\\chromedriver.exe");	
	     driver=new ChromeDriver();
	     driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
	     driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.findElement(By.id("datepicker")).click();
	     
	     WebElement yymm=driver.findElement(By.cssSelector(".ui-datepicker-title"));
	     System.out.println("YYMM is :"+yymm.getText());
	     
	     selectDateIncalendar("22/02/2021");
	     
	     
	 }
	 public static void selectDateIncalendar(String date) throws InterruptedException {
		 Date currentDate=new Date();
		 SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		 try {
			 Date expectedDate=dateFormat.parse(date);
			 String day=new SimpleDateFormat("dd").format(expectedDate);
			 String month=new SimpleDateFormat("MMMM").format(expectedDate);
			 String year=new SimpleDateFormat("yyyy").format(expectedDate);
			 String expectedMonthYear=month+ " " +year;
			 while(true)
			 {
				 String displayDate=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
				 if(expectedMonthYear.equals(displayDate))
				 {
					 driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
					 break;
					
				 }else if(expectedDate.compareTo(currentDate)>0){
					driver.findElement(By.xpath("//span[text()='Next']")).click();
					
				 }else {
					 driver.findElement(By.xpath("//span[text()='Prev']")).click();
					 Thread.sleep(1000);
				 }
			 }
			 
		 }
		 catch(ParseException e) {
			 e.printStackTrace();
		 }
	 }
}
