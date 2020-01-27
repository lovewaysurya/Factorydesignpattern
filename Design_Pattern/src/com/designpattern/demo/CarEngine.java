package com.designpattern.demo;

public class CarEngine implements Engine {

	@Override
	public void design() {
		System.out.println("Car Engine Design");
		
	}

	@Override
	public void manufacture() {
		System.out.println("Car Engine Manufacture");
		
	}

	@Override
	public void test() {
		System.out.println("Car Engine Test");
		
	}

}
