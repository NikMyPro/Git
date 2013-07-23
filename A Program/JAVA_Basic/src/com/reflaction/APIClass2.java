package com.reflaction;
public class APIClass2{
 
	private int counter;
 
	private void printIt(){
		System.out.println("printIt() no param");
	}
 
	private void printItString(String temp){
		System.out.println("printIt() with param String : " + temp);
	}
 
	private void printItInt(int temp){
		System.out.println("printIt() with param int : " + temp);
	}
 
	private void setCounter(int counter){
		this.counter = counter;
		System.out.println("setCounter() set counter to : " + counter);
	}
 
	private void printCounter(){
		System.out.println("printCounter() : " + this.counter);
	}
}
