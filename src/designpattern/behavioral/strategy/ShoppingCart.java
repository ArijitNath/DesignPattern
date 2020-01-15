package designpattern.behavioral.strategy;

public interface ShoppingCart {
	void addItems(Items item);
	void removeItem(Items item);
	int calculatePrice();
	void pay(PaymentStrategy paymentStrategy);
}
