package designpattern.structural.decorate;

public class BeefyHeaven extends Pizza {

	public BeefyHeaven() {
		description = "Beefy Heaven";
	}
	
	@Override
	public int cost() {
		return 350;
	}
}
