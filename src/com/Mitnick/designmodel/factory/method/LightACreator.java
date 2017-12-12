package com.Mitnick.designmodel.factory.method;

/**
 * 工厂方法模式
 * 
 * 生产具体的产品LightA
 * 
 * 这是一个具体产品队应的工厂 每个产品对应一个属于自己的工厂 该具体工厂需要实现抽象的工厂类Creator
 * 
 * @author Mitnick
 * 
 */
public class LightACreator implements Creator {
	@Override
	public Light createLight() {
		return new LightA();
	}

}

/**
 * 工厂方法模式
 * 
 * 生产具体的产品LightB
 * 
 * 这是一个具体产品队应的工厂 每个产品对应一个属于自己的工厂 该具体工厂需要实现抽象的工厂类Creator
 * 
 * @author Mitnick
 * 
 */
class LightBCreator implements Creator {

	@Override
	public Light createLight() {
		return new LightB();
	}

}
