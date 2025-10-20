package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		
		System.out.println("Sorting integer array list ");
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(4);
		numbers.add(8);
		numbers.add(66);
		numbers.add(14);
		numbers.add(5);
		// ascending order sorted
		Collections.sort(numbers);
		System.out.println("Ascendingly sorted array list "+numbers);
		// descending order sorted
		Collections.reverse(numbers);
		System.out.println("Descendingly sorted array list "+numbers);
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(0, "Name 1", 100000, 30));
		empList.add(new Employee(1, "Name 2", 500000, 10));
		empList.add(new Employee(2, "Name 3", 200000, 20));
		empList.add(new Employee(3, "Name 4", 600000, 40));
		empList.add(new Employee(4, "Name 8", 150000, 22));
		empList.add(new Employee(5, "Name 7", 80000, 25	));
		
		System.out.println("Unsorted employee list ");
		EmployeeSorter empSortObj=new EmployeeSorter();
		empList.forEach(empItem->System.out.println(empItem.toString()));
		System.out.println("======== Sort item "+empSortObj.getSortItemName()+" Sort order "+empSortObj.getSortOrder());
		// sort by name in ascending
		Collections.sort(empList, empSortObj);
		System.out.println("Sorted employee list by name in asc order 	");
		empList.forEach(empItem->System.out.println(empItem.toString()));
		// sort by name in descending
		empSortObj.setSortOrder("desc");
		Collections.sort(empList, empSortObj);
		System.out.println("Sorted employee list by name in desc order 	");
		System.out.println("======== Sort item "+empSortObj.getSortItemName()+" Sort order "+empSortObj.getSortOrder());
		empList.forEach(empItem->System.out.println(empItem.toString()));
		// sort by age in asc	
		empSortObj.setSortOrder("asc");
		empSortObj.setSortItemName("age");
		Collections.sort(empList, empSortObj);
		System.out.println("Sorted employee list by age in asc order 	");
		System.out.println("======== Sort item "+empSortObj.getSortItemName()+" Sort order "+empSortObj.getSortOrder());
		empList.forEach(empItem->System.out.println(empItem.toString()));
		// sort by age in desc
		empSortObj.setSortOrder("desc");
		Collections.sort(empList, empSortObj);
		System.out.println("Sorted employee list by age in asc order 	");
		System.out.println("======== Sort item "+empSortObj.getSortItemName()+" Sort order "+empSortObj.getSortOrder());
		empList.forEach(empItem->System.out.println(empItem.toString()));
		
		//comparator implementation using lambda function
		Collections.sort(empList, (obj1,obj2)->(int	)(obj1.getSalary()-obj2.getSalary()));
		System.out.println("Sorted employee list by salary using lambda expression 	with sort method in collection	");
		empList.forEach(empItem->System.out.println(empItem.toString()));
	}
	
}
