package com.java.mainProcessor;

import com.java.notifier.Notifier;
import com.java.notifierImpl.EmailNotification;
import com.java.notifierImpl.SMSNotification;

public class NotificationFactory {

	public Notifier getInstance(String channel) {
		if (channel.equals("SMS")) {
			return new SMSNotification();
		}
		if (channel.equals("Email")) {

			return new EmailNotification();
		}
		return null;

	}

}
