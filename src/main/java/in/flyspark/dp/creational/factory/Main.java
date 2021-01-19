package in.flyspark.dp.creational.factory;

public class Main {

	public static void main(String[] args) {
		NotificationFactory.getNotificationExecutor("Email").sendNotification();
		NotificationFactory.getNotificationExecutor("SMS").sendNotification();
	}
}