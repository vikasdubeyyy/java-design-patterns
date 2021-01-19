package in.flyspark.dp.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		// create subject
		Topic topic = new Topic();

		// create observers
		Observer obj1 = new TopicSubscriber("Obj1");
		Observer obj2 = new TopicSubscriber("Obj2");
		Observer obj3 = new TopicSubscriber("Obj3");

		// register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);

		// attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);

		// check if any update is available
		obj1.update();

		// now send message to subject
		topic.postMessage("New Message");

		topic.unregister(obj2);

		// topic.unregister(obj2);
		topic.postMessage("2nd message");

	}

}