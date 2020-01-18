package designpattern.structural.decorate;

public class MargeritaPizza extends Pizza {

	public MargeritaPizza() {
		description = "Margerita Pizza";
	}
	
	@Override
	public int cost() {
		return 200;
	}
}
