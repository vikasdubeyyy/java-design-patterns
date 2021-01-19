package in.flyspark.dp.creational.factory;

public class SMSNotification implements Notification {

	public void sendNotification() {
		System.out.println("SMS notification sent.");
	}
}