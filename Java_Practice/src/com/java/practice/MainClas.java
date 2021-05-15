package com.java.practice;



public class MainClas {
	public static void main(String[] args) {}
	
	public int solution(int number) {
	    int sum=0;
	    for(int i=0;i<number;i++)
	     {
	      if((i%5==0)||(i%3==0))
	        {
	    	  sum += i;
	        }
	      
	      
	    }
	    return sum;
	  }

}
