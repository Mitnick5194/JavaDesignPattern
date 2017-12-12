package com.Mitnick.designmodel.decorator;

/**
 * 
 * 装饰器模式
 * 
 * 这就是具体的装饰器
 * 
 * @author niezhenjie
 * 
 */
public class ConcreteDecoratorA  extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	public void methodA(){
		System.out.println("被装饰器A扩展的方法");
	}
	public void method(){
		System.out.println("针对这方法加一层封装");
		super.method();
	}
	
	
}
