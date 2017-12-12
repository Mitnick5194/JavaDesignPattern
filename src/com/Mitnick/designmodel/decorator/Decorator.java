package com.Mitnick.designmodel.decorator;

/**
 * 装饰器模式
 * 
 * 这个就是装饰器的父类 需要实现被装饰的接口
 * 
 * 这里需要传入一个接口的实现类 如果不这么做的话 那么接口的实现类永远不会被调用（即接口没有实现）
 * 
 * 那么 调用接口的方法永远都会报没有实现错误
 * 
 * 这里定义一个方法 对接口的方法进行了包装（即装饰起来）
 * 
 * @author Mitnick
 * 
 */
public abstract class Decorator implements Component {
	Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	public void method() {
		component.method();
	}

}
