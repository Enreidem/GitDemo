package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
		     WebDriver driver= new ChromeDriver(); 
		    driver.get("http://google.com");
		    
		    //the name of the folder is sea

	}

}
