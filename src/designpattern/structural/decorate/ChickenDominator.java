package designpattern.structural.decorate;

public class ChickenDominator extends Pizza {

	public ChickenDominator() {
		description = "Chicken Dominator";
	}
	
	@Override
	public int cost() {
		return 300;
	}
}
