package designpattern.behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	private String name;
	private int cvv;
	private String cardNumber;
	private String dateOfExpiry;
	
	public CreditCardPaymentStrategy(String name, int cvv, String cardNumber, String dateOfExpiry) {
		this.name = name;
		this.cvv = cvv;
		this.cardNumber = cardNumber;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " payed using Credit Card number " + this.cardNumber);
	}

}
