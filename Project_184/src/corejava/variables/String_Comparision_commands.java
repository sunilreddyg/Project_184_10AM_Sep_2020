package corejava.variables;

public class String_Comparision_commands 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * String:--> 
		 * 			String is not only a primitive datatype and also called as
		 * 			Class. Because string contain set of events to validate
		 * 			stored characters.
		 */
		
		
		
		/*
		 * Equals:--> Method verify equal comparision between two strings and return
		 * 			  boolean value true/false.
		 * 			  Equal comparision is casesensitive..
		 */
		String Act_res="Account Created";
		String Exp_res="account created";
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal comparision is ---> "+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 				Method verify equalignorecase comparision between two string
		 * 				by ignoring casesensitive.
		 */
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("EqualIgnore case comparision is ---> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 			Method verify substring available at mainString.
		 * 			and return boolean value true/false
		 */
		String Status="Account 100 created successfull";
		boolean flag2=Status.contains("100");
		System.out.println("Sub available status is ---> "+flag2);
		
		
		/*
		 * SubString:-->
		 * 		   Method get subString characters from mainString using
		 * 		   Start and End index number.
		 */
		String Account_num="1012345678987634";
		String Last_Dig=Account_num.substring(10);
		System.out.println("Last digit numbers are --> "+Last_Dig);
		
		String Middle_digits=Account_num.substring(6, 10);
		System.out.println("Middle digits are --> "+Middle_digits);
		
		
		
		/*
		 * length:-->
		 * 		Method return number of characters available at string and return
		 * 		value in integer format.
		 */
		String Mobile_num="9030248855";
		int length=Mobile_num.length();
		System.out.println("Mobile number available in characters is --> "+length);
		
		if(length == 10)
		{
			System.out.println("Valid mobile number");
		}
		else
		{
			System.out.println("invalid mobilenumber");
		}
		
		
		/*
		 * trim:-->
		 * 			Method trim extra characters and return value
		 * 			into String.
		 */
		String zipcode="     500035      ";
		System.out.println("Length of zipcode is ---> "+zipcode.length());
		String New_zipcode=zipcode.trim();
		System.out.println("Length of zipcode is ---> "+New_zipcode.length());
		
		
		
		/*
		 * toUppercase:-->
		 * 			Method convert all lowercase characters into uppercase.
		 */
		String PostalCode="adfed";
		String Ucase=PostalCode.toUpperCase();
		System.out.println("characters in uppercase is --> "+ Ucase);
		
		/*
		 * toLowsercase:-->
		 * 			Method convert all Uppercase characters into Lowercase.
		 */
		String Digital_Code="SDXER";
		String Lcase=Digital_Code.toLowerCase();
		System.out.println("characters in Lowercase is --> "+ Lcase);
		
		
		
		/*
		 * Startswith:-->
		 * 			Method verify given string starts with expected characters
		 * 			and return boolean value.
		 */
		String IFSC_Code="HDFC00001234";
		boolean flag3=IFSC_Code.startsWith("HDFC");
		System.out.println("Starts with status is --> "+flag3);
		
		
		/*
		 * Endswith:-->
		 * 			Method verify given string Ends with expected characters
		 * 			and return boolean value.
		 */
		
		String RDS_Code="HDFC00001234";
		boolean flag4=RDS_Code.endsWith("1234");
		System.out.println("Ends with status is --> "+flag4);
		
		
		/*
		 * isEmpty:-->
		 * 			Method verity String empty status and return boolean value
		 */
		String var1="";
		String var2="Hello";
		
		System.out.println("var1 value empty status is --> "+var1.isEmpty());
		System.out.println("var2 value empty status is --> "+var2.isEmpty());
		
		
		/*
		 * split:-->
		 * 			Method verify split using any delimeter and store
		 * 			value into array..
		 */
		String names="sunil,ramana,gopal,swapna";
		String[] arr=names.split(",");
		System.out.println(arr[0]+"    "+arr[1]+"     "+arr[2]+"     "+arr[3]);
	}

}
