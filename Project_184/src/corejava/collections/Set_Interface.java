package corejava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface 
{

	public static void main(String[] args) 
	{
		
		/*
		 * => Set is a unoder collection of objects
		 * => Set doesn't allow duplicate objects to store.
		 */
		
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("two");
		
		//Collect Object count
		int Count=set.size();
		System.out.println("Object Count is ---> "+Count);
		
		//Remove Object from collection
		set.remove("three");
		
		//Verify Object contains at collection
		boolean flag=set.contains("four");
		System.out.println("Object available status is --> "+flag);
		
		//Get Next Iterator value
		String itr=set.iterator().next();
		System.out.println("Next Iterator value is --> "+itr);
		
		//Verify Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection empty status is --> "+flag1);
		
		
		//Read all objects from set interace
		for (String eachobj : set) 
		{
			System.out.println(eachobj);
		}
		
		
		//Read Collection of set objects using while loop..
		Iterator<String> itrerators=set.iterator();
		while(itrerators.hasNext())
		{
			String obj=itrerators.next();
			System.out.println("# "+obj);
		}
		
	}

}
