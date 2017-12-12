package com.Mitnick.designmodel.factory;

/**
 * @author niezhenjie
 * 
 */
public class Teana extends Car implements FactoryCar{

	@Override
	public Car createCar() {
		return new Teana();
	}

}
