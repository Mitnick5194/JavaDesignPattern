package com.Mitnick.designmodel.factory.method;

/**
 * 工厂方法模式
 * 
 * 抽象工厂接口（与简单的工厂模式不同 这是对简单工厂模式的抽象）
 * 
 * 此时 若要生产产品 则没生产一个产品 都会对应一个具体的工厂 即一个产品对应一个工厂（该具体工厂需要继承次接口）
 * 
 * @author niezhenjie
 * 
 */
public interface Creator {

	public Light createLight();
}
