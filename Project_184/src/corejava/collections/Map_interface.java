package corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_interface {

	public static void main(String[] args) 
	{
		
		/*
		 * => Map cannot contain duplicate objects
		 * => Map store data using key and value..
		 */
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(123, "Pen");
		map.put(126, "Soap");
		map.put(127, "orange");
		map.put(128, "banana");
		
		
		//Get Any value by using keyname
		String obj=map.get(127);
		System.out.println("Name of object is --> "+obj);
		
		
		
		for (Entry<Integer, String> e : map.entrySet()) 
		{
			Integer item_Code=e.getKey();
			String item_name=e.getValue();
			
			System.out.println(item_Code+"   "+item_name);
		}
		
	
		
		//Using keyset read values
		for (Integer keys : map.keySet()) 
		{
			System.err.println(map.get(keys));
		}
		
		
		

	}

}
