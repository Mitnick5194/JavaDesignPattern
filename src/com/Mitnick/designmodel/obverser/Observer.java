package com.Mitnick.designmodel.obverser;

/**
 * 观察者模式1
 * 
 * 这是观察者的行为 所有的观察者必须实现该接口 当被观察者发生变化需要通知所有观察他的对象时
 * 
 * 观察者此方法就会被调用
 * 
 * 
 * @author niezhenjie
 * 
 */
public interface Observer {

	void update(Observable o);

}
