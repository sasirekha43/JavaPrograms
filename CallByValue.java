package com.Myprograms;

public class CallByValue {
	public void display(int y)
	  {
	    y = 20;
	    System.out.println(y);
	  }
	  public static void main(String args[])
	  {
	    CallByValue cbv = new CallByValue();
	    int x = 10;
	    cbv.display(x);
	    System.out.println(x);                        // prints 10 and not 20    
	  }
}
