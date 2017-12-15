package com.ajie.designmodel.prototype;

/**
 * 原型模式 实现Cloneable接口（只要实现了这个接口 就能使用Object对象提供的clone本地方法）
 * 
 * @author Mitnick
 * 
 */

class SimplePrototype implements Cloneable {
	private int x;
	private int y;
	private int z;

	public SimplePrototype() {
		System.out.println("执行prototype构造函数");
		x = 3;
		y = 4;
		z = 5;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void change() {
		this.x = 300;
		this.y = 400;
		this.z = 500;
	}
	
	public int getZ() {
		return this.z;
	}

	public String toString() {
		return "[" + x + " " + y + " " + z + "]";
	}

	public SimplePrototype clone() {
		try {
			return (SimplePrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
