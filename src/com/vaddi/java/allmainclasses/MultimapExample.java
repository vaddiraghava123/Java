package com.vaddi.java.allmainclasses;

import java.util.*;  
class MultiMap<K, V>  
{  
	//creating a map of key and value (collection)  
	private Map<K, Collection<V>> map = new HashMap<>();   
	//add the specified value with the specified key in this multimap  
	public void put(K key, V value)  
	{  
		if (map.get(key) == null)   
		{  
			map.put(key, new ArrayList<V>());  
		}  
		map.get(key).add(value);
	}  
	
	//the method returns the Collection of values to which the specified key is mapped, or null if this multimap contains no mapping for the key  
	public Collection<V> get(Object key)   
	{  
		return map.get(key);  
	}  
	//the method returns a set view of the keys contained in this multimap  
	public Set<K> keySet()   
	{  
		return map.keySet();  
	}  
}  
//main class  
public class MultimapExample  
{  
	//main method  
	public static void main(String args[])  
	{  
		//Creating a multimap of type String  
		MultiMap<String, String> multimap = new MultiMap();  
		//adding values to the multimap  
		multimap.put("a", "Andrew");  
		multimap.put("b", "Albert");  
		multimap.put("b", "Tom");  
		multimap.put("d", "Sam");  
		multimap.put("d", "Reo");  
		multimap.put("g", "Jack");  
		multimap.put("g", "David");  
		System.out.println("----- Printing Multimap using keySet -----\n");  
		//loop iterate over multimap  
		for (String lastName: multimap.keySet())   
		{  
			//printing key and values  
			System.out.println(lastName + ": " + multimap.get(lastName));  
		}  
	}  
}  
