package com.Mitnick.designmodel.factory;

/**
 * @author niezhenjie
 * 
 */
public class Highlander extends Car implements FactoryCar {

	@Override
	public Car createCar() {
		return new Highlander();
	}

}
