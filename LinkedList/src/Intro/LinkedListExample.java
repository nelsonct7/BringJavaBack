package Intro;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	private LinkedList<String> fruits= new LinkedList<String>();
	
	void addOperations() {
		System.out.println("Initial state of the linked list before addition operation "+fruits);
		// add item using add()
		this.fruits.add("Banana");
		this.fruits.add("Mango");
		this.fruits.add("Avacado");
		this.fruits.add("Orange");
		this.fruits.add("Apple");
		this.fruits.add("Jackfruit");
		this.fruits.add("Banana");
		System.out.println("Status of the linked list before addFirst operation "+fruits);
		// add item at the first index of linked list
		this.fruits.addFirst("Grapes");
		System.out.println("Status of linked list after  adding element to the first place "+fruits);
		// add item to the last index of the array list
		this.fruits.addLast("Promangnate");
		System.out.println("Status of linked list after adding element to the last palce "+fruits);
		
	}
	void getOperations() {
		String first =this.fruits.getFirst();
		String last=this.fruits.getLast();
		String third =this.fruits.get(3);
		System.out.println("First element in linked list "+first);
		System.out.println("Last element in linked list "+last);
		System.out.println("Third element in linked list "+third);
		System.out.println("All elements in linked list ");
		for(String item:this.fruits) {
			System.out.println("Linked list element "+item);
		}
	}
	void traversOperations() {
		System.out.println("Does fruits list contains Coconut"+this.fruits.contains("Coconut"));
		System.out.println("Does fruits list contains Mango "+this.fruits.contains("Mango"));
		System.out.println("The index for Banana "+this.fruits.indexOf("Banana"));
		this.fruits.add("Banana");
		System.out.println("The last index of Banana "+this.fruits.lastIndexOf("Banana"));
		
		Iterator<String> it=this.fruits.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator element "+it.next());
		}
		this.fruits.forEach(element->System.out.println("For each element "+element));
	}
	void removeOperations() {
		System.out.println("Status of the linkedlist before remove operations "+this.fruits);
		this.fruits.removeFirst();
		System.out.println("Status of the linkedlist after removing first element "+this.fruits);
		this.fruits.removeLast();
		System.out.println("Status of the linkedlist after removing the last element "+this.fruits);
		this.fruits.remove(3);
		System.out.println("Status of the linked list after removing 3rd element "+this.fruits);
		@SuppressWarnings("unchecked")
		LinkedList<String> clone=(LinkedList<String>) this.fruits.clone();
		System.out.println("Cloned operations "+clone);
		this.fruits.clear();
		System.out.println("Status of the linkedlist ater clearing "+this.fruits);
		
	}
}
