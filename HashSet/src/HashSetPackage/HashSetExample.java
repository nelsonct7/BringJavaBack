package HashSetPackage;
/**
 * Hash set can not contain duplicate values,
 * Hash set can contain null values but only one
 * Hash set is an unordered collection, it does not maintain the order in which it was inserted in to the set
 * Hash set use Hash map internally to store values
 * Hash set is not thread safe, if multiple threads try to interact with same hash set, it can cause non-deterministic out puts, 
 * you must explicitly  synchronize concurrent access to a hash set in multi threaded environment.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	Set<String> fruitsAndVeg=new HashSet<String>();
	Set<String> fruits=new HashSet<String>();
	Set<String> vegetables=new HashSet<String>();
	
	void addItemsToSet() {
		this.fruits.add("Banana");
		this.fruits.add("Mango");
		this.fruits.add("Jackfruit");
		this.fruits.add("Grapes");
		this.fruits.add("Orange");
		this.fruits.add("Papaya");
		this.fruits.add("Apple");
		System.out.println("Status of the fruits before adding the null values "+this.fruits);
		this.fruits.add(null);
		System.out.println("Status of the fruits after adding the null values "+this.fruits);
		List<String> veg=new ArrayList<String>();
		veg.add("Pumpkins");
		veg.add("Cabage");
		veg.add("Ladyfiger");
		veg.add("Ladyfiger");
		veg.add("Ladyfiger");
		veg.add("Beans");
		veg.add("Carrot");
		veg.add("Tomato");
		veg.add("Brinjal");
		System.out.println("Status of the vegetable array list after adding the values "+veg);
		// we can add a collection list to hash set.
		this.vegetables.addAll(veg);
		System.out.println("Status of the this.vegetable collection with items "+this.vegetables);
		Set<String> tempSet=new HashSet<String>(veg);
		System.out.println("Constructor instantiated hash set collection "+tempSet);
		this.fruitsAndVeg.addAll(veg);
		this.fruitsAndVeg.addAll(fruits);
		System.out.println("Status of the fruits vegetable combined collection "+this.fruitsAndVeg);
	}
	
	void traverseInHashSet() {
		// normal for loop
		for(String item : this.fruitsAndVeg) {
			System.out.println("item in fruits veg collection "+item);
		}
		// enhanced for loop with iterator
		for(Iterator<String> it=this.fruitsAndVeg.iterator(); it.hasNext();) {
			System.out.println("Hashset item from enhanced for loop "+it.next());
		}
		// while loop with iterator
		Iterator<String> itWhile=this.fruitsAndVeg.iterator();
		while(itWhile.hasNext()) {
			System.out.println("Hashset item from while loop "+itWhile.next());
		}
		// for each loop with lambda expression
		this.fruitsAndVeg.forEach(item->System.out.println("Item in hashset using foreach lambda"+item));
		// stream in hash set
		this.fruitsAndVeg.stream().filter(item->item!=null	&&	!item.equals("Banana")).forEach(filteredItem->System.out.println("Element in hash set after filtering "+filteredItem));;
	}
	
	void removeItemsFromHashSet() {
		System.out.println("Items in fruitsVeg hash set before removal "+this.fruitsAndVeg);
		this.fruitsAndVeg.remove("Banana");
		System.out.println("Status of fruitsVeg hash set after removal of Banana "+this.fruitsAndVeg);
		this.fruitsAndVeg.removeAll(this.fruits);
		System.out.println("Status of the fruitsVeg hash set after the removal of fruits "+this.fruitsAndVeg);
		this.fruits.clear();
		System.out.println("Clear all the items in the fruits collection "+this.fruits);
	}
}	
