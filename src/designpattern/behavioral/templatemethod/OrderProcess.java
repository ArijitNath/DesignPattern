package designpattern.behavioral.templatemethod;

public abstract class OrderProcess {
	public boolean isGift;
	
	public abstract void doSelect();
	public abstract void doPayment();
	
	public void giftWrap() {
		if(isGift) {
			System.out.println("Gift Wrap Successful!");
		}
		else {
			System.out.println("Gift Wrap Not Required!");
		}
	}
	
	public abstract void doDelivery();
	
	public void process(boolean isGift) {
		this.isGift = isGift;
		doSelect();
		doPayment();
		giftWrap();
		doDelivery();
	}
}
