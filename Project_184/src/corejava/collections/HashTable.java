package corejava.collections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) 
	{
		
		Hashtable<Integer,String> ht1=new Hashtable<>(4);
		ht1.put(1,"sunil");
		ht1.put(2,"Anil");
		ht1.put(3,"Raju");
		ht1.put(4,"Aakash");
		
		System.out.println(ht1);
		
		//Get Any value using keyname
		String value=ht1.get(4);
		System.out.println(value);
		
		
		//Read only values
		for (String eachvalue : ht1.values()) {
			System.out.println(eachvalue);
		}
		
		
		//Read only values
		for (Integer eachkey : ht1.keySet()) 
		{
			System.out.println(eachkey);
		}
				
		

	}

}
