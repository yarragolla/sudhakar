package dec26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_GetText {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String Linktext= driver.findElement(By.partialLinkText("Gm")).getText();
		String ExpText="gmail";
		if(Linktext.equalsIgnoreCase(ExpText)) {
			
			System.out.println("Link Text is Matching ::"+Linktext+"   "+ExpText);
			
		}
		else
		{
			System.out.println("Link Text is not Matching ::"+Linktext+"   "+ExpText);
			
		}
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
