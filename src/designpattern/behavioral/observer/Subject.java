package designpattern.behavioral.observer;

public interface Subject {
	void registerObserver(Observer o);
	void unregisterObserver(Observer o);
	void notifyObserver(int data);
}

