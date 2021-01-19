package in.flyspark.dp.creational.factory;

public class NotificationFactory {

	public static Notification getNotificationExecutor(String notificationType) {
		if ("Email".equals(notificationType))
			return new EmailNotification();
		if ("SMS".equals(notificationType))
			return new SMSNotification();
		return null;
	}
}
