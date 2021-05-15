package com.java.factory;

public class SMSNotification implements Notifier{

	@Override
	public void notifyMessage() {
		System.out.println("SMS Notification");
	}

}
