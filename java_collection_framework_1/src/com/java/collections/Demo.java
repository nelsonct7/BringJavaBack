package com.java.collections;

class Student{
	String name;
	int mark;
}
class Books{
	String name;
	int price;
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this project describes the requirement of a collections frame work in java
		// in java to store a value ,we need a variable
		int var1=12;
		// if we need to store 1000 values we need to create 1000 variables
		// to solve this java has the data structure named Arrays
		Integer arr[]=new Integer[1000];
		// limitations of an array
		// 1. arrays are limited by their size, we can not make them add more items than their size
		// 2. arrays are homogeneous , they can only contain specified type of items in it.
		Student stdArr[]=new Student[10];
		stdArr[0]=new Student();
		stdArr[1]=new Student();
		// if we try to add the Book as an item in to this then this throws compile time error
		//stdArr[2]=new Books();	
		// we can solve this by using the Parent class to create the values, and store the child class objects in it,
		Object objArra[]=new Object[1000];
		// now we can store both Book and Student in the array since the Object is the parent class of all the classes in Java
		objArra[0]=new Student();
		objArra[1]=new Books();
		objArra[2]=new Integer(10);
		objArra[3]=new String("Name");
		
		// the important limitation of Array is its not implemented as standard data structures,
		// means they dont have any ready made api support available.
		// to overcome this limitations we have Collections
		// collections are introduced in JDK 1.2
		
		// collections is group of individual objects as a single Unit.
		
	}

}
