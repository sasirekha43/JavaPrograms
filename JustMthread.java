package com.Myprograms;
class me extends Thread
{
public int name,i;
public void run()
{
    for(i=1;i<=10;i++)
    {
        System.out.println("Thread" + name + " : " + i);
        try
        {
            sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("some problem");
        }
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