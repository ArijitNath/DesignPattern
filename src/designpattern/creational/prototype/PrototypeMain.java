package designpattern.creational.prototype;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emp1 = new Employees();
		emp1.loadData();
		System.out.println(emp1);
		System.out.println(emp1.getEmployeeList());
		
		Employees emp2 = (Employees) emp1.clone();
		System.out.println(emp2);
		System.out.println(emp2.getEmployeeList());
	}

}
