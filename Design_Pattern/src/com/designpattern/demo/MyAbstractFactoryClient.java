package com.designpattern.demo;

import java.util.Scanner;

public class MyAbstractFactoryClient {

	public static void main(String[] args) {
		Scanner inn=new Scanner(System.in);
		System.out.println("Please enter vehicle type");
		String input=inn.nextLine().toLowerCase().trim();
		Factory factory;
		try {
			factory=Factory.getFactory(input);
			Engine e=factory.getEngine();
			e.design();
			e.manufacture();
			e.test();
			Tyre t=factory.getTyre();
			t.design();
			t.manufacture();
			
			
			
			
		} catch (UnknownVehicleTypeException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid vehicle type");
			e.printStackTrace();
		}
		
	
		
		
	}

}
