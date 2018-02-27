package com.Myprograms;
//import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflection {

	  public static void main(String[] args) {
	    Class<String> aClass = String.class;

	    // Get the methods
	    Method[] methods = aClass.getDeclaredMethods();

	    // Loop through the methods and print out their names
	    for (Method method : methods) {
	      System.out.println(method.getName());
	      
	      //Get the Field
	     // Field field = aClass.getDeclaredFields();
	     // for (Field fields : field){
	    //	  System.out.println(fields.getName());
	     // }
	    	 
	      
	    }
	  }
	}