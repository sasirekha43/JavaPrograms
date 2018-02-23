package com.Myprograms;

public class simple {
	static final int a;
	static{
		a=100;
	}
	final int b;
	simple(){
		b=122;
	}
	
	void run(){
		
	System.out.println(a);
	System.out.println(b);
	}
	public static void main(String args[]){
		final StringBuffer sb = new StringBuffer("saas");
		sb.append("Sasi");
		System.out.println(sb);
		simple s = new simple();
		s.run();
		
	}

}
