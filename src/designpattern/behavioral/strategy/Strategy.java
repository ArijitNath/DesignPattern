package designpattern.behavioral.strategy;

public class Strategy {

	public static void main(String[] args) {
		Items item1 = new Items("1001", "Biscuit", 30);
		Items item2 = new Items("1002", "Paneer", 90);
		
		ShoppingCart sc = new ShoppingCartImpl();
		sc.addItems(item1);
		sc.addItems(item2);
		
		PaymentStrategy cc = new CreditCardPaymentStrategy("Arijit", 000, "123456", "002255");
		PaymentStrategy googlePay = new GooglePayPaymentStrategy("ari@upi.com");
		
		sc.pay(cc);
		sc.pay(googlePay);		
	}
}
