package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJETHA\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("hyr",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.close();
	

	}

}
