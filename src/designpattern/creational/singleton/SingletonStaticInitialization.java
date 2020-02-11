package designpattern.creational.singleton;

public class SingletonStaticInitialization {
	private static final SingletonStaticInitialization instance;
	
	static {
		instance = new SingletonStaticInitialization();
	}
	
	private SingletonStaticInitialization() {}
	
	public static SingletonStaticInitialization getInstance() {
		return instance;
	}
}
