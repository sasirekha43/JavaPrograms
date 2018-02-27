package com.Myprograms;  
import java.util.StringTokenizer;
public class SimpleToken {
	
	public static void main(String args[]){  
		   StringTokenizer st = new StringTokenizer("my name is Nani sasi");  
		   System.out.println(st.countTokens());
		     while (st.hasMoreTokens()) {  
		    	
		         System.out.println(st.nextToken());  
		         //System.out.println(st.nextToken(",");//my: without while 
		     }  
		   }  
}
