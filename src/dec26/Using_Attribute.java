package dec26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Attribute {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String LinkUrl = driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println(LinkUrl);
		driver.close();
	}

}
