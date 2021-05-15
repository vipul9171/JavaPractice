package com.java.mainProcessor;

import com.java.notifier.Notifier;

public class NotificationMain 
{
	public static void main(String[] args) {
		NotificationFactory factory=new NotificationFactory();
		Notifier notifier=factory.getInstance("Email");
		notifier.notifyMessage();
	}

}
