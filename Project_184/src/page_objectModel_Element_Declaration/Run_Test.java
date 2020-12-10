package page_objectModel_Element_Declaration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Test {

	public static void main(String[] args) {
		
		
		//Browser Initation
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Element_Declaration obj=new Element_Declaration(driver);
		obj.Email_EB.sendKeys("Hello");
		System.out.println(obj.page_links.size());
		
		
		int Obj_count=obj.Get_Group_Objects().size();
		System.out.println("Group objects available--> "+Obj_count);
		System.out.println("group objects available is --> "+obj.Bys_Group_Objects.size());

	}

}
