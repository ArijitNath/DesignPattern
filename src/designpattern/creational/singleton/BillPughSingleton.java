package designpattern.creational.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {}
	
	public static BillPughSingleton getInstance() {
		return BillPughSingletonBuilder.INSTANCE;
	}
	
	private static class BillPughSingletonBuilder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton(); 
	}
}
