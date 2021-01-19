package in.flyspark.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	public Topic() {
		this.observers = new ArrayList<>();
	}

	public void register(Observer obj) {
		if (obj == null)
			throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if (!observers.contains(obj))
				observers.add(obj);
		}
	}

	public void unregister(Observer obj) {
		synchronized (MUTEX) {
			observers.remove(obj);
		}
	}

	public void notifyObservers() {
		List<Observer> observersLocal = null;
		// synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}

	}

	public Object getUpdate(Observer obj) {
		return this.message;
	}

	// method to post message to the topic
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}