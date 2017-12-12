package com.Mitnick.designmodel.factory;

/**
 * @author Mitnick
 * 
 */
public class Highlander extends Car implements FactoryCar {

	@Override
	public Car createCar() {
		return new Highlander();
	}

}
