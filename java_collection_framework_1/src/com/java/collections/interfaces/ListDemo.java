package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		/** 
		 * 1. List is an ordered collection, which maintains the insertion order, which means when displaying
		 * the list items, it will list he items in the same order as they were inserted in to the list
		 * 2. Java list provides control over the places where you insert the items
		 * 3. You can access items by their index and also search the items in the list
		 * 4. List allow you to add duplicate elements
		 * 5. List allow you to add null elements
		 * 6. List index start from 0 like arrays
		 * 7. Some of the list implementation classes are, ArrayList, LinkedList,  Vector, Stack, CopyOnWriteArrayList
		 * */
		
		List<String> listObj=new ArrayList<String>();
		listObj.add("Nelson");
		listObj.add("Hari");
		listObj.add(null);
		listObj.add("Nelson");
		System.out.println("List items in the listObj "+listObj);
		
		/**
		 * ArrayList class overview
		 * 1. ArrayList is a resizable array, also called dynamic array,
		 * it resizes its capacity to accommodate new elements and shrink it self once elements are removed from the array
		 * 2. ArrayList internally uses array to store the elements and allows you to access the elements using index values
		 * 3. ArrayList allows null and duplicate values
		 * 4. ArrayList maintains the insertion order
		 * 5. You can not create ArrayList with premitieve data types like int, char,..etc
		 * you need to use boxed classes or wrapper classes like Integer, String..etc to define the items in the arrayList
		 * 6. Java ArrayList is not Synchronized, its not thread safe, if multiple threads access the same array list
		 * then the final outcome is not predictable, if you are using multiple threads to modify an array list, you need to explicitly
		 * control the thread access.
		 */
		
		List<String> item1=new ArrayList<String>(50); // by default the array list is max contain 10 elements, if you specify the limit, it will change the size accordingly
		item1.add("test");
		item1.add("test1");
		item1.add("test2");
		item1.add("test3");
		
		System.out.println("List item 1" +item1);
		// can create new array list from and existing array list
		List<String> item2=new ArrayList<String>(item1);
		System.out.println("Array list item2 generated from array list item1 "+item2);
		// you can use addAll method to add all items in one array list to new one
		List<String> item3=new ArrayList<String>();
		item3.addAll(item1);
		item3.addAll(item2);
		System.out.println("Item in the concatnated array list "+item3);
	}

}
