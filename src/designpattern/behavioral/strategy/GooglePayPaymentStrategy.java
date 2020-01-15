package designpattern.behavioral.strategy;

public class GooglePayPaymentStrategy implements PaymentStrategy {
	
	private String googlePayUPI;
	
	public GooglePayPaymentStrategy(String googlePayUPI) {
		this.googlePayUPI = googlePayUPI;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " payed using Google Pay UPI " + this.googlePayUPI);
	}
}
