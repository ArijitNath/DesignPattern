package designpattern.behavioral.observer;

public class ObserverImpl implements Observer {

	private String name;
	
	public ObserverImpl(String name) {
		this.name = name;
	}
	
	@Override
	public void update(int data) {
		System.out.println("New Data " + data + " observerd by " + this.name);
	}

}
