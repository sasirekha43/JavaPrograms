package com.Myprograms;
class me extends Thread
{
public int name;
public static int t=1;
public void run()
{
    for(int i=1;i<=25;i++)
    {

    	System.out.println("Thread" + name+ " : " + t);
    	t++;
   
    }
}
}
public class JustMthread {
	public static void main(String[] args)
	{
	    me a=new me();
	    me b=new me();
	   a.name=1;
	   b.name=2;
	    a.start();
	    b.start();
}
}