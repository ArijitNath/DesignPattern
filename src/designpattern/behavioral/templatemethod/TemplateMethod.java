package designpattern.behavioral.templatemethod;

public class TemplateMethod {

	public static void main(String[] args) {
		OrderProcess netOrder = new NetOrder();
		netOrder.process(true);
		System.out.println();
		OrderProcess storeOrder = new StoreOrder();
		storeOrder.process(false);
	}
}
