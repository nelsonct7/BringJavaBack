package com.java.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	private Map<String, Employee> empMap=new HashMap<String, Employee>();
	
	public void addOperations() {
		System.out.println("Status of the hashmap before insertion "+this.empMap);
		
		this.empMap.put("emp-id-100", new Employee("Hari", 10000, 25));
		this.empMap.put("emp-id-101", new Employee("Das", 20000, 35));
		this.empMap.put("emp-id-102", new Employee("Giri", 80000, 35));
		this.empMap.put("emp-id-103", new Employee("Stephen", 30000, 55));
		this.empMap.put("emp-id-104", new Employee("Dhanya", 30000, 45));
		this.empMap.put("emp-id-105", new Employee("Henny", 40000, 40));
		
		System.out.println("Status of the hashmap after insertion "+this.empMap);
	}
	public void statusOperations() {
		System.out.println("Is the emp map is empty "+this.empMap.isEmpty());
		System.out.println("Size of the emp map is "+this.empMap.size());
		System.out.println("Does the emp map conatins employee with id emp-id-105 "+this.empMap.containsKey("emp-id-105"));
		System.out.println("Does the emp map conatins employee with id emp-id-107 "+this.empMap.containsKey("emp-id-107"));
		Set<String> mapKeys	=this.empMap.keySet();
		System.out.println("Keys in emp map is "+mapKeys);
		Collection<Employee> mapValues=this.empMap.values();
		System.out.println("Values in the emp map "+mapValues	);
	}
	public void iterateOperations() {
		// using enhanced for loop
		for(Map.Entry<String, Employee> entries	:this.empMap.entrySet()) {
			System.out.println("Map key "+entries.getKey()+"Map values "+entries.getValue().toString());
		}
		// using iterator
		Set<Map.Entry<String, Employee>> entries=this.empMap.entrySet();
		Iterator<Map.Entry<String, Employee>> iterator=entries.iterator();
		while(iterator.hasNext()) {
			System.out.println("The map item using iterator key : "+iterator.next().getKey()+" Values : "+iterator.next().getValue().toString())	;
		}
		// using jdk8 forEach method
		this.empMap.forEach((K,V)->System.out.println("The map item using foreach key : "+K+" Value : "+V.toString()	));
	}
	public void removeOperations() {
		System.out.println("Status of the map before removing the key emp-id-102 "+this.empMap);
		this.empMap.remove("emp-id-102");
		System.out.println("Status of the map after removing the key emp-id-102 "+this.empMap);
		// removes the key only if the value mapped by the key is the value	
		this.empMap.remove("emp-id-105", new Employee("Nelson", 40000, 40));
		// clear the map completely
		this.empMap.clear();
		System.out.println("Status of the emp map after clearing the map "+this.empMap);
	}
}
