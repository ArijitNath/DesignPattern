package designpattern.creational.singleton;

/*
 * Making the instance variable volatile does not make it thread safe
 * */

public class SingletonVolatileLazyInitialization {
	private static volatile SingletonVolatileLazyInitialization instance;
	
	private SingletonVolatileLazyInitialization() {}
	
	public static SingletonVolatileLazyInitialization getInstance() {
		if(instance == null)
			instance = new SingletonVolatileLazyInitialization();
		return instance;
	}
}
