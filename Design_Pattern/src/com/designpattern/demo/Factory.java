package com.designpattern.demo;

public abstract class Factory {
	private static Factory carFactory=null;
	private static Factory trukFactory=null;
	
	public abstract Engine getEngine();
	public abstract Tyre getTyre();
	
	public static Factory getFactory(String vehicleType) throws UnknownVehicleTypeException {
		if(vehicleType==null) {
			return null;
		}
		return carFactory;
	}

}
