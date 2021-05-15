package com.java.notifierImpl;

import com.java.notifier.Notifier;

public class SMSNotification implements Notifier {

	@Override
	public void notifyMessage() {
		System.out.println("SMS Notification");

	}

}
