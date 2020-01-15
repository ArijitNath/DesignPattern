package designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

	private List<Observer> allObservers = new ArrayList<>();
	
	@Override
	public void registerObserver(Observer o) {
		allObservers.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		allObservers.remove(o);
	}

	@Override
	public void notifyObserver(int data) {
		for(Observer o : allObservers) {
			o.update(data);
		}
	}
}
