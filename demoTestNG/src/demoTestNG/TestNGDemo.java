package demoTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {
	
		
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\anbhu\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
	WebDriver dr;
	String url="https://parabank.parasoft.com/parabank/admin.htm";
	
	@Test
	void TC1_LoginPage() {
		System.setProperty(key,value);
		dr=new ChromeDriver();
		dr.get(url);
		dr.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("test");
		dr.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test");
		dr.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	}
	void TC2_BusienssProcess() {
		
	}
	void TC3_LogOut() {
		
	}
	
}
