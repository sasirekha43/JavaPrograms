package com.Myprograms;
class Acsending extends Thread{
	public void run(){
		
		for(int i=1;i<=15;i++){
			System.out.println("The Ascending order of thread is:" +i);
			
		}
	}
}
public class AcsendingThread {
public static void main(String args[]){
	new Acsending().start();
}
}
