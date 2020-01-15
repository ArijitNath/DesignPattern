package designpattern.behavioral.observer;

public class ThreadSubject extends Thread {
	
	private Subject subject;
	private static int count;
	
	public ThreadSubject(Subject subject) {
		this.subject = subject;
		count = 10;
	}
	
	@Override
	public void run() {
		while(true) {
			if(count % 5 == 0) {
				subject.notifyObserver(count);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			count++;
		}
	}	
}
