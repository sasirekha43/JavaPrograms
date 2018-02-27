package com.Myprograms;
 class Descending extends Thread{
	public void run(){
		for(int i=10;i>0;i--){
			System.out.println("The descending order of thread is:"+i);
		}
	}
}
public class DescendingThread {
public static void main(String args[]){
	new Descending().start();
}
}
