package page_objectModel_Element_Declaration;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Element_Declaration
{
	
	WebDriver driver;
	
	public Element_Declaration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@Findby method look for object at webpage [This object only access using pagefactory class]
	@FindBy(id="email") WebElement Email_EB;
	
	//@FindBy also look for group of objects at webpage
	@FindBy(tagName="a") List<WebElement> page_links;
	
	
	
	/*
	 * Once object is located and it will not be sarched over and over again
	 * 		[Mostly it is usefull in ajax web application]
	 */
	@FindBy(name="pass") @CacheLookup WebElement Password_EB;
	
	
	/*
	 * @FindBYS:
	 * When Required webelement objects need to match all of the given criteria..
	 */
	@FindBys
	({
		@FindBy(tagName="select"),    
		@FindBy(tagName="input"),
		@FindBy(className="_4jy0 "),
	}) List<WebElement> Bys_Group_Objects;
	
	
	
	
	/*
	 * @FindAll:-->
	 *  When required webelement objects need to match at leas one of the give criteria
	 */
	
	@FindAll
	({
		@FindBy(tagName="select"),    
		@FindBy(tagName="input"),
		@FindBy(className="_4jy0 "),
	}) List<WebElement> Group_objects;
	
	
	
	public List<WebElement> Get_Group_Objects()
	{
		return Group_objects;
		
	}

}
