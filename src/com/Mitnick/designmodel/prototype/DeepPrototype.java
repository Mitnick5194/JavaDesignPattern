package com.ajie.designmodel.prototype;

/**
 * 原型模式 实现Cloneable接口（只要实现了这个接口 就能使用Object对象提供的clone本地方法）
 * 
 * 
 * 实现深复制 引用的对象必须也得实现Cloneable接口并重写clone方法 将所有引用类型的属性全部拷贝一遍
 * 
 * @author Mitnick
 * 
 */

class DeepPrototype implements Cloneable {
	private int x;
	private int y;
	private int z;
	private User2 user;

	public DeepPrototype() {
		System.out.println("执行prototype构造函数");
		x = 3;
		y = 4;
		z = 5;
		this.user = new User2("Mitnick", "male");
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

	public DeepPrototype clone() {
		Object obj = null;
		try {
			obj = super.clone();
			((DeepPrototype) obj).user = this.user.clone(); // 调用引用对象的克隆函数
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (DeepPrototype) obj;
	}

}

class User2 implements Cloneable {

	private String userName;
	private String gender;

	public User2(String name, String gender) {
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

	protected User2 clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (User2) obj;
	}

}