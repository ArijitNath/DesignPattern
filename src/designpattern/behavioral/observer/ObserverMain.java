package designpattern.behavioral.observer;

public class ObserverMain {
	public static void main(String[] args) {
		Subject subject = new SubjectImpl();
		
		ThreadSubject t = new ThreadSubject(subject);
				
		Observer o1 = new ObserverImpl("Arijit");
		Observer o2 = new ObserverImpl("Ritchie");
		subject.registerObserver(o1);
		subject.registerObserver(o2);
		
		t.start();
	}
}
