package com.Myprograms;

public class CallByReference {
	
	 public void display(StringBuffer sb2)
	  {
	    sb2.append("Rekha");
	    System.out.println(sb2);                       // prints HelloWorld
	  }

public static void main(String args[])
{
  CallByReference cbr = new CallByReference();
  StringBuffer sb1 = new StringBuffer("Sasi");
  cbr.display(sb1);
  System.out.println(sb1);                       // prints HelloWorld
}
}  