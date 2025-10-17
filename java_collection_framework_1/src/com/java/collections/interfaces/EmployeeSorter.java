package com.java.collections.interfaces;

import java.util.Comparator;


public class EmployeeSorter implements Comparator<Employee>{
	private String sortItemName="name";
	private String sortOrder="asc";
	
	public String getSortItemName() {
		return sortItemName;
	}

	public void setSortItemName(String sortItemName) {
		this.sortItemName = sortItemName;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		if(this.sortOrder=="asc") {
			switch(sortItemName) {
			case "name":{
				if( arg0.getName().equals(arg1.getName())) {
					return 1;
				}
				return 0;	
			}
			case "salary":{
				return (int) ((int)arg0.getSalary()-arg1.getSalary());
			}
			case "age":{
				return arg0.getAge()-arg1.getAge();
			}
			default:{	
				return arg0.getId()-arg1.getId();
			}
			}		
		}else {
			switch(sortItemName) {
			case "name":{
				if( arg1.getName().equals(arg0.getName())) {
					return 1;
				}
				return 0;	
			}
			case "salary":{
				return (int) ((int)arg1.getSalary()-arg0.getSalary());
			}
			case "age":{
				return arg1.getAge()-arg0.getAge();
			}
			default:{	
				return arg1.getId()-arg0.getId();
			}
			}
		}
	}

}
