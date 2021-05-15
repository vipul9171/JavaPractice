package com.java.factory;

public class FactoryMain 
{
	public static void main(String[] args) {
		Notifier notifier= NotificationFactory.getInstance("email");
		notifier.notifyMessage();
	}

}
