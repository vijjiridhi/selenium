package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJETHA\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xpath",Keys.ENTER);
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[6]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div")).click();
//		Thread.sleep(5000);
	  driver.close();
	

	}

}
