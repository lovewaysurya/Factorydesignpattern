package com.designpattern.demo;

public class TrukFactory extends Factory {

	@Override
	public Engine getEngine() {
		return new TruckEngine();
	}

	@Override
	public Tyre getTyre() {
		// TODO Auto-generated method stub
		return new TruckTyre();
	}

}
