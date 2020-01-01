package dec26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicsCRMLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://abscop.crm8.dynamics.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("yarragolla@abscop.onmicrosoft.com");
driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("Saibaba@999");
driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	}

}
