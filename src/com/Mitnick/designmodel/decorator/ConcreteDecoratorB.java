package com.Mitnick.designmodel.decorator;

/**
 * @author niezhenjie
 * 
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	public void methodB(){
		System.out.println("被装饰其B装饰的方法");
	}
	public void method(){
		System.out.println("针对该方法加一层封装");
		super.method();
	}

}
