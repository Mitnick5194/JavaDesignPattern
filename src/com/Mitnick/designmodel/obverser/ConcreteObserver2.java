package com.Mitnick.designmodel.obverser;

/**
 *  观察者模式1
 *  
 *  这是观察者1 需要实现观察者接口 当被观察者通知时 通过接口的方法通知此对象
 * 
 * @author niezhenjie
 * 
 */
public class ConcreteObserver2 implements Observer {

	@Override
	public void update(Observable o) {
		System.out.println("我是观察者2 我已经观察到"+o.getClass().getSimpleName()+"的变化 并做出来相应的处理");
		
	}

}
