package datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_from_Repository_Files {

	public static void main(String[] args) throws Exception 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("src\\datadriven\\PropertyFiles\\Input.properties");
		System.out.println("File located");
		
		//Create object for Property files
		Properties repository=new Properties();
		//load testdata file into repository
		repository.load(fi);
		
		
		//Get Repository value using Keyname
		String App_url=repository.getProperty("url");
		System.out.println(App_url);
		
		String UID=repository.getProperty("username");
		String PWD=repository.getProperty("password");
		String CDK=repository.getProperty("chrome_driver_key");
		String CDP=repository.getProperty("chrome_driver_path");
		System.out.println(CDP);
		
		
		
		System.setProperty(CDK, CDP);
		WebDriver driver=new ChromeDriver();
		driver.get(App_url);
		driver.manage().window().maximize();
		
		
		//Adding Output To Property files
		repository.setProperty("Result","title loaded for page");
		
		FileOutputStream fo=new FileOutputStream("src\\datadriven\\PropertyFiles\\Output.properties");
		repository.store(fo, "TestResults");
		
		
		
		
	}

}
