package designpattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImpl implements ShoppingCart {
	private List<Items> items;
	
	public ShoppingCartImpl() {
		this.items = new ArrayList<>();
	}
	
	public void addItems(Items item) {
		items.add(item);
	}
	
	public void removeItem(Items item) {
		items.remove(item);
	}
	
	public int calculatePrice() {
		int total = 0;
		for (Items item : items) {
			total += item.getPrice();
		}
		
		return total;
	}
	
	public void pay(PaymentStrategy paymentStrategy) {
		paymentStrategy.pay(this.calculatePrice());
	}
}
