package designpattern.structural.decorate;

public class BarbequeToppings extends PizzaToppings {

	private Pizza pizza;
	
	public BarbequeToppings(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String description() {
		return pizza.description() + ", with Barbeque Toppings";
	}

	@Override
	public int cost() {
		return pizza.cost() + 70;
	}
}
