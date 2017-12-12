package com.Mitnick.designmodel.decorator;

/**
 * 装饰器模式客户端
 * 
 * @author niezhenjie
 * 
 */
public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		ConcreteDecoratorA cdA = new ConcreteDecoratorA(component);
		cdA.methodA(); //访问装饰器扩展的方法
		cdA.method(); //访问被装饰器的方法
		
		ConcreteDecoratorB cdB = new ConcreteDecoratorB(component);
		cdB.methodB(); //访问装饰器扩展的方法
		cdB.method(); //访问被装饰器的方法
	}
	
}
