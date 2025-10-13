package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> fruitsCollection=new ArrayList<String>();
		fruitsCollection.add("Banana");
		fruitsCollection.add("Apple");
		fruitsCollection.add("Orrange");
		System.out.println("Content in fruits collection "+fruitsCollection);
		if(fruitsCollection.contains("Apple")) {
			fruitsCollection.forEach(item->System.out.println("Item "+item));
		}
		fruitsCollection.clear();
		System.out.println("Contents after clearing everything "+fruitsCollection);
	}

}
