package pages;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class masterpage {

	public  static WebDriver driver;
	public Properties prop;
	public masterpage() throws Exception {
	}
	public void initialsetup() throws Exception {
		FileInputStream ip=new FileInputStream("C:\\Users\\Venkat\\Documents\\Bonito\\src\\files\\or.properties");
		prop=new Properties();
		prop.load(ip);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkat\\Documents\\Bonito\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://trello.com/");
		
	}
	public void clickelement(String xpathkey) {
		driver.findElement(By.xpath(prop.getProperty(xpathkey))).click();
	}
	public void senddata(String xpathkey,String userdata) {
		driver.findElement(By.xpath(prop.getProperty(xpathkey))).sendKeys(userdata);
	}

	public boolean iselementexists(String xpathkey) {
		try {
			driver.findElement(By.xpath(prop.getProperty(xpathkey)));
			return true;
		}
		catch(Exception e) {
			return false;
}
	}
}
