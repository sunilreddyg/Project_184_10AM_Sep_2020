package junit_Framework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({My_Junit_Test.class,Before_And_After.class,Junit_WebDriver_Test.class})
public class JUnit_SuiteRunner 
{
	

}

//It execute group of junit classes..