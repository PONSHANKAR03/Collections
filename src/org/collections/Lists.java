package org.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lists {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(10);
	l.add("java");
	l.add(true);
	l.add(45.34f);
	l.add(500);
	l.add(10);
	l.add("java");
	l.add('M');
	System.out.println(l);
	
	//size();
	int size = l.size();
	System.out.println(size);
	
	//indexOf
	int indexOf = l.indexOf("java");
	System.out.println(indexOf);
	
	//lastIndexOf
	int lastIndexOf = l.lastIndexOf("java");
	System.out.println(lastIndexOf);
	
	//contains
	boolean contains = l.contains(500);
	System.out.println(contains);
	
	//remove
	l.remove(0);
	System.out.println(l);

    //get
	Object object = l.get(0);
	System.out.println(object);
	
	Object object2 = l.get(1);
	System.out.println(object2);
	
	//for loop
	for(int i = 0;i<l.size();i++) {
		Object object3 = l.get(i);
		System.out.println(object3);
	}
	//for each
	for(Object m:l) {
		System.out.println(m);
	}
	
	List<Integer> l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	System.out.println(l1);

	List <Integer> l2=new Vector();
	l2.add(10);
	l2.add(20);
	l2.add(300);
	l2.add(400);
	l2.add(500);
	System.out.println(l2);
////	remove all
//	l1.removeAll(l2);
//	System.out.println(l1);
	
	//retain all
	l1.retainAll(l2);	
	System.out.println(l1);
	
	//add all
	Vector l3=new Vector();
	System.out.println(l3);
	
	l3.addAll(l2);
	System.out.println(l3);
	
	//clear
	l3.clear();
	System.out.println(l3);
	
	//add
	l2.add(0,3000);
	System.out.println(l2);
	
	//set
	l2.set(1,2000);
	System.out.println(l2);
	
}
}