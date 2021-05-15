package com.java.notifierImpl;

import com.java.notifier.Notifier;

public class EmailNotification implements Notifier {

	@Override
	public void notifyMessage() {
		System.out.println("Email Notification");

	}

}
