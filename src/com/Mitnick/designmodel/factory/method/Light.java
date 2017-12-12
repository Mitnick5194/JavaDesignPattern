package com.Mitnick.designmodel.factory.method;

/**
 * 工厂方法模式
 * 
 * 这是具体产品的抽象接口（抽象产品接口）
 * 
 * 每隔具体的产品必须实现该接口
 * 
 * @author niezhenjie
 * 
 */
public interface Light {

	public void turnOn();
	public void turnOff();
}
