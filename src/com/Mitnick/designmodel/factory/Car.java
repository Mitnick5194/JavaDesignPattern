package com.Mitnick.designmodel.factory;

/**
 * @author niezhenjie
 * 
 */
public abstract class Car {
	private String carname;
	private float width;
	private float height;
	private float length;
	
	
	
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}

}
