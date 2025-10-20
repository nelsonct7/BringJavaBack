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
    int result = 0;

    switch (sortItemName) {
        case "name":
            result = arg0.getName().compareTo(arg1.getName());
            break;
        case "salary":
            result = Double.compare(arg0.getSalary(), arg1.getSalary());
            break;
        case "age":
            result = Integer.compare(arg0.getAge(), arg1.getAge());
            break;
        default: // assume "id"
            result = Integer.compare(arg0.getId(), arg1.getId());
            break;
    }

    // Reverse if descending
    if ("desc".equals(sortOrder)) {
        result = -result;
    }

    return result;
}	

}
