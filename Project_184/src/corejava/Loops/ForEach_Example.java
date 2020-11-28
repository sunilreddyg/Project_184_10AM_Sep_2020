package corejava.Loops;

public class ForEach_Example {

	public static void main(String[] args) 
	{
		/*
		 * Foreach loop is designed to read array and colletion values.
		 */
		
		int num[]= {100,200,300,400,500,600};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		String colors[]= {"red","green","blue","white","yello"};
		for (String each_color : colors) 
		{
			System.out.println(each_color);
		}
		
	}

}
