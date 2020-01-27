package com.designpattern.demo;

public class CarFactory extends Factory{

	@Override
	public Engine getEngine() {
		// TODO Auto-generated method stub
		return new CarEngine();
	}

	@Override
	public Tyre getTyre() {
		// TODO Auto-generated method stub
		return new CarTyre();
	}

}
