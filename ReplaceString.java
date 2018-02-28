package com.Myprograms;

public class ReplaceString {
public static void main(String args[]){
	String s1="Java is a programming language.Java is a platform.Java is an Island";
	String replaceString = s1.replace("Java","Oak");
	
	System.out.println(replaceString);
	System.out.println(replaceString.length());
	System.out.println(replaceString.toLowerCase());
	System.out.println(replaceString.toUpperCase());
	System.out.println(replaceString.trim());
	System.out.println(replaceString.charAt(1));
	
	StringBuffer sb=new StringBuffer("Hello "); 
	sb.append("Java");//now original string is changed  
	System.out.println(sb);//prints Hello Java
	sb.insert(1,"Java");
	System.out.println(sb);
}
}
