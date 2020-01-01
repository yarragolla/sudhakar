package dec26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Url {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		String StrProtocol = "https://";
		String StrActProtocol = driver.getCurrentUrl();
		if(StrActProtocol.startsWith(StrProtocol)) {
			
			System.out.println("Title i Matching::"+StrActProtocol+"   "+StrProtocol);
			
		}
		else
		{
			System.out.println("Title is not Matching::"+StrActProtocol+"   "+StrProtocol);
			Thread.sleep(5000);
             driver.close();			
		}
	}

}
