package designpattern.behavioral.strategy;

public class Items {
	private String upcCode;
	private String name;
	private int price;
	
	public String getUpcCode() {
		return upcCode;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Items(String upcCode, String name, int price) {
		super();
		this.upcCode = upcCode;
		this.name = name;
		this.price = price;
	}
}
