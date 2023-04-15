package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handlingallerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJETHA\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		Thread.sleep(1000);
		 driver.findElement(By.linkText("CONTINUE")).click();
		 Thread.sleep(3000);
		 Alert myAlert=driver.switchTo().alert();
         Thread.sleep(3000);
		 myAlert.accept();
		 driver.close();
   
		
		
        
        

	}
}
