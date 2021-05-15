package com.java.singleton;

public class EagerWayOfSingleton 
{
	private EagerWayOfSingleton()
	{
		
	}
	private static final EagerWayOfSingleton SINGLETON=new EagerWayOfSingleton();
	
	private static EagerWayOfSingleton getInstance()
	{
		return SINGLETON;
	}

}
