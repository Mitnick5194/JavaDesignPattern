package com.Mitnick.designmodel.factory.simple;

import com.Mitnick.designmodel.factory.Car;
import com.Mitnick.designmodel.factory.Highlander;

/**
 * @author Mitnick
 * 
 */
public class Customer {

	public static void main(String[] args) {
		Highlander hld = new Highlander();
		Car c1 = hld.createCar();
		c1.setHeight(170);
		System.out.println(c1.getHeight());
	}
	
}
