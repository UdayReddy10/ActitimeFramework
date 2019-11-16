package pac;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaptureInventryCount {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com");

		//get Current System date
		Date date = new Date();
		String dateData = date.toString();
		 String[] arr = dateData.split(" ");
		 
        int day = date.getDate();
        String year = arr[5];
        int month = date.getMonth();
        

        //Click on Calender Icon
        driver.findElement(By.id("DepartDate")).click();
        
       //Click on todat date
        String x = "//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+day+"']";
        driver.findElement(By.xpath(x)).click();
		
	}
	
	

}
