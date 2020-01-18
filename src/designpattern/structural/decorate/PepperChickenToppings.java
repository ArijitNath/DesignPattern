package designpattern.structural.decorate;

public class PepperChickenToppings extends PizzaToppings {

	private Pizza pizza;
	
	public PepperChickenToppings(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String description() {
		return pizza.description() + ", with Pepper Chicken Toppings";
	}

	@Override
	public int cost() {
		return pizza.cost() + 50;
	}
}
