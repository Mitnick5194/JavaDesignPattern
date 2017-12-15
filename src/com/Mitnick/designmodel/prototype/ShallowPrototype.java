package com.ajie.designmodel.prototype;

/**
 * 原型模式 实现Cloneable接口（只要实现了这个接口 就能使用Object对象提供的clone本地方法）
 * 
 * 验证原型模式的复制是浅复制
 * 
 * 从打印的结果可以知道 复制前后的user是同一个对象 所以 Cloneable 的复制是浅复制
 * 
 * @author Mitnick
 * 
 */

class ShallowPrototype implements Cloneable {
	private int x;
	private int y;
	private int z;
	private User user;

	public ShallowPrototype() {
		System.out.println("执行prototype构造函数");
		x = 3;
		y = 4;
		z = 5;
		this.user = new User("Mitnick", "male");
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
		return "[" + x + " " + y + " " + z + " " + user + "]";
	}

	public ShallowPrototype clone() {
		try {
			return (ShallowPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

class User {
	private String userName;
	private String gender;

	public User(String name, String gender) {
		this.userName = name;
		this.gender = gender;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setSexual(String gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return this.userName;
	}

	public String getSexual() {
		return this.gender;
	}
}
