package com.java.singleton;

public class LazyInitialization 
{
	 private LazyInitialization()
	 {
		 
	 }
	 
	 private static LazyInitialization initialization;
	 
	 public LazyInitialization getInstance()
	 {
		if(initialization==null)
		{
			return new LazyInitialization();
		}
		return initialization;
	 }

}
