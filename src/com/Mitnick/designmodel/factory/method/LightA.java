package com.Mitnick.designmodel.factory.method;

/**
 * @author Mitnick
 * 
 */
public class LightA implements Light{

	@Override
	public void turnOn() {
		System.out.println("Light A turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("Light A turn off");
	}
}

class LightB implements Light{

	@Override
	public void turnOn() {
		System.out.println("Light B turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("Light B turn off");
	}
	
	public void lightbMethod(){
		System.out.println("hello i am light b");
	}
}