package com.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap hashMap = new LinkedHashMap();
		hashMap.put("Madhan", 100);
		hashMap.put("Chiluka", 101);
		hashMap.put("Java", 104);
		hashMap.put("Software", 108);
		hashMap.put("Developer", 150);

		System.out.println(hashMap);//{Java=104, Chiluka=101, Developer=150, Software=108, Madhan=100}
		System.out.println(hashMap.put("Java", 500));//104
		
		Set set = hashMap.keySet();
		System.out.println(set);//[Java, Chiluka, Developer, Software, Madhan]
		
		Collection collection= hashMap.values();
		System.out.println(collection);//[104, 101, 150, 108, 500]
		
		Set set2= hashMap.entrySet();
		System.out.println(set2);//[Java=500, Chiluka=101, Developer=150, Software=108, Madhan=100]
		
		Iterator iterator = set2.iterator();
		while(iterator.hasNext()) {
			Map.Entry map = (Entry) iterator.next();
			System.out.println(map.getKey()+"____"+map.getValue());
		
			if (map.getKey().equals("Madhan")) {
				map.setValue(1000);
			}
		}System.out.println(hashMap);//{Java=500, Chiluka=101, Developer=150, Software=108, Madhan=1000}

		
		
		
	}

}
