package designpattern.structural.decorate;

public abstract class Pizza {
	
	String description = "Pizza";
	
	public String description() {
		return description;
	}
	
	public abstract int cost();
}
