package com.java.factory;

public class NotificationFactory {

	public static Notifier getInstance(String channel) {
		if (channel.equalsIgnoreCase("SMS")) {
			return new SMSNotification();

		}
		if (channel.equalsIgnoreCase("EMAIL")) {
			return new EmailNotification();

		}
		return null;

	}

}
