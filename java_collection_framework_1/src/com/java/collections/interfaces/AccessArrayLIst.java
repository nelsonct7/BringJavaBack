package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccessArrayLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits= new ArrayList<String>();
		System.out.println("Initial state of Array list "+fruits.isEmpty());
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Avacado");
		fruits.add("Cherry");
		System.out.println("Status after adding items in to Array list "+fruits.isEmpty());
		
		// access elements in array list using index
		System.out.println("Third element in the array list "+fruits.get(3));
		// set a new item to index 
		System.out.println("Array list before addition "+fruits);
		fruits.set(3, "Watermelon");
		System.out.println("Modified array list "+fruits);
		System.out.println("Length of the array list "+fruits.size());
		// remove third element from array list
		fruits.remove(3);
		System.out.println("Length of the array list after removal "+fruits.size());
		System.out.println("Status of the array list after removal "+fruits);
		
		// iterate over the array list using index and normal for loop
		for(int i=0;i<fruits.size();i++) {
			System.out.println("Array List Item "+fruits.get(i)+" Index : "+i);
		}
		// iterate over the array list using iterator
		for(Iterator<String> it=fruits.iterator(); it.hasNext();) {
			String item=it.next();
			System.out.println("Item in array list using iterator "+item	);
		}
		// iterate through while loop
		Iterator<String> it=fruits.iterator();
		while(it.hasNext()) {
			String item=it.next();
			System.out.println("Array ist item iterate using iterator in while loop "+item);
		}
		
		// iterate over the array list using lambda expression, and for each method
		fruits.stream().forEach(item->System.out.println("Array list item iteratred using foreach method "+item));
		fruits.forEach(item->System.out.println("Array list item iteratred using foreach method "+item));
		List<String> subFruits=new ArrayList<String>();
		subFruits.add("Banana");
		subFruits.add("Orange");
		subFruits.add("Apple");
		
		// remove multiple items from an array list using sub array list
		fruits.removeAll(subFruits);
		System.out.println("Array list status afte removing sub array list "+fruits);
		// clear all  the items in an array list
		fruits.clear();
		System.out.println("Status of the array list after clearing it "+fruits);
		
	}

}
