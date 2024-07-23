package com.example.demo;

public class VisitorNumberSinglton {
	private static VisitorNumberSinglton instance;
	public int counter;
	
	private VisitorNumberSinglton() {}
	
	public static VisitorNumberSinglton getInstance() {
		if(instance==null) {
			instance= new VisitorNumberSinglton();
		}
			return instance;
		
	}
	
	public void getVisitorsNumber(int counter) {
		System.out.println("The number of visitors to the app is: "+ counter);
	}
	
}
	
