package designpattern.structural.decorate;

public class Decorator {

	public static void main(String[] args) {
		Pizza cd = new ChickenDominator();
		Pizza bh = new BeefyHeaven();
		
		PizzaToppings b = new BarbequeToppings(bh);
		PizzaToppings pc = new PepperChickenToppings(cd);
		
		System.out.println(b.description());
		System.out.println(b.cost());
		
		System.out.println(pc.description());
		System.out.println(pc.cost());
	}

}
