package org.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
public static void main(String[] args) {
	Map<String,Integer> m=new HashMap();
	m.put("CSK", 16);
	m.put("RCB", 20);
	m.put("RR", 10);
	m.put("MI", 20);
	m.put("GT", null);
	m.put("KXIP", 8);
	m.put("DC", null);
	m.put(null, 10);
	//random order
	System.out.println(m);
	
	Map<String,Integer> m1=new 	LinkedHashMap();
	m1.put("CSK", 16);
	m1.put("RCB", 20);
	m1.put("RR", 10);
	m1.put("MI", 20);
	m1.put("GT", null);
	m1.put("KXIP", 8);
	m1.put("DC", null);
	m1.put(null, 10);
	//insertion order
	System.out.println(m1);
	
	Map<String,Integer> m2=new TreeMap();
	m2.put("CSK", 16);
	m2.put("RCB", 20);
	m2.put("RR", 10);
	m2.put("MI", 20);
	m2.put("GT", null);
	m2.put("KXIP", 8);
	m2.put("DC", null);
	m2.put("LSG", 10);
	//ascending order
	System.out.println(m2);
	
	Map<String,Integer> m3=new Hashtable();
	m3.put("CSK", 16);
	m3.put("RCB", 20);
	m3.put("RR", 10);
	m3.put("MI", 20);
	m3.put("KXIP", 8);
	m3.put("LSG", 10);
	//random order
	System.out.println(m3);
	
	//contains key 
	boolean containsKey = m.containsKey("CSK");
	System.out.println(containsKey);
	
	//contains value 
	boolean containsValue = m.containsValue(20);
	System.out.println(containsValue);
	
	//remove
     m.remove("CSK");
     System.out.println(m);
     
     ////get
     Integer integer = m.get("RCB");
     System.out.println(integer);
	
     //key set
     Set<String> keySet = m.keySet();
     System.out.println(keySet);
     
     //key value
     Collection<Integer> values = m.values();
     System.out.println(values);
	
     
     //entry set
     Set<Entry<String,Integer>> entrySet = m.entrySet();
     for(Entry<String,Integer> e:entrySet){
     System.out.println(e);
     
     //get key
     String key = e.getKey();
     System.out.println(key);
     
     ////get value
     Integer value = e.getValue();
     System.out.println(value);
     System.out.println("pon");
     System.out.println("shankar");
     
     }
     
}
}
