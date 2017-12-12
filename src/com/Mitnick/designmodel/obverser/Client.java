package com.Mitnick.designmodel.obverser;

/**
 * @author niezhenjie
 * 
 */
public class Client {
	public static void main(String[] args) {
		Observable observable = new Observable(); //实例化一个被观察者
		ConcreteObserver1 o1 = new ConcreteObserver1();//实例化一个观察者
		ConcreteObserver2 o2 = new ConcreteObserver2();//实例化一个观察者
		observable.addObserver(o1); //添加一个观察者
		observable.addObserver(o2); //添加一个观察者
		
		observable.changed(); //被观察者发生了变化 一旦发生了变化 就会通知所有观察他的对象
		
	}

}
