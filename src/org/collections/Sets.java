package org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
public static void main(String[] args) {
	Set s=new LinkedHashSet();
	s.add(10);
	s.add("java");
	s.add(true);
	s.add(34.34f);
	s.add(500);
	s.add(10);
	s.add("java");
	s.add('M');
	s.add(null);
	System.out.println(s);
	
	Set s1=new HashSet();
	s1.add("java");
	s1.add(true);
	s1.add(34.34f);
	s1.add(500);
	s1.add(10);
	s1.add("java");
	s1.add('M');
	s1.add(null);
	System.out.println(s1);
	
	Set<Integer> s2=new TreeSet();
	s2.add(10);
	s2.add(20);
	s2.add(05);
	s2.add(15);
	s2.add(07);
	s2.add(17);
	System.out.println(s2);

	int size = s.size();
	System.out.println(size);
	
	//contains
	boolean contains = s.contains("java");
	System.out.println(contains);
	
	//remove
	s.remove("java");
	System.out.println(s);
	
	Set <Integer> s3=new TreeSet();
	s3.add(20);
	s3.add(25);
	s3.add(15);
	s3.add(22);
	s3.add(10);
	s3.add(30);
	System.out.println(s3);
	
	s2.removeAll(s3);
	System.out.println(s2);
	
	//retains all 
	s2.retainAll(s3);
	System.out.println(s2);
	
	//add all
	s2.addAll(s3);
	System.out.println(s2);
	
	//clear 
	s3.clear();
	System.out.println(s3);
	
	//for each
	for(Object m:s) {
	System.out.println(m);
	
	}
	
	
	
}

}
