package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Group_Elements {

	public static void main(String[] args) 
	{
		
		

		/*
		 * FindElement:--->
		 * 			FindElement is a webdriver method which helps to identify any
		 * 			single object with in webpage using ID and Name properties..
		 * 
		 * Syntax:--->
		 * 			WebElement Object=driver.findElement(By.id("propertyvalue"));
		 */
		
		/*
		 * FindElements:--->
		 * 			FindElements is a webdriver method which helps to identify group
		 * 			objects with in webpage using Tagname and classname.
		 * 
		 * 			List<WebElement> Objects=driver.findElements(By.classname("class property"));
		 * 			List<WebElement> Objects=driver.findElements(By.tagname("tagname"));
		 */
		
		
		
		//Don't execute this programm...This program is only for understanding purpose

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.sampledomain.com/");
		driver.manage().window().maximize();
		
		//Identify single element
		WebElement Element=driver.findElement(By.id("X"));
		
		//set of actions we can perform on single element
		Element.clear();
		Element.sendKeys("ABCD");
		Element.getText();
		Element.getAttribute("Attributename");
		Element.getCssValue("StyleName");
		Element.isDisplayed();
		Element.submit();
		Element.findElement(By.id("Y"));
		Element.findElements(By.className("Category"));


		//Identify Group of element
		List<WebElement> Elements=driver.findElements(By.tagName("a"));
		//Get any single element from elements using position at collection
		WebElement Single_object=Elements.get(4);
		
		Single_object.clear();
		Single_object.sendKeys("ABCD");
		Single_object.getText();
		Single_object.getAttribute("Attributename");
		Single_object.getCssValue("StyleName");
		Single_object.isDisplayed();
		Single_object.submit();
		Single_object.findElement(By.id("Y"));
		Single_object.findElements(By.className("Category"));

		
		
		
		

	}

}
