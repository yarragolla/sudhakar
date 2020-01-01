package dec26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		String ExpTitle = "gmail";
		String Actitle = driver.getTitle();
		if(Actitle.equalsIgnoreCase(ExpTitle)) {
			
			System.out.println("Title i Matching::"+Actitle+"   "+ExpTitle);
			
		}
		else
		{
			System.out.println("Title is not Matching::"+Actitle+"   "+ExpTitle);
			Thread.sleep(5000);
             driver.close();			
		}
		
		

	}

}
