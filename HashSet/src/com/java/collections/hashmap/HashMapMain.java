package com.java.collections.hashmap;

/**
 * Hashmap is a hash table based implementation of javas Map interface
 * A hashmap can not  contain duplicate key 
 * Java hashmap allows null values and null keys
 * Hashmap is unordered collection, it does not guarantee to maintain insertion order
 * Hashmap is not thread safe if multiple thread interact with same hash map, then the out put can be un-predictable
 * and you need to synchronise the hashmap manually to make it thread safe
 */
public class HashMapMain {

	public static void main(String[] args) {
		HashMapExample refObj=new HashMapExample();
		refObj.addOperations();
		refObj.statusOperations();
		refObj.iterateOperations();
		refObj.removeOperations();

	}

}
