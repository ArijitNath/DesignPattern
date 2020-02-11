package designpattern.creational.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				BillPughSingleton s = BillPughSingleton.getInstance();
				System.out.println(s);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				BillPughSingleton s1 = BillPughSingleton.getInstance();
				System.out.println(s1);
			}
		});
		
		t1.start();
		t2.start();
	}
}
