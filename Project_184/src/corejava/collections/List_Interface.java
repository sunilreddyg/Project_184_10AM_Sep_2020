package corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * => list store collection of objects inorder
		 * => list accept duplicate objects to store
		 */
		
		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("two");
		
		//Collect Object count
		int Count=list.size();
		System.out.println("Object Count is ---> "+Count);
		
		
		//Get Any object using Index number [This feature only availble in list interface]
		String object=list.get(3);
		System.out.println("3rd index object is ---> "+object);

		//Remove Object from collection
		list.remove("three");
		
		//Verify Object contains at collection
		boolean flag=list.contains("four");
		System.out.println("Object available status is --> "+flag);
		
		//Get Next Iterator value
		String itr=list.iterator().next();
		System.out.println("Next Iterator value is --> "+itr);
		
		//Verify Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection empty status is --> "+flag1);
		
		//read all objects from list
		for (String eachobj : list) 
		{
			System.out.println(eachobj);
		}
		
		
		//Using for loop read list of objects [we can read using for lop in set interface]
		for (int i = 0; i < list.size(); i++) 
		{
			String obj=list.get(i);
			System.out.println("=> "+obj);
		}
		
		
		
		//Read Collection of set objects using while loop..
		Iterator<String> itrerators=list.iterator();
		while(itrerators.hasNext())
		{
			String obj=itrerators.next();
			System.out.println("# "+obj);
		}
		
		
		
		
	}

}
