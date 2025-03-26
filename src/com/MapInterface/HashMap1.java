package com.MapInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class HashMap1 {

	private static final Object Integer = null;
	private static final boolean String = false;

	public static void main(String[] args) {
//		HashMap <Integer,String>map = new HashMap<Integer,String>();
//		map.put(1,"Fruits");
//		map.put(2,"Vegetables");
//		map.put(3,"Groceries");
//		map.put(4,"Medicine");
//		map.put(5,"Kitchenery");
//		map.put(6,"Household");
//		
//		System.out.println(map);
//		
//		Set<Integer> set =map.keySet(); // it can iterate only key
//		
//		for(Integer k : set)
//		{
//			System.out.println(k);
//		}
		
//		Set<Map.Entry<Integer, String>> set =map.entrySet(); //Map.Entry use to Iterate Map by taking entry eg.(1,Fruits)
//		
//		for(Map.Entry<Integer, String> m : set)
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}

		
//		Set<Map.Entry<Integer, String>> set =map.entrySet();
//		
//		Iterator<Map.Entry<Integer,String>> itr = set.iterator();
//		
//		while(itr.hasNext())
//		{
//			Map.Entry<Integer, String> m =itr.next();
//			
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		
		
		HashMap<String,Integer> map2 = new HashMap<String,Integer>();
		
		map2.put("Pune",411002);
		map2.put("Gangtok",737101);
		map2.put("Hinjewadi",411057);
		map2.put("Nanded City",431804);
		map2.put("Wardha",442001);
		
		System.out.println(map2);
		
		map2.putIfAbsent("satara",456732);
		
		System.out.println(map2);
		
		map2.remove("Gangtok");
		
		System.out.println(map2);
		
		map2.remove(456723);
		System.out.println(map2);
		
		
		map2.replace("satara", 456723);
		System.out.println(map2);
		
		
//		HashMap map3 = new HashMap();
//		
//		map3.put("Pune",411002);
//		map3.put("Gangtok",737101);
//		map3.put("Hinjewadi",411057);
//		map3.put("Nanded City",431804);
//		map3.put("Wardha",442001);
//		
//		map.putAll(map3);
//		System.out.println(map);
	}

}
