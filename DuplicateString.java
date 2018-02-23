package com.Myprograms;

import java.util.HashSet;

public class DuplicateString {

	public static void main(String[] args) {
    String s = "helloooo sasisssii";
    
    StringBuilder sb = new StringBuilder();
    
    HashSet<Character>  hs = new HashSet<Character> ();
    
    for(int i=0; i<s.length(); i++){
    	
    	if(!hs.contains(s.charAt(i))){
    		
    		sb.append(s.charAt(i));
    	
    		hs.add(s.charAt(i));
    	}
    }
    System.out.println(sb);
  
   
    
	}

}
