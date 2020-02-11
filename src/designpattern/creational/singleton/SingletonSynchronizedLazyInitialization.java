package designpattern.creational.singleton;

public class SingletonSynchronizedLazyInitialization {
	private static SingletonSynchronizedLazyInitialization instance;
	
	private SingletonSynchronizedLazyInitialization() {}
	
	public synchronized static SingletonSynchronizedLazyInitialization getInstance() {
		if(instance == null)
			instance = new SingletonSynchronizedLazyInitialization();
		return instance;
	}
}
