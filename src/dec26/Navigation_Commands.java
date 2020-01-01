package dec26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://google.com");
driver.manage().window().maximize();
Thread.sleep(5000);
System.out.println("Page Title[1]::"+driver.getTitle());
driver.findElement(By.partialLinkText("Gm")).click();
System.out.println("Page Title[2]::"+driver.getTitle());
Thread.sleep(5000);
driver.navigate().back();
System.out.println("Page Title[3]::"+driver.getTitle());
Thread.sleep(5000);
driver.navigate().forward();
System.out.println("Page Title[4]::"+driver.getTitle());
Thread.sleep(5000);
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.close();



	}

}
