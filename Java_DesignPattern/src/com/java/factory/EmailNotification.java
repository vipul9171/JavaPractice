package com.java.factory;

public class EmailNotification implements Notifier {

	@Override
	public void notifyMessage() {
		System.out.println("Email Notification");

	}

}
