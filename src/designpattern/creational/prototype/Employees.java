package designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private List<String> allEmployees;
	
	public Employees() {
		allEmployees = new ArrayList<>();
	}
	
	public Employees(List<String> allEmployees) {
		this.allEmployees = allEmployees;
	}
	
	public void loadData() {
		allEmployees.add("Arijit");
		allEmployees.add("Ritchie");
		allEmployees.add("Nath");
	}
	
	public List<String> getEmployeeList() {
		return allEmployees;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> clonedEmployees = new ArrayList<>();
		
		for(String emp : this.getEmployeeList()) {
			clonedEmployees.add(emp);
		}
		
		return new Employees(clonedEmployees);
	}
}
